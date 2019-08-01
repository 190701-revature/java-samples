package com.revature.collections;

import java.util.HashMap;
import java.util.Map;

/*
 * Maps are a data structure that stores key-value pairs
 * Maps are not a part of the Collection interface and are not Iterable
 * However, they are a part of the Collections API.
 */
public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> nameMap = new HashMap<>();
		
		nameMap.put(1, "Dionel");
		nameMap.put(2, "Dylan");
		nameMap.put(3, "Jon");
		
		for(Integer key: nameMap.keySet()) {
			System.out.println(key + ": " + nameMap.get(key));
		}
		
	}
}
