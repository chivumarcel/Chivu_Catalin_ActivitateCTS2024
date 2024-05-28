package Singleton.InnerStaticHelper;

public class SingletonInnerStaticHelper {
	private SingletonInnerStaticHelper() { // constructor privat ->singleton
	}
	
	private static class SingletonHelper { //aici este stocat
		private static final SingletonInnerStaticHelper instance =
				new SingletonInnerStaticHelper();
	}
	
	public static SingletonInnerStaticHelper getInstance() {//ofera acea unica instanta
		return SingletonHelper.instance;
	}
}
