package com.revature.object;

public class ThisIsAClass {
	
	/**
	 * All objects have the .equals method, because it is defined by the Object
	 * class. By Default, .equals will return the result of == comparison.
	 * 
	 * If you want your class to define its own custom way to show equality,
	 * then you should implement the .equals method.
	 * 
	 * But, it's not that simple :(
	 * 
	 * 
	 * Hashcode-Equals Contract
	 * 1. Any two objects that return true from the .equals method must return the
	 * same integer value from .hashcode.
	 * 
	 * 2. Any two objects who return different hashcode values, must return false
	 * when compared with .equals.
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	/**
	 * A method created by the Object class which defines a method to be called to
	 * interpret your object or class as a String. By default it prints the classname
	 * and a memory address (not very useful).
	 * 
	 * You can define your own logic here.
	 */
	@Override
	public String toString() {
		return "Hi";
	}
	
	public static void main(String[] args) {
		
		// If not specified any other constructor all objects receive a default
		// no-args constructor
		System.out.println(new ThisIsAClass());
	}
	
	
}
