package com.revature.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Parent {
	int a;
	private int b;
	
	public void doSomething() {
		
	}
	
	/**
	 * You can overload methods in Java, by using the same name,
	 * but having different method parameters. Note: Different return types or
	 * access modifiers will not overload.
	 */
	
	public void printSomething(String a) {
		System.out.println("String thing");
	}
	
	public void printSomething(Integer a) {
		
	}
	
	public void printSomething(String a, String b) {
		
	}
	
	public void printSomething(CharSequence a) {
		System.out.println("CharSequence thing");
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		p.printSomething("");
		
		Child c = new Child();
		c.printSomething("");
		
		Parent a = new Child();
		a.printSomething("");

		List<Parent> list = new ArrayList<>();
		list.add(p);
		list.add(c);
		list.add(a);
		
		list.forEach(i -> i.printSomething(""));
		
	}
	
}

class Child extends Parent {
	int c, d, a;
	
	public Child(int a) {
		this(); // Calls no-args constructor
		this.a = a;	// assigns value
	}
	
	public Child() {
		this.a = 10;
		super.a = 20;
	}
	
	public void printAs() {
		System.out.println(a); // Child's a
		System.out.println(super.a); // Parent's a
	}
	
	@Override // This annotation will cause an error if it does not properly override
	public void printSomething(String str) {
		System.out.println("String from child");
		super.printSomething(str);
	}
}
