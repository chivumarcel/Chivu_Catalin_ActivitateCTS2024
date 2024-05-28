package FactoryProblema2A.main;

import FactoryProblema2A.classes.PersonalSpital;
import FactoryProblema2A.classes.fabrica.FabricaPersonal;
import FactoryProblema2A.classes.fabrica.TipPersonal;

public class FactoryProgram {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonal = new FabricaPersonal();

        try {
            PersonalSpital medic = fabricaPersonal.creazaPersonal(TipPersonal.MEDIC, "Popescu Maria", 5000);
            PersonalSpital asistent = fabricaPersonal.creazaPersonal(TipPersonal.ASISTENT, "Ionescu Andrei", 3000);
            PersonalSpital brancadier = fabricaPersonal.creazaPersonal(TipPersonal.BRANCADIER, "Popa Dorel", 4000);
            PersonalSpital infirmier = fabricaPersonal.creazaPersonal(TipPersonal.INFIRMIER, "Ciurea Cristian", 3500);

            medic.afisareDetalii();
            asistent.afisareDetalii();
            brancadier.afisareDetalii();
            infirmier.afisareDetalii();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
// seminar 4 CTS ZI- Factory