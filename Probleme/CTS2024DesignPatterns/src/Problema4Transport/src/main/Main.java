package main;

import metrou.BiletMetrou;
import metrou.Calatorie;
import suprateran.AdapterCalatorie;
import suprateran.BiletCardCalatorii;
import suprateran.CardSTB;


public class Main {
    public static void validareIntrareMetrou(Calatorie calatorie){
        if(calatorie.estePermisAccesul()){
            System.out.println("Acces permis.Calatorie placuta");
    }else {
            System.out.println("Acces nepermis. Sold insuficient.");
        }
    }

    public static void validareUrcareSTB(CardSTB card){
        card.validareCalatorie();
    }

    public static void main(String[] args) {
        Calatorie biletMetrou = new BiletMetrou("Ion", 2);
        validareIntrareMetrou(biletMetrou);
        validareIntrareMetrou(biletMetrou);
        validareIntrareMetrou(biletMetrou);

        if(biletMetrou.estePermisAccesul()){
            System.out.println("Acces permis.Calatorie placuta");
    }else {
            System.out.println("Acces nepermis. Sold insuficient.");
        }

//        validareIntrareMetrou(biletMetrou);
//        CardSTB biletMixt = new AdapterCalatorie(biletMetrou);
//        validareUrcareSTB(biletMixt);
//        validareIntrareMetrou(biletMetrou);
    }
}
