package P01Duck.behaviours;

import P01Duck.behaviours.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    public void quack(){
        System.out.println(" --- Silence --- \n");
    }
}
