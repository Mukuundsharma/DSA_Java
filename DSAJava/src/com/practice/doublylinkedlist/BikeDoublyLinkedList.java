package com.practice.doublylinkedlist;

public class BikeDoublyLinkedList {
	private BikeNode head, tail;
	private int size;

	public void addToFront(Bike bike) {
		BikeNode node = new BikeNode(bike);

		if (head == null) {
			tail = node;
		} else {
			head.setPrevious(node);
			node.setNext(head);
		}

		head = node;
		size++;
	}

	public void addToEnd(Bike bike) {
		BikeNode node = new BikeNode(bike);
		if (tail == null) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}

		tail = node;
		size++;
	}

	public boolean addBefore(Bike newBike, Bike existingBike) {
		if (head == null) {
			return false;
		}
		BikeNode current = head;
		if (current != null && !current.getBike().equals(existingBike)) {
			current = current.getNext();
		}
		if (current == null) {
			return false;
		}

		BikeNode newNode = new BikeNode(newBike);
		newNode.setPrevious(current.getPrevious());
		newNode.setNext(current);
		current.setPrevious(newNode);

		if (head == current) {
			head = newNode;
		} else {
			newNode.getPrevious().setNext(newNode);
		}

		size++;
		return true;
	}

	public BikeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}

		BikeNode removedNode = head;

		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}

		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	public BikeNode removeFromEnd() {
		if (isEmpty()) {
			return null;
		}

		BikeNode removedNode = tail;

		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}

		tail = tail.getPrevious();
		size--;
		removedNode.setPrevious(null);
		return removedNode;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void printList() {
		BikeNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
}