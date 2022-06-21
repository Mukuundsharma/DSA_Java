package com.practice.doublylinkedlist;

public class Bike {
	private int horsePower;
	private String name;

	public Bike(int horsePower, String name) {
		this.horsePower = horsePower;
		this.name = name;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public String getName() {
		return name;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bike [horsePower=" + horsePower + ", name=" + name + "]";
	}
}
