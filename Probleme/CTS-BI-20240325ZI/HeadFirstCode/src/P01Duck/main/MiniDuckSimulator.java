package P01Duck.main;

import P01Duck.behaviours.FlyRocketPowered;
import P01Duck.typesOfDucks.Duck;
import P01Duck.typesOfDucks.MallardDuck;
import P01Duck.typesOfDucks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performQuack();
        model.performFly();
    }

}
