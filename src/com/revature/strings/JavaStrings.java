package com.revature.strings;

public class JavaStrings {
	public static void main(String[] args) {
		// In Java Strings are
		// * objects
		// * immutable

		// What does immutable mean?
		// The object cannot be changed.
		// This does not mean that the reference cannot be reassigned.
		// Immutable refers to objects which cannot be mutated.
		// final - is refers to variables whose reference cannot be reassigned.
		// (along with methods which cannot be overridden, classes which cannot
		// be extended)

		// This string, due to it being defined as a String literal, will be
		// stored in the string pool!
		String myString = "Hello everyone!";

		// Will this be the same string object or a different string object with
		// the same name?
		String otherString = "Hello everyone!";

		// == Primitive equality and reference equality
		// .equals(obj) class defined equality
		String stringThree = otherString.substring(0);

		// what does the 'new' keyword do? Creates a NEW object!
		String stringFour = new String("Hello everyone!");
		
		String stringFive = myString.substring(0, 5);
		stringFive = stringFive.concat(stringThree.substring(5));

		System.out.println(myString.equals(otherString));
		System.out.println(myString == otherString);

		System.out.println(myString.equals(stringThree));
		System.out.println(myString == stringThree);

		System.out.println(myString.equals(stringFour));
		System.out.println(myString == stringFour);

		System.out.println(myString.equals(stringFive));
		System.out.println(myString == stringFive);
		
		System.out.println(myString == stringFive.intern());

	}
}
