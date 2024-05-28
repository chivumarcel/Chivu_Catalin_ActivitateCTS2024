package FactoryProblema3A.classes.fabrica;
import FactoryProblema3A.classes.Asistent;
import FactoryProblema3A.classes.PersonalSpital;

public class FabricaAsistent implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}