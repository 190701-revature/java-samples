package com.revature.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Collections
 * Collections are all about data structures.
 * 
 */
public class CollectionsIntro {
	public static void main(String[] args) {
		listExample();
	}

	/*
	 * List is an ordered collection of items.
	 * The list interface maintains order as it is considered an important
	 * part of the collection. Added items will, by default, be added at the end
	 * of the list. The list will compress as items deleted. 
	 * 
	 * There are two primary kinds of lists you will likely see:
	 * 1. ArrayList
	 * 2. LinkedList
	 * 
	 * but there are plenty more as well!
	 */
	private static void listExample() {
		List<Integer> intList = new ArrayList<>();
		
		intList.add(3);
		intList.add(5);
		intList.add(7);
		intList.add(11);
		
		// Retrieval
		System.out.println(intList.get(2));
		
		//IndexOutOfBoundsException
//		System.out.println(intList.get(5));
		
		// Checking if exists
		// Expectation: True
		System.out.println(intList.contains(7));
		// Expectation: False
		System.out.println(intList.contains(1));
		
		List<Integer> containsCheckList = new ArrayList<>();
		containsCheckList.add(3);
		containsCheckList.add(5);
		
		// Expectation: True
		System.out.println(intList.containsAll(containsCheckList));

		containsCheckList.add(6);
		// Expectation: False
		System.out.println(intList.containsAll(containsCheckList));
		
//		reversing a list
		Collections.reverse(intList);
		
		System.out.println(intList);
		intList.remove(1);
		System.out.println(intList);
		
		// array.length
		// String.length()
		intList.size();
		
		int[] myArr = {1, 2, 3};
		// An ArrayList backed by myArr, with the backing array being 
//			immutable by the list
		List<Integer> myNewList = Arrays.asList(new Integer[]{1, 2, 3});
//		myNewList.add(12);
		
		for(Integer i : myArr) {
			System.out.println(i);
		}
		
	}
}
