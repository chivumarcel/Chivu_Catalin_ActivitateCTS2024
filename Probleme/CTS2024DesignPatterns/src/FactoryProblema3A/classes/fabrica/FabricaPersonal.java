package FactoryProblema3A.classes.fabrica;
import FactoryProblema3A.classes.PersonalSpital;

public interface FabricaPersonal {
    PersonalSpital createPersonal(String nume, int salariu);
}