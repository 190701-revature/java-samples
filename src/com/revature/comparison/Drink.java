package com.revature.comparison;

public class Drink implements Comparable<Drink> {
	String name;
	int flavor;
	boolean sweet;
	boolean sour;
	boolean bitter;
	boolean salty;
	boolean umami;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFlavor() {
		return flavor;
	}

	public void setFlavor(int flavor) {
		this.flavor = flavor;
	}

	public boolean isSweet() {
		return sweet;
	}

	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}

	public boolean isSour() {
		return sour;
	}

	public void setSour(boolean sour) {
		this.sour = sour;
	}

	public boolean isBitter() {
		return bitter;
	}

	public void setBitter(boolean bitter) {
		this.bitter = bitter;
	}

	public boolean isSalty() {
		return salty;
	}

	public void setSalty(boolean salty) {
		this.salty = salty;
	}

	public boolean isUmami() {
		return umami;
	}

	public void setUmami(boolean umami) {
		this.umami = umami;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bitter ? 1231 : 1237);
		result = prime * result + flavor;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (salty ? 1231 : 1237);
		result = prime * result + (sour ? 1231 : 1237);
		result = prime * result + (sweet ? 1231 : 1237);
		result = prime * result + (umami ? 1231 : 1237);
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
		Drink other = (Drink) obj;
		if (bitter != other.bitter)
			return false;
		if (flavor != other.flavor)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salty != other.salty)
			return false;
		if (sour != other.sour)
			return false;
		if (sweet != other.sweet)
			return false;
		if (umami != other.umami)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Drinks [name=" + name + ", flavor=" + flavor + ", sweet=" + sweet + ", sour=" + sour + ", bitter="
				+ bitter + ", salty=" + salty + ", umami=" + umami + "]";
	}

	public Drink(String name, int flavor, boolean sweet, boolean sour, boolean bitter, boolean salty, boolean umami) {
		super();
		this.name = name;
		this.flavor = flavor;
		this.sweet = sweet;
		this.sour = sour;
		this.bitter = bitter;
		this.salty = salty;
		this.umami = umami;
	}

	public Drink() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Drink o) {
		return  o.flavor - this.flavor;
	}

}
