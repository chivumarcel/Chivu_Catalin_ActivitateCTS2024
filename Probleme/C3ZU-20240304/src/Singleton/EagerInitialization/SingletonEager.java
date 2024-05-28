package Singleton.EagerInitialization;

public class SingletonEager {
	private static final SingletonEager instance 
	= new SingletonEager();
	//informatii despre mese - putem adauga
	
	private SingletonEager() {
		
	}
	
	public static SingletonEager getInstance() {
		//instance = new SingletonEager();
		return instance;
	}
	// gett-er, seter, metoda de add -- metode care gestioneaza informatiile centralizat
}
