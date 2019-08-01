package com.revature.threading;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Thread running!" + Thread.currentThread().getName());
	}
}
