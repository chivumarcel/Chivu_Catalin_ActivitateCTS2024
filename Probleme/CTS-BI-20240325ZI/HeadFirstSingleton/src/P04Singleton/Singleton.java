package P04Singleton;
public class Singleton {
    private volatile static Singleton uniqueInstance = new Singleton();
    private void Singleton(){}
    public static synchronized Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
