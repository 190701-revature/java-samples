package com.revature.threading;

/*
 * What is a thread?
 * 
 * A thread is essentially a line of executing code. Thus far we've been dealing with
 * a single thread environment - meaning we've only the 'main' thread. Each thread
 * of execution has its own stack. The main thread starts with the 'main' method,
 * but other threads will start with the thread's 'run' method. Each thread continues
 * until its stack is empty by completing its starting method, or until an unhandled
 * exception propagates beyond its starting method.  An application will stop once
 * all non-daemon threads complete for the application. Daemon are simply special
 * threads that won't prevent the application from closing.
 * 
 * 
 * What is multithreading?
 * 
 * 		Multithreading allows us to have multiple lines of concurrently executing code, and also if
 * the architecture supports it, multiple lines parallel executing code. Multithreading brings
 * the opportunity to complete tasks more efficiently by dedicating more cores to it. Threads are a
 * good solution when you need to do IO operations but don't want to block execution during the IO
 * operation or when you need to do heavy computational work that can be easily split between threads.
 * For simple tasks, threads are not a good option because of the overhead involved with creating
 * threads and the significant increase in complexity that is introduced to your application when
 * moving from a single-threaded environment to a multi-threaded environment.
 * 
 * Downsides
 * 		* You no longer have deterministic execution of code
 *      * Creating new threads is resource intensive
 *      * Most threading behavior is based on the OS
 *      * Threads introduce dangerous behaviors which can diminish resources or completely
 *          lock the application.
 *      * Thread usage introduces race conditions and for classes that are not built for 
 *      	multithreaded environments, can introduce subtle logic errors that one might not
 *      	catch.
 *      
 * Benefits
 * 		* Able to handle complicated tasks in a divide-and-conquer fashion.
 * 		* Able to continue execution of code when working in an IO environment.
 * 
 * 
 * Side note on IO:
 * io - blocking IO operations, pretty simple
 * nio - (new IO) - Contains newer, non-blocking operations
 * nio2 - (new IO 2) - Non-blocking, reactive, streaming IO operations
 * 
 * 
 * Creating Threads
 * -----------------
 * 1. Extend the Thread class
 * 2. Implement the Runnable interface
 * 
 * Other Higher Level Alternatives:
 * --------------------------------
 * Callable interface (used for threads that can resolve to a value) (Sort of like a Promise)
 * Future and CompleteableFuture (pretty much exactly a Promise)
 * ExecutorServices (Thread pools, with operations queued for them)
 * Fork-Join - Common divide-and-conquer algorithm
 * Parallel Streams - Streams which leverage multiple threads
 * 
 * Things to know for Quiz/QC:
 * 
 * 1. States of a thread - each one and what it means
 * 2. How to create a thread (using Runnable and Thread)
 * 3. Difference between start() and run()
 * 4. Common threading issues and Deadlock
 * 5. synchronized (method and block)
 * 6. Some methods for threads
 * 7. Runnable is a function interface, consequences of this, etc.
 * 
 */
public class ThreadIntro {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread myThread = new MyThread();
		myThread.setName("New Thread");
		
		// We can't start threads by calling the run method
		// run will just invoke the 'run' method in the same thread!
//		myThread.run();
		
		// Instead, to start the thread, we call the 'start' method
		myThread.start();
		
		// To use a runnable, we pass an instance of the runnable to a new Thread
		Thread runnableThread = new Thread(new MyRunnable());
		runnableThread.start();
		
		
		// Using a lambda
		Thread lambdaThread = new Thread(() -> {
			System.out.println("Lambda thread!");
		});
		
		lambdaThread.start();
	}
}














