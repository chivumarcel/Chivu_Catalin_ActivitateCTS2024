package ro.acs.ase.command.v2;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa();
        Operator operator1 = new Operator();

        Masa masa2 = new Masa();
        Masa masa3 = new Masa();


        operator1.trimiteComanda(new RezervaMasa(masa1, 5));
        operator1.trimiteComanda(new OcupaMasa(masa1));

        operator1.trimiteComanda(new RezervaMasa(masa2, 3));
        operator1.trimiteComanda(new RezervaMasa(masa3, 8));

        operator1.undo();
    }
}
