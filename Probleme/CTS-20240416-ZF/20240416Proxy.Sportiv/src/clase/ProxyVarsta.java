package clase;

public class ProxyVarsta implements Vanzare {
    private Vanzare vanzareBilet;
    private static int varstaMinima = 14;

    public ProxyVarsta(Vanzare vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    public static void setVarstaMinima(int varstaMinima) {
        ProxyVarsta.varstaMinima = varstaMinima;
    }

    @Override
    public void vanzare(Persoana persoana) {
        if (persoana.getVarsta() >= varstaMinima) {
            vanzareBilet.vanzare(persoana);
        } else {
            System.out.println("Persoana " + persoana.getNume() + " are varsta " + persoana.getVarsta() + " ani si nu poate achizitiona bilet");
        }
    }
}


//CMD+ALT+L - formatare frumoasa a codului