package com.stack;

public class Fruits {
	private int cost;
	private String name, taste;

	@Override
	public String toString() {
		return "Fruits [name=" + name + "]";
	}

	public int getCost() {
		return cost;
	}

	public String getName() {
		return name;
	}

	public String getTaste() {
		return taste;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public Fruits(int cost, String name, String taste) {
		this.cost = cost;
		this.name = name;
		this.taste = taste;
	}

}
