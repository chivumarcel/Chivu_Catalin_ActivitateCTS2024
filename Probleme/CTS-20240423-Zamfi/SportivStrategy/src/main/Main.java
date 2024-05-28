package main;

import classes.Portar;
import classes.VerificatorPeluza;
import classes.VerificatorTribuna;
import classes.VerificatorVIP;

public class Main {
    public static void main(String[] args) {
        Portar portar = new Portar();

        String numeSuporter1 = "Gigel - VIP";
        String numeSuporter2 = "Gigel - Peluza";
        String numeSuporter3 = "Gigel - Tribuna";

        portar.setStrategieVerificare(new VerificatorVIP());
        portar.verificaSuporter(numeSuporter1);

        portar.setStrategieVerificare(new VerificatorPeluza());
        portar.verificaSuporter(numeSuporter2);

        portar.setStrategieVerificare(new VerificatorTribuna());
        portar.verificaSuporter(numeSuporter3);
    }
}
