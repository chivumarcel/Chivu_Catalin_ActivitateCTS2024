package metrou;

import java.util.GregorianCalendar;

public class AbonamentMetrou extends Calatorie{
    private GregorianCalendar dataExpirareAbonament;
    public AbonamentMetrou(String numeClient) {
        super(numeClient);
        this.dataExpirareAbonament = new GregorianCalendar();
    }
    @Override
    public boolean estePermisAccesul() {
        if(dataExpirareAbonament.before(new GregorianCalendar())){
            return true;
        }
        return false;
    }
}

