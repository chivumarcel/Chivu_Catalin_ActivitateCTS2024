import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cuptor extends ACuptor{

    private static HashMap<Integer, Cuptor> listaInstante = null;
    private int cheie;
    private int gradeMaxim;
    private List<Comanda> listaAsteptare;
    private Cuptor(int cheie){
        this.getGradeMaxim = 250; //preluat din fisier
        this.listaAsteptare = new ArrayList<>();
        this.cheie = cheie;

    }


    public static Cuptor getInstance(int c){
        return listaInstante.get(c);

    }
    static {
        listaInstante = new HashMap<>();
        listaInstante.put(1, new Cuptor(1));
        listaInstante.put(2, new Cuptor(2));
        listaInstante.put(3, new Cuptor(3));
        listaInstante.put(4, new Cuptor(4));
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
    public static void addComandaStatic (Comanda c){

            Cuptor cMin = listaInstante.get(1);
            for(Cuptor cuptor: listaInstante.values()){
                if(cuptor.getTimpAsteptare()< cMin.getTimpAsteptare()){
                    cMin = cuptor;
                }
            }
            cMin.addComanda(c);
    }
}
