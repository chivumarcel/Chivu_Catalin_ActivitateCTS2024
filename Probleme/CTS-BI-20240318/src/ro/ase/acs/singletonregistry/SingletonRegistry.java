package ro.ase.acs.singletonregistry;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    private static Map<String, Object> registry = new HashMap<>();
    static {
        registry.put(Logger.class.getSimpleName(), new Logger());
        registry.put(DatabaseConnection.class.getSimpleName(), new DatabaseConnection());
    }
    public <T> T getSingleton(String className){
       return (T) registry.get(className);
    }

}
