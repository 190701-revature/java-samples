package com.revature.reflection.object;

import java.util.ArrayList;

/**
 * Reflection can be defined as :
 * 1. Introspection
 * 2. or meta-programming
 * 
 * Reflection allows us to interact with defined objects, fields, methods, etc.
 * programmatically. We can invoke methods without knowing their names, we can
 * enumerate parameters, call constructors, change access levels, and modify some
 * of the fundamental foundations of how are objects work.
 * 
 * Reflection is largely by frameworks who need to write code that can interact and
 * manage our objects, even though they don't know anything about those objects.
 * 
 * In addition, a lot of reflection is exposed to us as consumers of a framework
 * through annotations.
 *
 * Object.getClass() -> Provides the "Class" object for Reflection
 * Class.forName(String) -> Finds the class with the provided string package/class name.
 * 
 *
 */
public class PartyClass {

	String[] games = { "Blackjack", "Cards Against Humanity", "21", "Scrabble", "Hearts", "Bingo" };
	int players;
	ArrayList<String> snacks = new ArrayList<>();
	String location;

	public void addSnack(String snack) {
		snacks.add(snack);
	}

	public String[] getGames() {
		return games;
	}

	public void setGames(String[] games) {
		this.games = games;
	}

	public int getPlayers() {
		return players;
	}

	public void setPlayers(int players) {
		this.players = players;
	}

	public ArrayList<String> getSnacks() {
		return snacks;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public PartyClass() {
		// As a rule, the first line of a constructor MUST BE either super or this,
		// and if it is not, then super is implicitly called
		super();
		this.addSnack("Olives");
	}
}
