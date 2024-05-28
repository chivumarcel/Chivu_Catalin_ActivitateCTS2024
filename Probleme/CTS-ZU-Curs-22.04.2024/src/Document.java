public class Document {

    private String denumireFisier;
    private String continut;
    private int nrSemnaturi;

    public Document(int id, String denumireFisier){
        this.denumireFisier = denumireFisier;
    }
    public void setContinut(String continut){
        if (continut != this.continut){

            //generare memento
            Memento memento = new Memento(this.continut, this.nrSemnaturi);
            this.continut = continut; //modific continutul
            CareTaker.addMemento(this.continut, memento); //adaug memento in lista de memento-uri pentru acel document
        }
    }

    public void setNrSemnaturi(int nrSemnaturi){
        if (nrSemnaturi != this.nrSemnaturi){

            //generare memento
            Memento memento = new Memento(this.continut, this.nrSemnaturi);
            this.nrSemnaturi = nrSemnaturi; //modific nr de semnaturi
            CareTaker.addMemento(this.continut, memento); //adaug memento in lista de memento-uri pentru acel document
        }
    }


}
