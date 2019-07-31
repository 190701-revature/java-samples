package com.revature.wrappers;

import java.util.ArrayList;
import java.util.List;

/*
 * WrapperClasses
 * 
 * WrapperClasses are specifically a set of 8 classes that are used to wrap around
 * primitive types. They are necessary because generics in Java cannot use any
 * data type that is not an "object". The wrapper classes use the full name of the
 * datatype and start with a capital letter.
 * 
 * Autoboxing - When a primitive is supplied to an object or is assigned to an object
 * that is typed to a wrapper class, Java will automatically and implicitly "box"
 * the primitive into the wrapper type.
 * 
 * Autounboxing - When a wrapper type is supplied to an object or is assigned as 
 * a variable that requires a primitive, the primitive will automatically be extracted
 * from the wrapper class and assigned.
 * 
 * byte -> Byte
 * short -> Short
 * int -> Integer
 * long -> Long
 * char -> Character
 * float -> Float
 * double -> Double
 * boolean -> Boolean
 *
 */
public class WrapperClasses {
	public static void main(String[] args) {
//		List<int> list; -- doesn't work!
		List<Integer> myList = new ArrayList<>();
		
		int i = 6;
		myList.add(i); // How does this work?
		int y = myList.get(0); // How does this work?
		
		System.out.println(y);
		
		// The Wrapper types also expose a lot of static helper methods
		Integer.max(5, 20);
	}

}
