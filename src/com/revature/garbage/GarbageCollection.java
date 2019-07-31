package com.revature.garbage;

import java.util.ArrayList;
import java.util.List;

/**
 * Both Java and JavaScript are memory managed languages, such that we as developers
 * don't need to manually manage the allocation and deallocation of memory. We still
 * need to understand how memory works, so that we don't wastefully use it, which
 * can cause the program to crash, but more importantly, will probably result in a 
 * program that is more expensive to run.
 * 
 * Things that are still in scope and accessible in any fashion cannot be deallocated
 * from memory. If this problem grows severe enough, it can result in 
 * an OutOfMemoryError
 *
 * Garbage Collection is a process that runs automatically in the background
 * whenever the JVM decides that it's time to run. This usually means that it's
 * running low on memory and has decided that it's time to clean up.
 * 
 * We can request that Garbage Collection run by using System.gc(). It will, in most 
 * cases, run when requested, but there is no absolute guarantee. That said, it is
 * very unlikely that there is any situation in which you calling System.gc() will
 * positively affect system performance.
 *
 */
public class GarbageCollection {
	public static void main(String[] args) {
//		oome();
		gcDemo();
	}
	
	private static void gcDemo() {
		for(int i = 0; i < 10_000_000; i++) {
			if (i % 100000 == 0) {
				System.out.println("Created: " + MyThing.createdCount);
				System.out.println("Deleted: " + MyThing.deletedCount);
			}
			new MyThing();
		}
	}

	public static void oome() {
		List<String> myList = new ArrayList<>();
		String str = "";
		int i = 0;
		while(true) {
			i = (i + 1) % 26;
			str = str + ((char)(i+'a'));
			myList.add(str);
		}
	}
}

class MyThing {
	static String[] message = {"Ouch", "Oh no!", "Ahh!!"};
	public static int createdCount = 0;
	public static int deletedCount = 0;
	
	// Constructors in Java use the name of the class with no return type
	public MyThing() {
		createdCount++;
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		deletedCount++;
	}
}
