package ro.ase.acs.template;

public class RoboticArm extends PartMover{

    @Override
    protected void liftPart() {
        System.out.println("Lifting part");
    }

    @Override
    protected void transportPart() {
        System.out.println("Transporting part");

    }

    @Override
    protected void dropPart() {
        System.out.println("Dropping part");
    }
}
