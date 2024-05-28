package ro.acs.ase.command.v2;

public class OcupaMasa implements Command{
    private Masa masa;
    public OcupaMasa (Masa masa){
        this.masa =masa;
    }


    @Override
    public void execute() {
        masa.ocupa();
    }

    @Override
    public void undo() {
        masa.elibereaza();
    }
}
