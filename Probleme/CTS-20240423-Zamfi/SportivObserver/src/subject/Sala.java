package subject;

import observer.Observer;

public class Sala extends Subject{
    @Override
    public void notificaMeciFotbal() {
        String mesaj = "Va avea loc meciul de fotbal, pe data de 23 la ora 18.";
        notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciHandbal() {
        String mesaj = "Va avea loc meciul de handbal, pe data de 24 la ora 18.";
        notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciVolei() {
        String mesaj = "Va avea loc meciul de volei, pe data de 25 la ora 18.";
        notificaAbonati(mesaj);
    }
}
