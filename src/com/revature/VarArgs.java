package com.revature;

/**
 * VarArgs - (Variable Arguments)
 * Basically just the Rest operator in JS.
 * 
 *
 */
public class VarArgs {
	public static void main(String[] args) {
		varArgs(1);
		varArgs(1, 2, 3);
		varArgs(5, 10, 25, 100, 500);
	}
	
	// ... syntax is varargs, i can call it with any number of integer arguments
	// NOTE: If you have more arguments, varargs MUST be the last argument
	// AND you cannot have more than one varargs argument.
	public static void varArgs(int... ints) {
		int counter = 0;
		for(int i = 0; i < ints.length; i++) {
			counter += ints[i];
		}
		System.out.println(counter);
	}
}




