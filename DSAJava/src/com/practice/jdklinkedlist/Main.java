package com.practice.jdklinkedlist;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		LinkedList<Animal> list = new LinkedList<>();
		Animal lion = new Animal(123, "Lion", "Wild");
		Animal tiger = new Animal(100, "Tiger", "Wild");
		Animal dog = new Animal(60, "Dog", "Pet");
		Animal turtle = new Animal(5, "Turtle", "Pet");
		Animal wildTurtle = new Animal(5, "Turtle", "Wild");
		list.addLast(wildTurtle);
		list.addFirst(tiger);
		list.addFirst(dog);
		list.addLast(lion);
		list.add(2, turtle);
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
