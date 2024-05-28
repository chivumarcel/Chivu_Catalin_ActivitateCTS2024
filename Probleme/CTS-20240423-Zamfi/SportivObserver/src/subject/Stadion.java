package subject;

public class Stadion extends Subject{


    @Override
    public void notificaMeciFotbal() {
        super.notificaAbonati("Va avea loc meciul de fotbal, pe data de 23 la ora 18.");

    }

    @Override
    public void notificaMeciHandbal() {
        super.notificaAbonati("Va avea loc meciul de handbal, pe data de 24 la ora 18.");

    }

    @Override
    public void notificaMeciVolei() {
        super.notificaAbonati("Va avea loc meciul de volei, pe data de 25 la ora 18.");

    }

    public void notificaConcert(){
        super.notificaAbonati("Va avea loc concertul trupei X, pe data de 26 la ora 20.");
    }
}
