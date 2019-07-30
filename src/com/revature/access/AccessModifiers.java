package com.revature.access;

/**
 * Access Modifiers
 * 
 * Levels of Access in Java:
 * 
 * 1. public - Can be accessed by anyone, anywhere 2. protected - Can be
 * accessed by any class in the same package OR a child class 3. (default) - Can
 * be accessed by any class in the same package 4. private - Can only be
 * accessed within the owning class
 * 
 * Question: How many access modifiers are there in Java? Three - default isn't
 * technically a modifier
 *
 * Access modifiers can be attached to many things: classes, and class like
 * things class members (fields and methods)
 * 
 * General recommendations: To ensure proper encapsulation, it is generally
 * strongly recommended that fields be listed as private, with public getters
 * and setters. Methods should be the appropriate access level to ensure least
 * privileges to do its job.
 * 
 * One note regarding classes: Every .java file must have a top-level public
 * class with the same name as the .java file, and can have no other top-level
 * public class.
 */
public class AccessModifiers {
	public static int a = 1;
	protected static int b = 2;
	static int c = 3;
	private static int d = 4;

	public static void main(String[] args) {
		// All accessible in this class file
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}
