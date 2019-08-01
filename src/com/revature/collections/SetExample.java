package com.revature.collections;

import java.util.HashSet;
import java.util.Set;

/*
 * Sets contain a collection of unique items. When items are added the set
 * will check (in some manner) to see if that item already exists. If it does
 * it will not add the new item to the set. Otherwise, it adds it. Generally,
 * order is arbitrary and if order is important to you, you should use a list or
 * some kind of ordered Set.
 *
 */
public class SetExample {
	public static void main(String[] args) {
		Set<Integer> intSet = new HashSet<>();
		intSet.add(1);
		intSet.add(2);
		intSet.add(3);
		
		intSet.add(2);
		
		System.out.println(intSet);
		
		// Contains checks on a Set generally execute much faster than a list
		System.out.println(intSet.contains(2));		
	}
}
