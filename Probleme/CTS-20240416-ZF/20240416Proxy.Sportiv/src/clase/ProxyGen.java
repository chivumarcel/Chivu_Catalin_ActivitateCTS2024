package clase;

public class ProxyGen implements Vanzare{

    private Vanzare vanzare;
    private String genAcceptat;

    public ProxyGen(Vanzare persoana, String genAcceptat) {
        this.vanzare = persoana;
        this.genAcceptat = genAcceptat;
    }

    @Override
    public void vanzare(Persoana persoana) {
        if(persoana.getGen().equals(genAcceptat)){
            vanzare.vanzare(persoana);
        }else {
            System.out.println("Acest eveniment este destinat doar persoanelor de gen "+genAcceptat);
        }
    }
}
