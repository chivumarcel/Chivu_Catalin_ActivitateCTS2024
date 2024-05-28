package ro.acs.ase.command.v2;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> istoricComenzi = new ArrayList<>();

    public void trimiteComanda (Command comanda){
        comanda.execute();
        istoricComenzi.add(comanda);
    }

    public void undo(){
        if(!istoricComenzi.isEmpty()){
            Command ultimaComanda = istoricComenzi.remove(istoricComenzi.size() -1);
            ultimaComanda.undo();
        }
    }

}
