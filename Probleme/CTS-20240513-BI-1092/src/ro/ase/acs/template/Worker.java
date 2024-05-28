package ro.ase.acs.template;

public class Worker extends PartMover{
    @Override
    protected void liftPart() {
        System.out.println("Worker is lifting part");
    }

    @Override
    protected void transportPart() {
        System.out.println("Worker is transporting part");
    }

    @Override
    protected void dropPart() {
        System.out.println("Worker is dropping part");
    }
}
