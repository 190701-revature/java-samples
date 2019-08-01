package com.revature.threading;

/**
 * All threads are in one of a set of enumerated thread states
 *
 *	1. NEW - New thread, run has not been called yet by start()
 *  2. RUNNABLE - Thread is qualified to be the currently executing thread
 *  3. TIMED_WAITING - Waiting for a defined amount of time (Thread.sleep())
 *  4. WAITING - Waiting for an unspecified amount of time (Thread.join())
 *  5. BLOCKED - Requires a resource that another thread holds a lock on.
 *  6. TERMINATED - Thread execution is complete. It's dead.
 *
 */
public class ThreadStates {
	public static void main(String[] args) {
		newThreadDemo();
		runnableThreadDemo();
		timedWaitingDemo();
		waitingDemo();
		blockedDemo();
		terminatedDemo();
	}

	private static void terminatedDemo() {
		Thread thread = new Thread(() -> {});
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Expecting TERMINATED: " + thread.getState());
	}

	private static void newThreadDemo() {
		Thread thread = new Thread();
		System.out.println("Expecting NEW: " + thread.getState());
	}
	
	private static void runnableThreadDemo() {
		Thread thread = new Thread(() -> {
			for(int i = 0; i < 10_000_000; i++) {
				
			}
		});
		
		thread.start();
		System.out.println("Expecting RUNNABLE: " + thread.getState());
	}
	
	private static void timedWaitingDemo() {
		Thread thread = new Thread(() ->  {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		thread.start();
		
		// Wait a little to give the other thread a chance to get to its sleep
		// method
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Expecting TIMED_WAITING: " + thread.getState());
	}
	
	private static void waitingDemo() {
		Thread joinedThread = new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread waitingThread = new Thread(() -> {
			try {
				// Pauses execution of the current thread until the thread
				// referenced by .join terminates
				joinedThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		joinedThread.start();
		waitingThread.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		
		System.out.println("Expecting WAITING: " + waitingThread.getState());
	}
	
	static void blockedDemo() {
		// Most Thread safe classes using synchronized methods
		// Atomic classes generally use logical operations to prevent multithreaded
		// problems: AtomicInteger
		
		// Synchronized block - Uses a block that provides an object to lock
		// upon
		
		Object o = new Object();
		
		Thread a = new Thread(() -> {
			
			// Locks o for this thread
			// a has exclusive access to o for the duration of this block
			synchronized (o) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread b = new Thread(() -> {
			try {
				Thread.sleep(100);
				// b will attempt to lock o, but a has access to it, so it
				// becomes blocked until a finishes with o
				synchronized (o) {
					Thread.sleep(2000);
				}
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		a.start();
		b.start();
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Expecting BLOCKED: " + b.getState());
	}
	
	
}
