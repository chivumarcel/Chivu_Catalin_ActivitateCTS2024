package ro.ase.acs.observer;

public interface Observer {
    void receiveNotification(String message); // nu pune notify, sau notifyAll
}
