package P01Duck.typesOfDucks;

import P01Duck.behaviours.FlyWithWings;
import P01Duck.behaviours.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
    public void display(){
        System.out.println("I am a real Mallard duck");
    }
}
