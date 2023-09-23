package javaPuro;

import javaPuro.SingletonLazy;

/* Singleton preguiçoso
 * @author jaquelinebravin
 * vai fazer a verificação primeiro antes de retornar a instancia 
 */
public class SingletonLazy {
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
