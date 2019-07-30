package com.revature.other;

import com.revature.access.AccessModifiers;

public class ChildClass extends AccessModifiers{
	public static void main(String[] args) {
		System.out.println(AccessModifiers.a);
		System.out.println(AccessModifiers.b);
		
		// Default access variables cannot be accessed outside the same package
		// as their declaration
//		System.out.println(AccessModifiers.c);
		
		// d is private, it cannot be accessed outside its own class file
//		System.out.println(AccessModifiers.d);
		
	}
}
