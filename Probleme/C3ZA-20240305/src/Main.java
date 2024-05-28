import Classes.ConexiuneBazaDeDate;

// Seminar 3, Singleton
public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDeDate conexiune1 = ConexiuneBazaDeDate.getInstance("Baza1", 20, "link1");
        ConexiuneBazaDeDate conexiune2 = ConexiuneBazaDeDate.getInstance("Baza2", 25, "link2");

    }



}

//functiile nu primesc pointerul this // asta e metoda
// singleton - orice aplicatie are singleton implementat, ca o poti deschide decat o singura data
// o instanta a unei aplicatii de pe un dispozitiv mobil = singleton