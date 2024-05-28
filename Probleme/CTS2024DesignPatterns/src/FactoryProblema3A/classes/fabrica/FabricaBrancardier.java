package FactoryProblema3A.classes.fabrica;
import FactoryProblema3A.classes.Brancadier;
import FactoryProblema3A.classes.PersonalSpital;

public class FabricaBrancardier implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Brancadier(nume, salariu);
    }
}
