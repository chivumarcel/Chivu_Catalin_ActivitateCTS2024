package FactoryProblema3A.classes.fabrica;
import FactoryProblema3A.classes.Infirmier;
import FactoryProblema3A.classes.PersonalSpital;

public class FabricaInfirmier implements FabricaPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Infirmier(nume, salariu);
    }
}
