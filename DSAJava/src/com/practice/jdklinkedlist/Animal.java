package com.practice.jdklinkedlist;

import java.util.ListIterator;

public class Animal {
	private int weight;
	private String name, nature;

	public Animal(int weight, String name, String nature) {
		this.weight = weight;
		this.name = name;
		this.nature = nature;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public String getNature() {
		return nature;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", name=" + name + ", nature=" + nature + "]";
	}

}
