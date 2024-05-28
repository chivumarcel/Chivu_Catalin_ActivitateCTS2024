package observer;

public class Abonat implements Observer {
    private String nume;

    public Abonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Abonatul " + nume + " a primit notificarea: " + mesaj);
    }
}
