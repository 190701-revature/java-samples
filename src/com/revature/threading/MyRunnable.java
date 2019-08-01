package com.revature.threading;

/*
 * What kind of interface is Runnable?
 * A functional interface!
 * Which means we can use a lambda expression to automatically
 * implement the interface.
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello everyone from thread: " + Thread.currentThread().getName());
	}

}
