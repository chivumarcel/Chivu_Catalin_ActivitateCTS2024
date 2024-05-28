package clase;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<String, Flyweight> spectatori;

    public Fabrica() {
        this.spectatori = new HashMap<>();

    }

    public Flyweight getSpectator(int latime, int inaltime){
        String cheie = ""+ inaltime+"_"+latime;
        Flyweight flyweight = (Flyweight) spectatori.get(cheie);
        if(flyweight == null){
            flyweight = new Spectator(inaltime, latime);
            spectatori.put(cheie, flyweight);
        }
        return flyweight;
    }
}
