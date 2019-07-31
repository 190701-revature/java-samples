package com.revature.abstraction;

/**
 * An abstract can have abstract methods
 * An abstract cannot be instantiated.
 * It must be extended, and then the extend concrete class can be instantiated.
 * For this reason, abstract classes are generally used to define hierarchical 
 * relationships a level that wouldn't make sense to actually instantiate, but are
 * still practical to prevent repeated code in the extended classes.
 *
 */
public abstract class MyAbstractClass {

	// Abstract classes can have abstract methods, but they are not
	// implicitly abstract like interfaces
	
	public abstract void myAbstractMethod();
	
	// Needs an implementation
//	public void otherAbstractMethod();
}
