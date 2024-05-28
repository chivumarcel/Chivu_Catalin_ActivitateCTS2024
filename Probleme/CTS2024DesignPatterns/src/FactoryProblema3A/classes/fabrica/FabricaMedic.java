package FactoryProblema3A.classes.fabrica;
import FactoryProblema3A.classes.Medic;
import FactoryProblema3A.classes.PersonalSpital;

public class FabricaMedic implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}