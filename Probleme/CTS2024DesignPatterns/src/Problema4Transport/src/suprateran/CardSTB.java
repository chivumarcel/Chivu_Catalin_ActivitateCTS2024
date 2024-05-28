package suprateran;

public abstract class CardSTB {
    private String numeClient;
    private String cnpClient;

    public CardSTB(String numeClient, String cnpClient) {
        this.numeClient = numeClient;
        this.cnpClient = cnpClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getCnpClient() {
        return cnpClient;
    }
    public void validareCalatorie(){
        System.out.println("Cardul a fost validat");
    }
}
