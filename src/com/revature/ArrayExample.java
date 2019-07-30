package com.revature;

import java.util.Arrays;

import com.revature.other.Launcher2;

/*
 * Anything that is not defined in the current package
 * or is not in java.lang package (this one is automatically 
 * available without an import) must be imported.
 * 
 * Import structure is package name and class, separated by dots.
 * Autoimport shortcut: ctrl+shift+o
 * 
 */


/**
 * Arrays in Java are not like arrays in JavaScript in that:
 * 
 * They are not flexible in length.
 * They are typed.
 * This means, that arrays do not have functions like map, filter, etc.
 *
 */
public class ArrayExample {

	public static void main(String[] args) {
		
		Launcher2 launcher = new Launcher2();
		
		// Declaration of an array
		int[] myInts;
		
		// Creating an instance
		myInts = new int[10];
		
		for(int i = 0; i < myInts.length; i++) {
			System.out.println(myInts[i]);
		}
		
		// Array Literal
		myInts = new int[]{1, 2, 3};
		
		int[] myIntArray = {7, 2, 5};
		
		for(int i = 0; i < myIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}
		
		// Helper/Utility class Arrays exposes a lot of helpful array operations
		Arrays.sort(myIntArray);
		
		for(int i = 0; i < myIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}
		
	}

	
}
