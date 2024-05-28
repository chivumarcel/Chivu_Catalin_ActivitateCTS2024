package Decorator;

import Spital.DiagnosticAbstract;

import javax.tools.DiagnosticCollector;

public abstract class Decorator implements DiagnosticAbstract {
    private DiagnosticAbstract diagnostic;
    public abstract void afiseazaOnline();

    public Decorator(DiagnosticAbstract diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public void printeazaDiagnostic() {
        diagnostic.printeazaDiagnostic();
        System.out.println("Rezultatul este disponibil si online");
    }
}
