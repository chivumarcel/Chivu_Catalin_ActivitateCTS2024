package ro.ase.acs.memento;

import java.util.Stack;

public class VideoHistory {
    private Stack<Video> history = new Stack<>();

    public void addToHistory(Video video) {
        history.push((Video) video.clone); // asta e o adresa, nu e un obiect; trebuie deep coupying
    }
    public Video getFromHistory(){
        return history.pop();
    }
}