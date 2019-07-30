package com.revature;

/**
 * Java Data types come in two large categories:
 * 1. Classes
 * 2. Primitives
 * 
 * Primitives are internal Java types that represent raw data and not 
 * a template for an object.  Java has only 8 primitives and we should learn
 * and know all 8. They can be easily distinguished because primitive types start
 * with a lower case letter, while all classes (SHOULD) start with a capital letter.
 *
 * Integer Types - Signed integer types
 * A whole number represented by a literal binary value.
 * 1. byte - 8bit integer
 * 2. short - 16bit integer
 * 3. int - 32bit integer
 * 4. long - 64bit integer
 * 
 * Floating Point Types
 * Can represent decimal values, suffer from precision issues. Don't use when
 * exact values need to be maintained!
 * 5. float - 32 bits of precision
 * 6. double - 64 bits of precision
 * 
 * Character Types
 * Stores character in a 16bit unsigned integer value
 * 7. char
 * 
 * Logical Types
 * Note: Java does not support truthy/falsy behavior.
 * 8. boolean
 *
 *
 */
public class Primitives {
	public static void main(String[] args) {
		// whole numbers will be interpreted as an "int literal"
		byte myByte = 20;
		short myShort = 500;
		
		// Can do this, as any byte value can be represented by a int, with no
		// loss of data
		int myInt = myByte;
		
		// Can't do this, because an integer variable could hold any possible int
		//	value and not all int valuse can be represented by a byte
//		byte badByte = myInt;
		
		// Terminate a whole number with a capital L to change it to a long literal
		long myLong = 10_000_000_000L;
		
		// Terminate a number with a lowercase f to change it to a float literal
		float myFloat = 10f;
		
		// Any number that contains a decimal point is a double literal
		// (does not need to be a terminating decimal point)
		double myDouble = 12.;
		
		// Chars can be assigned a char literal, using single quotes a single character
		char myChar = (char)('a' + 25);
		System.out.println(myChar);
		
		// booleans use the keywords true and false 
		boolean myBoolean = true || false;
		myBoolean = !(true ^ false);  // XOR - Exclusive Or (true when different)
	}
}




