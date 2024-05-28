package FactoryProblema3A.classes;

public class Asistent extends PersonalSpital {

    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Asistent " + getNume() + " are salariul " + getSalariu());
    }
}