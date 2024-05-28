package ro.ase.acs.observer;

public class YouTubeChannel extends Observable{
    private String name;

    public YouTubeChannel(String name) {
        this.name = name;
    }

    public void uploadVideo(String title){
        sendNotification("New video uploaded: " + title + " by " + name);
    }
}
