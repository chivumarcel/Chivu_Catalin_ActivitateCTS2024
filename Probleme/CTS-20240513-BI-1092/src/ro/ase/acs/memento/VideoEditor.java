package ro.ase.acs.memento;

public class VideoEditor {
    private Video video;

    public VideoEditor() {
        this.video = new Video("Untitled", 0);
    }
    public void edit (int lenght){
        video.setLenght(video.getLenght()+lenght);
    }

    public void save(){

    }

    public void undo{
        video = history.getFromHistory();

    }

}
