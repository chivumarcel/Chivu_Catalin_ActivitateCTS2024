package clase;

public class Caracteristici {
    private int pozitieX;
    private int pozitieY;
    private String culoareTricou;

    public Caracteristici(int pozitieX, int pozitieY, String culoareTricou) {
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
        this.culoareTricou = culoareTricou;
    }

    public int getPozitieX() {
        return pozitieX;
    }

    public int getPozitieY() {
        return pozitieY;
    }

    public String getCuloareTricou() {
        return culoareTricou;
    }

    public void setPozitieX(int pozitieX) {
        this.pozitieX = pozitieX;
    }

    public void setPozitieY(int pozitieY) {
        this.pozitieY = pozitieY;
    }

    public void setCuloareTricou(String culoareTricou) {
        this.culoareTricou = culoareTricou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Caracteristici{");
        sb.append("pozitieX=").append(pozitieX);
        sb.append(", pozitieY=").append(pozitieY);
        sb.append(", culoareTricou='").append(culoareTricou).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
