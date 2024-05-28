package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void adaugaAbonat(Observer observer){
        //adauga un abonat la lista de abonati
        observers.add(observer);
    }

    public void stergeAbonat(Observer observer){
        //sterge un abonat din lista de abonati
        observers.remove(observer);
    }

    public void notificaAbonati(String mesaj){
        //trimite notificare la toti abonatii
        for(Observer observer: observers){
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaMeciFotbal();
    public abstract void notificaMeciHandbal();
    public abstract void notificaMeciVolei();

}
