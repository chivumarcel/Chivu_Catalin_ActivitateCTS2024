package ro.ase.acs.main;

import ro.ase.acs.factorymethod.AbstractOfficeDocumentFactory;
import ro.ase.acs.factorymethod.OfficeDocument;
import ro.ase.acs.factorymethod.WordDocumentFactory;
import ro.ase.acs.prototype.BuildingBlock;
import ro.ase.acs.prototype.StoneBlock;
import ro.ase.acs.prototype.WoodBlock;
import ro.ase.acs.singletonregistry.SingletonRegistry;

//SEMINAR 5, Bogdan Iancu
public class Main {
    public static void main(String[] args) {
//        SingletonRegistry registry = new SingletonRegistry();
//        SingletonRegistry.Logger logger = registry.getSingleton(
//                SingletonRegistry.Logger.class.getSimpleName());
//
//        logger.log("First log");
//
//        SingletonRegistry.DatabaseConnection db = registry.getSingleton(
//                SingletonRegistry.DatabaseConnection.class.getSimpleName());
//        db.connect();
        AbstractOfficeDocumentFactory factory = new WordDocumentFactory();
        OfficeDocument document = factory.createDocument();
        document.open();

        BuildingBlock block1 = new WoodBlock();
        BuildingBlock block2 = new StoneBlock();
        BuildingBlock block4;

        try{ block3 = (BuildingBlock) block1.clone()

        }catch ()
    }
}

// avantaje simple factory - incalca open close principle
// avantaj factory - respecta open/close principle
// dezavantaje - numarul de clase implicat
// dezavantaj - fara utilizarea unui IOC container, scap de instantierea factory (dar nu scap de instantierea obiectului)

// JAVA - se face mereu deep copy - nu se face shallow copy!