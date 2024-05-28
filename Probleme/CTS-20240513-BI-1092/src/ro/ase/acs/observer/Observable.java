package ro.ase.acs.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observersList = new ArrayList<>();

    public void subscribe(Observer observer){
        observersList.add(observer);
    }

    public void unsubscribe(Observer observer){
        observersList.remove(observer);
    }

    public void sendNotification(String message){
        //observersList.forEach(x->x.receiveNotification(message));
        for(Observer observer : observersList){
            observer.receiveNotification(message);
        }
    }
}
