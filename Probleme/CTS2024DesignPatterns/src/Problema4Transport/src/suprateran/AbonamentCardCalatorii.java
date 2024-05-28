package suprateran;

import java.util.GregorianCalendar;

public class AbonamentCardCalatorii {
    private int nrCalatorii;
    private int nrCalatoriiRamase;
    private GregorianCalendar dataExpirareAbonament;

    public AbonamentCardCalatorii(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
        this.nrCalatoriiRamase = nrCalatorii;
    }

    public boolean estePermisAccesul() {
        if (nrCalatoriiRamase <= 0) {
            return false;
        }
        this.nrCalatoriiRamase -= 1;
        return true;
    }

    public int getNrCalatoriiRamase() {
        return nrCalatoriiRamase;
    }

    @Override
    public String toString() {
        return "AbonamentCardCalatorii{" +
                "nrCalatorii=" + nrCalatorii +
                ", nrCalatoriiRamase=" + nrCalatoriiRamase +
                '}';
    }
}
