public interface INod {
    //zona frunza

    //zona comuna
    int getGreutate();
    boolean esteFragil();
    //zona structura
    void addNod(INod nod);
    void removeNod(INod nod);
    INod getNod(int index);
}
