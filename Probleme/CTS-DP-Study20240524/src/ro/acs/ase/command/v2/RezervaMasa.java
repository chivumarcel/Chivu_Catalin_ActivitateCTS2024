package ro.acs.ase.command.v2;

public class RezervaMasa implements Command{

    private Masa masa;
    private int nrPersoane;

    public RezervaMasa (Masa masa, int nrPersoane){
        this.masa = masa;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public void execute() {
        masa.rezerva(nrPersoane);
    }

    @Override
    public void undo() {
        masa.anuleazaRezervare();
    }
}
