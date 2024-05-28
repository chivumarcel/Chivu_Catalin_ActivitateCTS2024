package P01Duck.typesOfDucks;

import P01Duck.behaviours.FlyNoWay;
import P01Duck.behaviours.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();

    }
    public void display(){
        System.out.println("I'm a model duck!");
    }

}
