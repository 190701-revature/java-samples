package com.revature;

import java.util.function.Function;

/**
 * Variable Scopes
 * ------------------
 * 1. Local Scope - Scoped to the code block
// *  Must be defined in a code block!
 *
 */
public class Scopes {
	
	// Member scope or object scope
	// Member scoped variables are scoped to instances of the class
	// and can be accessed using an instance or 'this'
	int x = 1;
	
	// Static scope
	// Static scoped members (fields or methods) are associated with the class
	// and NOT instances of that class. Static members have no instance context.
	// Therefore, you cannot use 'this' in a static method.
	// Static variables have only one value regardless of how many instances of the 
	// class there are
	static int y = 20;
	
	
	// Method/Parameter scope - args here is Method/paremeter scoped
	public static void main(String[] args) {
		// Locally scoped to the main block
		int myInt = 20;
		if (true) {
			// Locally scoped to the condition block
			byte myByte = 12;
		}
		
		System.out.println(myInt);
//		System.out.println(myByte); Out of scope
		
//		this.x = 29; main method is a static method, therefore no object context
		Scopes scopes = new Scopes();
		scopes.x = 20; // Can be accessed through an object
		scopes.getX();
		
		
		// Java does not have complete support for closures
		// Arrow function for Java
		int outsideArrow = 500;
		Function<Integer, Integer> myFunction = (Integer x) -> x + outsideArrow;
		System.out.println(myFunction.apply(20));
	}
	
	int getX() {
		return this.x;
	}
}
