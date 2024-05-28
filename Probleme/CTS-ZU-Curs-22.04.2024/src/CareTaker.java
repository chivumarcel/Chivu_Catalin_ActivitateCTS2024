import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CareTaker {
    private static Map<String, List<Memento>> versiuni = new HashMap<>();


    static void addMemento(String denumireFisier, Memento memento){
        if(!versiuni.containsKey(denumireFisier)){
            versiuni.put(denumireFisier, new ArrayList<>()); //daca nu exista fisierul, creez o lista noua
        }else{
            versiuni.get(denumireFisier).add(memento);
        }
    }

    Memento getMemento(String denumireFisier){
        if(versiuni.containsKey(denumireFisier)){
            int index = versiuni.get(denumireFisier).size();
            return versiuni.get(denumireFisier).get(index-1);
        }else{
            return null;
        }
    }
}
