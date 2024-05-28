import java.util.ArrayList;
import java.util.List;

public class NodStructura implements INod{
    private int greutateStructura;
    private List<INod> listaFii;

    public NodStructura(int greutateStructura) {
        super();
        this.greutateStructura = greutateStructura;
        this.listaFii = new ArrayList<INod>();
    }

    @Override
    public boolean esteFragil() {
        return false;
    }

    @Override
    public int getGreutate() {
        return 0;
    }

    @Override
    public void addNod(INod nod) {
        if(nod!=null){
            this.listaFii.add(nod);

    }

    @Override
    public void removeNod(INod nod) {

    }

    @Override
    public INod getNod(int index) {
        if(index>=0 && index<this.listaFii.size()){
            return this.listaFii.get(index);
        }
    return null;
    }
}
