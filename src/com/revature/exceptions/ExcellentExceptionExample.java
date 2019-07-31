package com.revature.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;

public class ExcellentExceptionExample {
	
	// Go-to for handling money
	BigDecimal bigDecimal;
	
	public static void main(String[] args) {
		// Keyboard shortcut for renaming an identifier:
		// alt+shift+r
		try {
			checkedExceptionTest();	
		} catch (ArithmeticException | FileNotFoundException e) {
			// This catch block can handle both ArithmeticException 
			//  and FileNotFoundException
			e.printStackTrace();
		}
		
		runtimeException(0);
	}
	
	private static void runtimeException(int y) throws ArithmeticException {
		double x = 100.0f / y;
		System.out.println(100 * 0.000000000000000000000000000000000000000000001f);
		System.out.println(x);
	}

	/**
	 * Using these IO tools, we run the risk of throwing the IOException type
	 * FileNotFoundException.  We have two options since this is a Checked Exception.
	 * 
	 * 1. Add a try/catch block that catches FileNotFoundException or a parent exception.
	 * 2. Add a 'throws' declaration to the method signature.
	 * 
	 * Adding 'throws' indicates that this method itself has a risk of throwing the
	 * exception. Meaning that calling methods, will then have to handle it. This is 
	 * passing the responsibility of handling the exception to the caller.
	 */
	
	public static void checkedExceptionTest() throws FileNotFoundException {
		new FileReader(new File("my-file.txt"));
	}
}
