package suprateran;

public class BiletCardCalatorii extends CardSTB{
    private int nrCalatorii;
    private static double pretCalatorie = 3.2; // am adaugat un atribut nou
    private double soldCard; // am adaugat un atribut nou

    public BiletCardCalatorii(String numeClient, String cnpClient, int nrCalatorii, double soldCard) {
        super(numeClient, cnpClient);
        this.soldCard = soldCard;
    }

    @Override
    public void validareCalatorie() {
        if(soldCard>pretCalatorie){
            System.out.println("Calatoria a fost validata");
            soldCard-=pretCalatorie;
            return;
        }
        this.nrCalatorii-=1;
        System.out.println("Calatoria a fost validata");
    }

    public int getNrCalatorii() {
        return nrCalatorii;
    }

    @Override
    public String toString() {
        return "BiletCardCalatorii{" +
                "numeClient='" + getNumeClient() + '\'' +
                ", cnpClient='" + getCnpClient() + '\'' +
                ", nrCalatorii=" + nrCalatorii +
                '}';
    }
}
