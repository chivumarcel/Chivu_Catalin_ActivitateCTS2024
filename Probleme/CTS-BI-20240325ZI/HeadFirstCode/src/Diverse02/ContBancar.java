package Diverse02;
public class ContBancar {
    private double sold;
    public ContBancar(double soldInitial){
        this.sold = soldInitial;
    }

    public double getSold(){
        return getSold();
    }
    ContBancar cont = new ContBancar(1000);
    double afiseazaSold = cont.getSold();

}
// În acest exemplu, getSold() este un getter care permite citirea valorii sold din obiectul ContBancar.
// Aceasta asigură că alte clase pot vedea soldul contului, dar nu pot schimba soldul decât prin metode
// explicit definite pentru acest scop (de exemplu, un setter pentru a adăuga sau a retrage bani).

