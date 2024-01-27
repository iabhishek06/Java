package SingletonDP.JDBCSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSingletonTest {

    public static void main(String[] args) {

        // Get the instance of the JDBCSingleton
        JDBCSingleton jdbcSingleton = JDBCSingleton.getJdbcInstance();

        try (Connection connection = jdbcSingleton.getConnection()){

            // perform DB operation using the connection
            Statement sta = connection.createStatement();
            ResultSet rs = sta.executeQuery("select versions from products where id = '104'");
            while(rs.next()){
                System.out.println(rs.getString("versions"));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }


        // Create two instance and compare hashcode if they are same (if same object)
//        JDBCSingleton obj1 = JDBCSingleton.getJdbcInstance();
//        JDBCSingleton obj2 = JDBCSingleton.getJdbcInstance();
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
    }
}
