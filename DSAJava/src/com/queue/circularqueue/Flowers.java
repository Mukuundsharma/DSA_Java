package com.queue.circularqueue;

public class Flowers {
	private String typeOfPlant, smell, name;

	@Override
	public String toString() {
		return "Flowers [typeOfPlant=" + typeOfPlant + ", smell=" + smell + ", name=" + name + "]";
	}

	public String getTypeOfPlant() {
		return typeOfPlant;
	}

	public String getSmell() {
		return smell;
	}

	public String getName() {
		return name;
	}

	public void setTypeOfPlant(String typeOfPlant) {
		this.typeOfPlant = typeOfPlant;
	}

	public void setSmell(String smell) {
		this.smell = smell;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Flowers(String typeOfPlant, String smell, String name) {
		this.typeOfPlant = typeOfPlant;
		this.smell = smell;
		this.name = name;
	}

}
