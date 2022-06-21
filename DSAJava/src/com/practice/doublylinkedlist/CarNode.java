package com.practice.doublylinkedlist;

public class CarNode {
	private CarNode previous, next;
	private Car car;

	public CarNode(Car car) {
		this.car = car;
	}

	public CarNode getPrevious() {
		return previous;
	}

	public CarNode getNext() {
		return next;
	}

	public Car getCar() {
		return car;
	}

	public void setPrevious(CarNode previous) {
		this.previous = previous;
	}

	public void setNext(CarNode next) {
		this.next = next;
	}

	public void setCar(Car car) {
		this.car = car; 
	}

	public String toString() {
		return car.toString();
	}
}
