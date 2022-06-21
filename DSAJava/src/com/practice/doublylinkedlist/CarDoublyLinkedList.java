package com.practice.doublylinkedlist;

public class CarDoublyLinkedList {
	private CarNode head, tail;
	private int size;

	public void addToFront(Car Car) {
		CarNode node = new CarNode(Car);

		if (head == null) {
			tail = node;
		} else {
			head.setPrevious(node);
			node.setNext(head);
		}

		head = node;
		size++;
	}

	public void addToEnd(Car Car) {
		CarNode node = new CarNode(Car);
		if (tail == null) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}

		tail = node;
		size++;
	}

	public boolean addBefore(Car newcar, Car existingcar) {
		if (head == null) {
			return false;
		}
		CarNode current = head;
		if (current != null && !current.getCar().equals(existingcar)) {
			current = current.getNext();
		}
		if (current == null) {
			return false;
		}

		CarNode newNode = new CarNode(newcar);
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

	public CarNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}

		CarNode removedNode = head;

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

	public CarNode removeFromEnd() {
		if (isEmpty()) {
			return null;
		}

		CarNode removedNode = tail;

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
		CarNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
}
