package com.revature.threading;

public class ThreadingInteger {

	int x = 0;
	
	public static void main(String[] args) {

		ThreadingInteger counter = new ThreadingInteger();
		
		Thread a = new Thread(() ->  {
			for(int i = 0; i < 10_000; i++) {
				counter.x++;
			}
		});
	
		Thread b = new Thread(() ->  {
			for(int i = 0; i < 10_000; i++) {
				counter.x--;
			}
		});
		
		a.start();
		b.start();
		
		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("A state: " + a.getState());
		System.out.println("B state: " + b.getState());

		
		System.out.println(counter.x);
		
	}
}
