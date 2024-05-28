public class Main {
    public static void main(String[] args) {

        Comanda c1 = new Comanda(10, "preparat1", 250);
        Comanda c2 = new Comanda(20, "preparat2", 270);
        Comanda c3 = new Comanda(10, "preparat3", 200);
        Comanda c4 = new Comanda(40, "preparat4", 270);

        Cuptor.addComandaStatic(c1);
        Cuptor.addComandaStatic(c2);
        Cuptor.addComandaStatic(c3);
        Cuptor.addComandaStatic(c4);

        for(int i=1; i<4; i++){
            Cuptor.getInstance(i).afisareComenziAsteptare();
        }
        Cuptor cuptor = Cuptor.getInstance(1);





    }
}