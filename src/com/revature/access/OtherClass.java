package com.revature.access;

public class OtherClass {
	public static void main(String[] args) {
		System.out.println(AccessModifiers.a);
		System.out.println(AccessModifiers.b);
		System.out.println(AccessModifiers.c);
		
		// d is private, it cannot be accessed outside its own class file
//		System.out.println(AccessModifiers.d);
		
	}
}
