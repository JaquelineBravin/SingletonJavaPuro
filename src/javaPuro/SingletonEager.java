package javaPuro;

import javaPuro.SingletonEager;

/* Singleton apressado
 * @author jaquelinebravin
 *  instancia direto
 */
public class SingletonEager {
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}

}
