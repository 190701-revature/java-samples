package com.revature.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Iteration {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		int counter = 0;

		// Iterate over list, and remove all items whose value is even
		// We cannot iterate and modify the list structure at the same time
		
		// Dangerous
//		for (Integer i : list) {
//			if (i % 2 == 0) {
//				list.remove(counter);
//			} else {
//				counter++;	
//			}
//		}
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Integer currentValue = iterator.next();
			if (currentValue % 2 == 0) {
				// removes from the collection the most recent thing
				// retrieved from .next()
				iterator.remove();
			}
		}
		
		System.out.println(list);
		
		// Chaining operations such that you can a single collection
		// through the chain of operations as a unit
		double average = list.parallelStream()
			.filter(i -> i % 2 != 0)
			.map(i -> i * 3)
			.collect(Collectors.averagingInt(i -> i));// terminal operation
		System.out.println(average);
	}
}
