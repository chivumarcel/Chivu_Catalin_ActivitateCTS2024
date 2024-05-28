package ro.ase.acs.template;

public abstract class PartMover {
    protected abstract void liftPart();
    protected abstract void transportPart();
    protected abstract void dropPart();

    public final void move(){
        liftPart();
        transportPart();
        dropPart();
    }
}
