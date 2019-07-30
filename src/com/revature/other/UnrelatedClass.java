package com.revature.other;

import com.revature.access.AccessModifiers;

public class UnrelatedClass {
	public static void main(String[] args) {
		System.out.println(AccessModifiers.a);
		
		// To access a protected members it must be either in the same package OR
		// a child class. This is neither, so no access is granted.
//		System.out.println(AccessModifiers.b);
		
		// Default access variables cannot be accessed outside the same package
		// as their declaration
//		System.out.println(AccessModifiers.c);
		
		// d is private, it cannot be accessed outside its own class file
//		System.out.println(AccessModifiers.d);
		
	}
}
