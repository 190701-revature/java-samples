package com.revature.threading;

public class ThreadFunctions {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread();
		
		// Names the Thread. Note: Once you name it, it's yours.
		thread.setName("Some Name");
		
		// Sets Thread priority - Higher priority threads will (maybe)
		// executor before or faster than lower priority threads
		thread.setPriority(6);
		
		// Gets stack trace - NOTE: Every thread has its own stack!
		thread.getStackTrace();
		
		// Sets thread as a daemon thread - daemon threads don't prevent
		// application from exiting due to the thread still running
		thread.setDaemon(true);
		
		// Hints to thread processor that it may be a good time to shift
		// the active thread to another thread. May be ignored.
		thread.yield();
		
		// Blocks currently executing thread until the thread join is called
		// upon completes, or the timeout is reached, if a timeout is provided
		thread.join(100);
		
		// Requests thread to sleep for the given amount of milliseconds
		thread.sleep(100);
	}
}
