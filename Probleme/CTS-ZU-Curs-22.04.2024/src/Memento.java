public class Memento {
    private String continut;
    private int nrSemnaturi;

    public Memento(String continut, int nrSemnaturi) {
        this.continut = continut;
        this.nrSemnaturi = nrSemnaturi;
    }

    public String getContinut() {
        return continut;
    }

    public int getNrSemnaturi() {
        return nrSemnaturi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Memento{");
        sb.append("continut='").append(continut).append('\'');
        sb.append(", nrSemnaturi=").append(nrSemnaturi);
        sb.append('}');
        return sb.toString();
    }
}


