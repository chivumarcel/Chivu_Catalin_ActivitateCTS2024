package Singleton.Collection;

public class Angajat {
	private String nume;

	public Angajat(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Angajat [nume=" + nume + "]";
	}
	
	
}
