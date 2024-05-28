package Main;
import Decorator.Decorator;
import Spital.Diagnostic;
import Spital.DiagnosticAbstract;

public class Main {
    public static void main(String[] args) {
        DiagnosticAbstract diagnostic = new Diagnostic("raceala", "durere in gat", "nu necesita spitalizare");
        diagnostic.printeazaDiagnostic();

        Decorator decorator = new AplicatieMobila(diagnostic);
        decorator.afiseazaOnline();
        decorator.printeazaDiagnostic();

        Decorator website = new Website(diagnostic);
        website.afiseazaOnline();
        website.printeazaDiagnostic();
    }


    // problema A7
}
