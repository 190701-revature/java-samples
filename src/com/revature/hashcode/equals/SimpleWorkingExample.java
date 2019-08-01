package com.revature.hashcode.equals;

import java.util.HashSet;
import java.util.Set;

public class SimpleWorkingExample {
	public static void main(String[] args) {
		veryBrokenExample();
//		workingExample();
//		aLittleBrokenExample();
	}
	
	
	
	private static void veryBrokenExample() {
		// TODO Auto-generated method stub
		Set<VeryBrokenContract> set = new HashSet<>();
		set.add(new VeryBrokenContract(1, 5));
		set.add(new VeryBrokenContract(1, 5));
		set.add(new VeryBrokenContract(1, 5));
		set.add(new VeryBrokenContract(5, 10));
		set.add(new VeryBrokenContract(1, 5));
		System.out.println(set);
	}

	private static void aLittleBrokenExample() {
		Set<SlightlyBrokenContract> set = new HashSet<>();
		set.add(new SlightlyBrokenContract(1, 5));
		set.add(new SlightlyBrokenContract(3, 7));
		set.add(new SlightlyBrokenContract(1, 5));
		set.add(new SlightlyBrokenContract(5, 10));
		set.add(new SlightlyBrokenContract(1, 1));
		System.out.println(set);
	}

	static void workingExample() {
		// What is a Set?
		// A set contains unique items, should not contain any duplicates
		
		// Internally the HashSet will run the HashCode method on the new object
		// determine if there is already something with this hashcode being used
		// if not, assumes it to be unique and adds to the set.
		// if the hashcodes do match, it will then call equals on each item
		// in the bucket of the hashcode to determine if it's non-unique among
		// items in the bucket
		Set<MaintainedContract> set = new HashSet<>();
		set.add(new MaintainedContract(1, 5));
		set.add(new MaintainedContract(3, 7));
		set.add(new MaintainedContract(1, 5));
		set.add(new MaintainedContract(5, 10));
		set.add(new MaintainedContract(1, 1));
		System.out.println(set);
	}
}


class VeryBrokenContract {
	int x, y;

	/*
	 * We don't know if it will call equals
	 * hashcodes are unlikely to match
	 * It will be possible that we may have duplicates in our set.
	 * By duplicate we mean, two objects that would return true from .equals
	 * were they compared.
	 */
	@Override
	public int hashCode() {
		System.out.println("Calling hashCode on " + this);
		return (int)(Math.random() * 100);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Calling equals on " + this);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VeryBrokenContract other = (VeryBrokenContract) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VeryBrokenContract [x=" + x + ", y=" + y + "]";
	}

	public VeryBrokenContract(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}

class SlightlyBrokenContract {
	int x;
	int y;


	public SlightlyBrokenContract(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/*
	 * 1. Hashcode will always return the same value so 
	 * 	the Set must check equals against every object in the set. 
	 */
	@Override
	public int hashCode() {
		System.out.println("Calling hashcode on: " + this);
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Calling equals on: " + this);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SlightlyBrokenContract other = (SlightlyBrokenContract) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "SlightlyBrokenContract [x=" + x + ", y=" + y + "]";
	}
}

class MaintainedContract {
	int x;
	int y;

	// Format code
	// ctrl+shift+f

	// Open Generation Menu
	// alt+shift+s

	public MaintainedContract(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MaintainedContract other = (MaintainedContract) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MaintainedContract [x=" + x + ", y=" + y + "]";
	}

	
}
