package main;
import Autobuz.Autobuz;
import Autobuz.FacadeAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        autobuz.punePeLiberUsaDinFata();
        autobuz.punePeLiberUsaDinMijloc();
        autobuz.punePeLiberUsaDinSpate();
        autobuz.deschideUsaDinFata();
        autobuz.deschideUsaDinMijloc();
        autobuz.deschideUsaDinSpate();

        System.out.println("Folosind Facade");
       FacadeAutobuz facadeAutobuz = new FacadeAutobuz(autobuz);
       facadeAutobuz.deschideToateUsile();
       facadeAutobuz.elibereazaToateUsile();

    }
}
