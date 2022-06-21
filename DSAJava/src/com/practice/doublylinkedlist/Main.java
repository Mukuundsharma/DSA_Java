package com.practice.doublylinkedlist;

public class Main {
	public static void main(String[] args) {
		Bike ducati = new Bike(650, "Ducati");
		Bike bmw = new Bike(800, "BMW");
		BikeDoublyLinkedList bike = new BikeDoublyLinkedList();
		bike.addToEnd(bmw);
		bike.addToFront(ducati);
		Bike jawa = new Bike(500, "Jawa");
		bike.addBefore(jawa, ducati);
		bike.printList();
		CarDoublyLinkedList car = new CarDoublyLinkedList();
		car.addToEnd(new Car("maruti", "Swift", 450));
		car.printList();
	}
}
