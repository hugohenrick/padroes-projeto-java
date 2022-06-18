package com.hugohenrick.gof.singleton;

/**
 * Singleton "apressado"
 * @author hugohenrick
 *
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
