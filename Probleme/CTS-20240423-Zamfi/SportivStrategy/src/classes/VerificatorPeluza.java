package classes;

public class VerificatorPeluza implements Verificator{

    @Override
    public void verifica(String numeSuporter) {
        System.out.println("Sunt verificate bagajele si hainele lui " + numeSuporter + " la peluza.");
    }
}
