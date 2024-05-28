package main;

import observer.Abonat;
import observer.Vecin;
import subject.Sala;
import subject.Stadion;
import subject.Subject;

public class Main {
    public static void main(String[] args) {
        Abonat abonat1 = new Abonat("Gigel");
        Abonat abonat2 = new Abonat("Dorel");
        Abonat abonat3 = new Abonat("Ionel");
        Vecin vecin = new Vecin("Vecinul 1", 12);

        Subject sala = new Sala();
        sala.adaugaAbonat(abonat1);
        sala.adaugaAbonat(abonat2);
        sala.adaugaAbonat(abonat3);

        sala.notificaMeciFotbal();

        sala.stergeAbonat(abonat2);
        sala.adaugaAbonat(vecin);
        sala.notificaMeciHandbal();

        Subject stadion = new Stadion();
        stadion.adaugaAbonat(abonat1);
        stadion.adaugaAbonat(vecin);
        ((Stadion)stadion).notificaConcert();

    }
}
