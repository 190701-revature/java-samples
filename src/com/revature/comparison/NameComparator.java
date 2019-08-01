package com.revature.comparison;

import java.util.Comparator;

/*                 alternate         natural
 * The interface | Comparator     | Comparable
 *               |                |
 * define the    |                |
 *   method:     | compare        | compareTo
 *               |                |
 * with this many|                |
 *  arguments    |   2            |     1
 *               |                |
 * in            | a different    | the same class
 *               |   class        |
 *               |                |
 */
public class NameComparator implements Comparator<Drink>{
	@Override
	public int compare(Drink a, Drink b) {
		return a.getName().compareToIgnoreCase(b.getName());
	}
}
