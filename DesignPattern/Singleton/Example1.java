package SingletonDP.Singleton2_Lazy;

public class Example1 {

    public static void main(String[] args) {
        // storing hashcode of instance in s1 & s2 and printing hashcode
        Singleton1 s1  = Singleton1.getSingleton1();
        System.out.println(s1.hashCode());

        Singleton1 s2 = Singleton1.getSingleton1();
        System.out.println(s2.hashCode());

        // both hashcode is same, means same object is shared among both variable
    }
}
