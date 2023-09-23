package javaPuro;

import javaPuro.SingletonEager;
import javaPuro.SingletonLazy;
import javaPuro.SingletonLazyHolder;

public class Test {

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
	}

}
