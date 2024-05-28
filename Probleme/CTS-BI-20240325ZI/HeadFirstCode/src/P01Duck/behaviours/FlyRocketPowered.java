package P01Duck.behaviours;

import P01Duck.behaviours.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I'm flying duck that fly like a rocket");
    }
}
