package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Vanzare vanzareBilet = new VanzareBilet("El Clasico", 100);

        Persoana persoana1 = new Persoana("Andreas", 20, "masculin");
        Persoana persoana2 = new Persoana("Joana", 12, "feminin");

        vanzareBilet.vanzare(persoana1);
        vanzareBilet.vanzare(persoana2);

        Vanzare proxyVarsta = new ProxyVarsta(vanzareBilet);
        proxyVarsta.vanzare(persoana1);
        proxyVarsta.vanzare(persoana2);

        Vanzare proxyGen = new ProxyGen(proxyVarsta, "feminin");
        proxyGen.vanzare(persoana1);
        proxyGen.vanzare(persoana2);
    }
}
