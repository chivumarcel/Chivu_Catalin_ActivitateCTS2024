package ro.ase.acs.memento;

public class Video implements Cloneable
    private String name;
    private int lenght ;

    public Video(String name, int lenght) {
        this.name = name;
        this.lenght = lenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

}

@Override
protected Object clone() throws CloneNotSupportedException {
    Video video = (Video)super.clone();
    video.name = this.name;
    video.lenght = this.lenght;
    return video;
}
