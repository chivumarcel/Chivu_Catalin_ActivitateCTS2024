package ro.ase.acs.observer;

public class YouTubeSubscriber implements Observer{
    @Override
    public void receiveNotification(String message) {
        System.out.println("YouTube subscriber received notification: " + message);
    }
}
