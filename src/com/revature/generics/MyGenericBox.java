package com.revature.generics;

/**
 * T represents whatever type the instantiator of the class provides us
 * at time of creation.
 * If they say new MyGenericBox<String> then T will be String,
 * and if they say MyGenericBox<Integer> then T will be Integer.
 * 
 * @param <T>
 */
public class MyGenericBox <T> {
	private T object;
	
	public T getObject() {
		return object;
	}
	
	public void setObject(T object) {
		this.object = object;
	}
	
	/**
	 * Generics allow us to get compile time type safety while also getting
	 * generic, reusable code that is not bound to any particular types.
	 */
	public static void main(String[] args) {
		MyGenericBox<String> stringBox = new MyGenericBox<>();
		MyGenericBox<Integer> intBox  = new MyGenericBox<>();
		
		stringBox.setObject("Hello");
		intBox.setObject(23);
		
		// 5 minutes later
		
		int myInt = intBox.getObject();
		String myString = stringBox.getObject();
		
	}
}
