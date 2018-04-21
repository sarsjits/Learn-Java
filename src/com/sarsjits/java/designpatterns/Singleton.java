package com.sarsjits.java.designpatterns;

/**
 * Simple implementation of Singleton
 * It is nowhere perfect implementation
 * @author Jitendra Sarswat
 *
 */
public class Singleton {
	public static Singleton instance = null;
	
	private Singleton() {
		System.out.println("I am born!");
	};
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
