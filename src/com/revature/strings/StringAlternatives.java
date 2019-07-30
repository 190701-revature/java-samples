package com.revature.strings;


/**
 * Strings are immutable objects and any 'mutation' requires a new string object
 * be created. The creation of new objects is a lot of overhead, especially if you're
 * doing significant string manipulation, so it is often inefficient.
 * 
 * Java provides a couple classes designed for heavy manipulation as mutable String-like
 * objects.
 * 
 * They are:
 * * StringBuilder - NOT thread safe
 * * StringBuffer - THREAD SAFE
 *
 */
public class StringAlternatives {
	public static void test() {
		final int iterations = 1_000_000;
		
		String string = "";
		StringBuilder builder = new StringBuilder("");
		StringBuffer buffer = new StringBuffer("");
		
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < iterations; i++) {
			string = string + "a";
		}
		System.out.println(System.currentTimeMillis() - startTime);
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i < iterations; i++) {
			buffer.append("a");
		}
		System.out.println(System.currentTimeMillis() - startTime);
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i < iterations; i++) {
			builder.append("a");
		}
		System.out.println(System.currentTimeMillis() - startTime);
	}
	
	public static void main(String[] args) {	
		test();
	}
}
