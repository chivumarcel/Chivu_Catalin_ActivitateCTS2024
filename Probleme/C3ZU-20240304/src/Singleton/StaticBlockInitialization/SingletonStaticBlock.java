package Singleton.StaticBlockInitialization;


public class SingletonStaticBlock {
	private static SingletonStaticBlock instance;
	
	private SingletonStaticBlock() { // constructorul privat

	}
	
	static {
		System.out.println("Aici este static block");
		try {
			instance=new SingletonStaticBlock();
		} catch(Exception e) {
			throw new RuntimeException("Exceptie aparuta la crearea instantei singleton");
		}
	}
	
	public static SingletonStaticBlock getInstance() {
		return instance;
	}
}
