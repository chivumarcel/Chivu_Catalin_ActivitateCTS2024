package classes;

public class Portar {
    private Verificator strategieVerificare;

    public Portar(Verificator strategieVerificare) {
        this.strategieVerificare = strategieVerificare;
    }

    // constructor fara parametri si initializam noi strategia implicita, verificam tot
    public Portar() {
        this.strategieVerificare = new VerificatorPeluza();
    }

    public void setStrategieVerificare(Verificator strategieVerificare) {
        this.strategieVerificare = strategieVerificare;
    }

    public void verificaSuporter(String numeSuporter) {
        strategieVerificare.verifica(numeSuporter);
    }
}
