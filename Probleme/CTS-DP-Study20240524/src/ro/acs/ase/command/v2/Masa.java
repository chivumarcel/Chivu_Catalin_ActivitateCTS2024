package ro.acs.ase.command.v2;

public class Masa {
    private int numar;
    private boolean esteRezervata;
    private boolean esteOcupata;

    public void rezerva (int nrPersoane){
        System.out.println("Masa a fost rezervata pentru "+nrPersoane+ " persoane");
    }

    public void anuleazaRezervare (){
        System.out.println("Rezervarea a fost anulata");
    }

    public void ocupa(){
        System.out.println("Rezervarea a fost efectuata cu succes");
    }

    public void elibereaza(){
        System.out.println("Masa a fost eliberata");
    }
}
