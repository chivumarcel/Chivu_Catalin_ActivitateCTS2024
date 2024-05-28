package FactoryProblema2A.classes;

public class Brancadier extends PersonalSpital{
    public Brancadier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Brancadierul " + getNume() + " are salariul " + getSalariu());
    }
}