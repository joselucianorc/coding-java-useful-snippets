package br.com.joselucianorc.useful.snipets.designpatterns.gof.singleton;

public class SingletonThreadSafe {
	
	private static SingletonThreadSafe instance;

	public static SingletonThreadSafe getInstance() {
		if (instance == null) {
			synchronized(SingletonThreadSafe.class) {
				if (instance == null) {
					instance = new SingletonThreadSafe();
				}
			}
		}
		return instance;
	}
}
