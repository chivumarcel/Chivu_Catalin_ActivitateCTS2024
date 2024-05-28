import java.util.ArrayList;
import java.util.List;

public class CuptorOld extends ACuptor{

    private static CuptorOld instance = null;
    private int gradeMaxim;
    private List<Comanda> listaAsteptare;
    private CuptorOld(){
        this.getGradeMaxim = 250; //preluat din fisier
        this.listaAsteptare = new ArrayList<>();

    }


    public static CuptorOld getInstance(){
        if(instance == null){
            instance = new CuptorOld();
        }
       return instance;
    }

    @Override
    public int getGradeMaxime() {
        return this.gradeMaxim;
    }

    @Override
    public int getTimpAsteptare() {
        int timpTotal = 0;
        for(Comanda c: this.listaAsteptare){
            timpTotal+=c.getTimpGatire();

        }
        return timpTotal;
    }

    @Override
    public void afisareComenziAsteptare() {
        System.out.println("Lista asteptare");
        for(Comanda c: this.listaAsteptare){
            System.out.println(c.toString());

        }
    }


    @Override
    public void addComanda(Comanda c) {
        this.listaAsteptare.add(c);

    }
}
