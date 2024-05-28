package FactoryProblema2A.classes.fabrica;

import FactoryProblema2A.classes.*;

public class FabricaPersonal {

    public PersonalSpital creazaPersonal(TipPersonal tipPersonal, String nume, int salariu) throws Exception {
        switch (tipPersonal) {
            case MEDIC -> {
                return new Medic(nume, salariu);
            }

            case ASISTENT -> {
                return new Asistent(nume, salariu);
            }

            case BRANCADIER -> {
                return new Brancadier(nume, salariu);
            }

            case INFIRMIER -> {
                return new Infirmier(nume, salariu);
            }

            default -> throw new Exception("Tipul nu este returnat\n");
        }
    }

}