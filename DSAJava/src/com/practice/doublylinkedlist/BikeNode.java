package com.practice.doublylinkedlist;

public class BikeNode {
	private BikeNode next, previous;
	private Bike bike;

	public BikeNode getNext() {
		return next;
	}

	public BikeNode getPrevious() {
		return previous;
	}

	public Bike getBike() {
		return bike;
	}

	public BikeNode(Bike bike) {
		this.bike = bike;
	}

	public void setNext(BikeNode next) {
		this.next = next;
	}

	public void setPrevious(BikeNode previous) {
		this.previous = previous;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public String toString() {
		return bike.toString();
	}
}
