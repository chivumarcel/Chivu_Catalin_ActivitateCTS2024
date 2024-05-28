package classes;

public class VerificatorTribuna implements Verificator{
    @Override
    public void verifica(String numeSuporter) {
        System.out.println("Este verificat bagajele lui " + numeSuporter + " la tribuna.");
    }
}
