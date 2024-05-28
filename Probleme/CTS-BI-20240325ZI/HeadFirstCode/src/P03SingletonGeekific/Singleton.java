package P03SingletonGeekific;

public class  Singleton {
    private static volatile Singleton instance;
    private String data;
// adaugam un constructor pentru a crea un obiect bazat pe aceasta clasa - constructorul creeaza obiectele clasei
    private Singleton (String data){
        //initializam toate atributele obiectului
        this.data = data;
    }
    private static Singleton getInstance(String data){
        Singleton result = instance;
        if (instance == null){
            synchronized (Singleton.class){
                if(instance == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return instance;
    }
}
