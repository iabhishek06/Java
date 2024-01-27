package SingletonDP.JDBCSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCSingleton {

    // Static instance of the JDBCSingleton class
    private static JDBCSingleton jdbcInstance = null;


    // JDBC Connection Parameters
    private final static String JDBC_URL = "jdbc:mysql://localhost:3306/temp";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "Mysql@123";
    private final static String TABLE = "products";


    // Private constructor to prevent instantiation outside of this class
    private JDBCSingleton(){
        // Ensure the MySQL JDBC driver is loaded
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
            throw new RuntimeException("Error loading MySQL JDBC driver");
        }
    }

    // Method to get the instance of the JDBCSingleton
    public static JDBCSingleton getJdbcInstance() {
        if(jdbcInstance == null){
            synchronized (JDBCSingleton.class){
                if(jdbcInstance == null){
                    jdbcInstance = new JDBCSingleton();
                }
            }
        }
        return jdbcInstance;
    }

    // Method to get a connection to the database
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
    }

}
