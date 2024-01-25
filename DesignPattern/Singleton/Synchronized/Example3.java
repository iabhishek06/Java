package SingletonDP.Synchronized;

public class Example3 {

    public static void main(String[] args) {

        // storing objects into different variables by calling getSingleton3 method

        Singleton3 s1 = Singleton3.getSingleton3();
        Singleton3 s2 = Singleton3.getSingleton3();
        Singleton3 s3 = Singleton3.getSingleton3();

        // printing hashcode of all objects to verify if same objects are shared

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());


    }
}
