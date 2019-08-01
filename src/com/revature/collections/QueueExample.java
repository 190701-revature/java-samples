package com.revature.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue -  First-in First-Out (FIFO)
 *
 */
public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer> intQueue = new LinkedList<>();
		
		intQueue.addAll(Arrays.asList(new Integer[] {1, 2, 3}));
		
		// poll - returns and removes the first item from the list
//		intQueue.poll();
		
		// Example processing a Queue
		Integer item = null;
		while ((item = intQueue.poll()) != null) {
			System.out.println(item);
		}
		
		// Retrieve the head of the queue without removing it
		intQueue.peek();
		
	}
}
