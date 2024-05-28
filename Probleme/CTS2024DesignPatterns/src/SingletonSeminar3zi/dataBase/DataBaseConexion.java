package dataBase;

public class DataBaseConexion {
    private String name;
    private int numberOfTables;
    private String connexionLink;
    private static DataBaseConexion instance = null;

    private DataBaseConexion(String name, int numberOfTables, String conexionLink) {
        this.name = name;
        this.numberOfTables = numberOfTables;
        this.connexionLink = conexionLink;
    }

    public static synchronized DataBaseConexion getInstance(String name, int numberOfTables, String connexionLink) {
        if (instance == null) {
            instance = new DataBaseConexion(name, numberOfTables, connexionLink);
        }

        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfTables(int numberOfTables) {
        this.numberOfTables = numberOfTables;
    }

    public void setConnexionLink(String connexionLink) {
        this.connexionLink = connexionLink;
    }

    @Override
    public String toString() {
        return "Data base name: " + name +
                "\nNumber of tables: " + numberOfTables +
                "\nConnexion link: " + connexionLink + "\n\n";
    }
}