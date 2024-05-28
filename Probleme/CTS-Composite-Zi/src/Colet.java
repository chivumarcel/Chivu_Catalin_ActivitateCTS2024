public class Colet implements INod{
    private boolean fragil;
    private int greutate;

    public Colet(boolean fragil, int greutate) {
        this.fragil = fragil;
        this.greutate = greutate;
    }

    @Override
    public boolean esteFragil() {
        boolean esteFragilContainer=false;
        if(nod.esteFragil()){
            return true;
        }
        return false;
    }

    @Override
    public int getGreutate() {
        int greutate=this.greutateStructura;
        for(INod nod: this.listaFii){
            greutate+=nod.getGreutate();
        }
        return greutate;
    }

    @Override
    public void addNod(INod nod) {
        throw new UnsupportedOperationException("Nu se poate adauga un nod in colet");

    }

    @Override
    public void removeNod(INod nod) {
        throw new UnsupportedOperationException("Nu se poate sterge un nod din colet");
    }

    @Override
    public INod getNod(int index) {
        throw new UnsupportedOperationException("Nu se poate adauga un nod in colet");
    }
}
