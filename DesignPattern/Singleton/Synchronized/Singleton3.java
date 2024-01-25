package SingletonDP.Synchronized;

public class Singleton3 {

    private static Singleton3 singleton3;

    private Singleton3(){

    }

    public static Singleton3 getSingleton3(){
        if(singleton3 == null){
            
            // adding synchronized block because we dont want object to be created by multiple threads
            // when multiple threds gets created they start to work concurrently, so if multiple
            // threads get singleton3==null, they all will create object, so in case of multiple
            // threads for security , we use synchronized block

            synchronized (Singleton3.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
