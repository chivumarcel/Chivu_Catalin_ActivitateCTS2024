package metrou;

public abstract class Calatorie {
    private String numeClient;

    public Calatorie(String numeClient) {
        super();
    }

    public String getNumeClient() {
        return numeClient;
    }

    public abstract boolean estePermisAccesul(); // metoda abstracta (de ce?)

}
