package observer;

public class Vecin implements Observer{
    private String nume;
    private float distantaBloc;

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Vecinul " + nume + ", sala aflata la "+distantaBloc+" de dvs a trimis notificarea: " + mesaj);
    }

    public Vecin(String nume, float distantaBloc) {
        this.nume = nume;
        this.distantaBloc = distantaBloc;
    }
}

