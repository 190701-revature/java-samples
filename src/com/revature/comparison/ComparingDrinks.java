package com.revature.comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;


/*
 * Both Comparable and Comparator (but mostly just Comparator) are a special
 * kind of interface called: Functional Interface
 * 
 * A functional interface is any interface which defines exactly one abstract method
 * 
 * In order to use a lambda expression to implement an interface, that interface MUST
 * be a functional interface
 *
 */
public class ComparingDrinks {
	public static void main(String[] args) {
		List<Drink> drinks = new ArrayList<>();
		Drink lemonade = new Drink("lemonade", 7, true, true, false, false, false);
		drinks.add(lemonade);
		
		Drink coffee = new Drink("coffee", 2, false, false, true, false, false);
		drinks.add(coffee);
		
		Drink milk = new Drink("milk", 4, true, false, false, false, true);
		drinks.add(milk);
		
		Collections.sort(drinks);
		System.out.println(drinks);
		
		// Produces a reversed Comparator which we can use to compare as an 
		// alternative to the natural order
		Collections.sort(drinks, Collections.reverseOrder());
		System.out.println(drinks);
		
		Collections.sort(drinks, new NameComparator());
		System.out.println(drinks);
				
		// Use of a lambda expression is possible because the parameter expected
		// for sort is something of type Comparator, and Comparator is a functional interface
		// therefore, we can supply a lambda expression and Java can infer that the lambda expression
		// will implement the interfaces single abstract method
		Collections.sort(drinks, (a, b) -> {
			Drink first = (Drink) a;
			Drink second = (Drink) b;
			if(first.sweet && !second.sweet) {
				return -1;
			} else if (second.sweet) {
				return 1;
			} else {
				return first.compareTo(second);
			}
		});
		
		System.out.println(drinks);
		
		PriorityQueue<Drink> pq = new PriorityQueue<>(new NameComparator());
		pq.addAll(drinks);
		
		pq.add(new Drink("tea", 7, false, false, true, false, false));
		pq.add(new Drink("Coca-Cola", 5, true, false, false, false, false));
		pq.add(new Drink("beer", 7, false, true, true, false, false));
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}







