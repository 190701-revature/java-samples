package com.revature.abstraction;

/**
 * What is an interface?
 * 
 * It's a contract. It's a promise that you will implement some functionality
 * even if the consumer of that functionality cannot see it.
 * 
 * Interfaces are contracts and are intended to define how external code can
 * interact with your code. They are not part of the class hierarchy. We should
 * not use an interface to try to define hierarchical relationships between
 * classes. Generally, we name interfaces to sound like adjectives.
 * 
 * Classes can implement many interfaces.
 * Interfaces can extend many other interfaces.
 */
public interface MyInterface {
	
	// In an interface, all fields are implicitly
	// public static final
	int x = 1;
	
	
	// Methods are implicitly abstract and public
	void myMethod();
	
	// Starting with Java 8, interfaces can have default methods
	// Default methods are non-abstract methods that can be defined
	// by an interface and inherited
	default void myOtherMethod() {
		
	}
}
