package com.practice.singlylinkedlist;

public class Main {

	public static void main(String[] args) {

		AnimalLinkedList animals = new AnimalLinkedList();
		
		Animal wolf = new Animal(80, "wolf", "wild");
		Animal cat = new Animal(20, "cat", "Pet");
		animals.addToFront(cat);
		Animal dog = new Animal(50, "Dog", "Pet");
		animals.addToFront(dog);
		Animal lion = new Animal(100, "Lion", "wild");
		animals.addToFront(lion);
		animals.addToEnd(wolf);
		animals.removeFromFront();//no result
		animals.printList();

	}

}
