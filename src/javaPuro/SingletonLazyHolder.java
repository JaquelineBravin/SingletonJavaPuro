package javaPuro;

import javaPuro.SingletonLazyHolder;
import javaPuro.SingletonLazyHolder;

/* Singleton lazyholder
 * @author jaquelinebravin
 * 
 * classe holder vai encapsular a instancia em uma classe estatica interna
 * parent safe
 */
public class SingletonLazyHolder {
	
	public static class Holder {		
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return Holder.instancia;
	}

}
