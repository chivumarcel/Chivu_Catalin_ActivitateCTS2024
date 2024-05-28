package main;

import clase.Caracteristici;
import clase.Fabrica;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        Caracteristici caracteristici1 = new Caracteristici(10, 20, "albastru");
        Caracteristici caracteristici2 = new Caracteristici(20, 25, "rosu");
        Caracteristici caracteristici3 = new Caracteristici(15, 28, "galben");
        Caracteristici caracteristici4 = new Caracteristici(8, 7, "verde");

        fabrica.getSpectator(10, 10).deseneaza(caracteristici1);
        fabrica.getSpectator(20, 20).deseneaza(caracteristici2);
        fabrica.getSpectator(10, 10).deseneaza(caracteristici3);
        fabrica.getSpectator(20, 20).deseneaza(caracteristici4);

    }
}
