package com.revature.exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Try-Catch blocks are used to provide handling for dangerous code.
 * 
 * Code which is considered dangerous is nested within the try block
 * and fallback behavior is nested within the catch block. The catch block
 * must declare what exception(s) it intends to catch. You can chain multiple
 * catch blocks if the handling of various exceptions differs.
 *
 * In addition, if there is any code that must always run, then we can include
 * this in a terminating finally block.  This code will run regardless of whether
 * an exception was thrown, if it was handled, or even if the try or catch block 
 * explicitly returns.
 */
public class TryCatch {
	public static void main(String[] args) {
//		simpleTryCatch();
//		System.out.println(tryFinally());
//		tryWithoutResources();
//		tryWithResources();
		throwExample();
	}

	
	/**
	 * What is the difference between:
	 * Throw - Keyword used to explicitly throw an instance of an exception
	 * Throws - Part of method signature declaring the risk of throwing an exception
	 * Throwable - Interface that all exception and error types implement 
	 */
	private static void throwExample() {
		throw new NullPointerException();
	}

	private static void tryWithoutResources() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(new File("my-file.txt"));
			fw.append("Hello from my file!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Try with resources is a specific utility syntax associated with try
	 * blocks, in which you can define or reference any variable whose type implements
	 * the class AutoCloseable, and this resource will automatically be closed when
	 * the try-catch-finally block concludes.
	 */
	private static void tryWithResources() {
		try(FileWriter fw = new FileWriter(new File("try-with-resources.txt"))) {
			fw.append("Hello from try with resources!");
		} catch (IOException e) {
			System.out.println(":(");
		}
	}
	
	
	

	private static int tryFinally() {
		int returnValue = 0;
		try {
			System.out.println("Try");
			String str = null;
			returnValue = 1;
		} catch (Exception e) {
			System.out.println("Catch");
			return 2;
		} finally {
			System.out.println("Finally");
			return 3;
		}
		
//		return 4;
	}

	private static void simpleTryCatch() {
		Object object = new Object();
		System.out.println("Before try block!");
		try {
			System.out.println("Before calling toString!");
			object.toString();
			System.out.println("After calling toString!");
		} catch (NullPointerException | ArithmeticException  e) {
			System.out.println("NullPointerException caught!");
		}
		System.out.println("After try-catch block!");
	}
	
	
}










