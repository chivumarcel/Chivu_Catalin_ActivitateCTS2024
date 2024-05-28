package P05SingletonLogger;
// initializarea cea mai simpla de singleton, Eager Loading
//public class LoggerSingleton {
//    private static LoggerSingleton instance = new LoggerSingleton();
//
//    // constructor privat -- privat este implicit
//    private LoggerSingleton(){
//    }
//    // getter public - poate fi accesat din afara clasei
//    public static LoggerSingleton getInstance(){
//        return instance;
//    }
//}
public class LoggerSingleton{ // thread safety
    private static volatile LoggerSingleton instance = null; //avoid using reflexion - modalitate de acces, desi e privat
    private LoggerSingleton(){
        if (instance !=null){
            throw new RuntimeException("Error");
        }
    }
    public static LoggerSingleton getInstance(){
        if(instance == null){
            synchronized (LoggerSingleton.class){
                if(instance == null){
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }
}

// sursa> https://www.youtube.com/watch?v=EZDeEHXUf8w