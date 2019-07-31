package com.revature.abstraction;

public class ImplementingClasses {

}

class MyNonAbstractClass extends MyAbstractClass {
	public void myAbstractMethod() {
		
	}
}

/* An abstract class can extend a concrete class and override the implemented 
 * methods to be abstract! Neat!
 */
abstract class AnotherAbstractClass extends MyNonAbstractClass implements MyInterface {
	public abstract void myAbstractMethod();
}

/**
 * final class - a class cannot be extended
 * interfaces can't be final
 */
final class FinalClass extends AnotherAbstractClass {

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void myAbstractMethod() {
		// TODO Auto-generated method stub
		
	}
	
}

