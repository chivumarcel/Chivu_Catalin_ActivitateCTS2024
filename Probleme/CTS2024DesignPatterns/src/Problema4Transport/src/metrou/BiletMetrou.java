package metrou;

public class BiletMetrou extends Calatorie {
    private int nrCalatorii;

    public BiletMetrou(String numeClient, int nrCalatorii) {
        super(numeClient);
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public boolean estePermisAccesul() {
        if(nrCalatorii <= 0){
            return false;
        }
        this.nrCalatorii-=1;
        return true;
    }

    public int getNrCalatorii() {
        return nrCalatorii;
    }

    @Override
    public String toString() {
        return "BiletMetrou{" +
                "numeClient='" + getNumeClient() + '\'' +
                ", numarStatii=" + nrCalatorii +
                '}';
    }

}
