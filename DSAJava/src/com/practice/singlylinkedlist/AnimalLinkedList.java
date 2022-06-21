package com.practice.singlylinkedlist;

public class AnimalLinkedList {

	public AnimalNode head;
	public int size;

	public void addToFront(Animal animal) {
		AnimalNode node = new AnimalNode(animal);
		node.setNext(head);
		head = node;
		size++;
	}

	public void addToEnd(Animal animal) {

		AnimalNode node = new AnimalNode(animal);
		if (head == null) {
			head = node;
		} else if (head.getNext().equals(null)) {
			node.setNext(head);
			head = node;
		}
		size++;
	}

	public AnimalNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}
		AnimalNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	public AnimalNode removeFromEnd() {
		if (isEmpty()) {
			return null;
		}
		AnimalNode removedNode = new AnimalNode(null);
		if (removedNode.getNext() == null) {
			removedNode = null;
			size--;
		}
		return removedNode;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void printList() {
		AnimalNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

}
