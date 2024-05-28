package FactoryProblema3A.main;

import FactoryProblema3A.classes.PersonalSpital;
import FactoryProblema3A.classes.fabrica.*;

public class Program {

    public static void prelucrarePersonal(FabricaPersonal fabrica, String nume, int salariu) {
        PersonalSpital personalSpital = fabrica.createPersonal(nume, salariu);
        personalSpital.afisareDetalii();
    }

    public static void main(String[] args) {
        FabricaPersonal fabricaMedic = new FabricaMedic();
        FabricaPersonal fabricaAsistent = new FabricaAsistent();
        FabricaPersonal fabricaBrancardier = new FabricaBrancardier();
        FabricaPersonal fabricaInfirmier = new FabricaInfirmier();

        PersonalSpital medic = fabricaMedic.createPersonal("Anghel", 8000);
        PersonalSpital asistent = fabricaAsistent.createPersonal("Ion", 5000);
        PersonalSpital brancardier = fabricaBrancardier.createPersonal("Petru", 6000);
        PersonalSpital infirmier = fabricaInfirmier.createPersonal("Bogdan", 4000);

        medic.afisareDetalii();
        asistent.afisareDetalii();
        brancardier.afisareDetalii();
        infirmier.afisareDetalii();

        prelucrarePersonal(new FabricaMedic(), "Butacu Marian", 12000);
        prelucrarePersonal(new FabricaInfirmier(), "Ticu Bogdan", 2000);
    }
}