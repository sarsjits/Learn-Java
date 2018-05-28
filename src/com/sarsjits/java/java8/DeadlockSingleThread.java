package com.sarsjits.java.java8;

/**
 * Creating a deadlock using just one thread. We will use Join for current
 * thread.
 * 
 * @author Jitendra Sarswat
 *
 */
public class DeadlockSingleThread {

	public static void main(String[] args) {
		System.out.println("Deadlock");
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("If this statement executed then deadlock didn't occur");
	}

}
