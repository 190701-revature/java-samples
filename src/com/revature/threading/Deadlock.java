package com.revature.threading;

/*
 * Deadlock is a concurrency problem in which two (or more) different 
 * threads require resources, with each holding a lock on resource
 * and requiring a lock for the resource held by the other. Thus they
 * both are waiting for the other and will not give up the resource
 * they hold a lock on.
 * 
 * When this happens, the threads will not resolve. They are blocked
 * indefinitely. On server, potentially for days, or weeks, or until the server
 * eventually crashes.
 * 
 * THRASHING
 * STARVATION 
 * 
 */
public class Deadlock {

	int aCounter = 0;
	int bCounter = 0;
	
	
	public static void main(String[] args) {
		int iterations = 1_000_000;
		Account accountA = new Account();
		Account accountB = new Account();
		
		accountA.balance = 100;
		accountB.balance = 100;
		
		Deadlock deadlock = new Deadlock();
		
		Thread a = new Thread(() -> {
			for(int i = 0; i < iterations; i++) {
				accountA.transfer(1, accountB);
				deadlock.aCounter++;
			}
		});
		
		Thread b = new Thread(() -> {
			for(int i = 0; i < iterations; i++) {
				accountB.transfer(1, accountA);
				deadlock.bCounter++;
			}
		});	
		
		a.start();
		b.start();
		
		while(a.isAlive() && b.isAlive()) {
			System.out.println(deadlock.aCounter + " " + deadlock.bCounter);
		}
	}
}

class Account {
	int balance;
	
	synchronized void deposit(int amount) {
		balance += amount;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized void withdraw(int amount) {
		balance -= amount;
	}
	
	void transfer(int amount, Account to) {
		synchronized (this) {
			synchronized (to) {
				this.withdraw(amount);
				to.deposit(amount);
			}
		}
	}
}
