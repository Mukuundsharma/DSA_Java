package com.practice.singlylinkedlist;

public class AnimalNode {
	public Animal animal;
	public AnimalNode next;

	public AnimalNode(Animal animal) {
		this.animal = animal;
	}

	public Animal getAnimal() {
		return animal;
	}

	public AnimalNode getNext() {
		return next;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void setNext(AnimalNode next) {
		this.next = next;
	}

	public String toString() {
		return animal.toString();
	}

	public boolean hasNext() {
		if (getNext() != null) {
			return true;
		}
		return false;
	}
}
