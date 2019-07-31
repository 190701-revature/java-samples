package com.revature.generics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.function.BiFunction;

public class AdvancedGenerics {
	public static void main(String[] args) {
		ExtendsGeneric<StringBuilder> generic = new ExtendsGeneric<>();
		
		ExtendsGeneric<String> generic2 = new ExtendsGeneric<>();
//		SuperGeneric<Integer> generic3 = new SuperGeneric<>();
		
		generic.setA(new StringBuilder("Hi"));
		generic2.setA("Bye!");
	
		generic.firstCharacter();
		generic2.firstCharacter();
		
		MyGenericBox<? super IOException> myBox = new MyGenericBox();
		myBox.setObject(new FileNotFoundException());
		ExtendsGeneric.<Integer>printMe(new Integer(25));
	}
}


/**
 * It's possible to have many generic arguments.
 * Most commonly you will run into this with a Map<K, V>
 * You must define the generic typing of both the key and the value.
 * Many functional interfaces of Java also use many generic arguments.
 */
class MultipleGenericArguments<A, B, C, D> {
	A a;
	B b;
	C c;
	D d;
	
	// Functional Interface Example
	BiFunction bf;
}

class ExtendsGeneric<A extends CharSequence> {
	A charSequence;
	
	void setA(A a) {
		this.charSequence = a;
	}
	
	void firstCharacter() {
		System.out.println(charSequence.charAt(0));
	}
	
	public static <T> void printMe(T arg) {
		System.out.println(arg.toString());
	}
}

