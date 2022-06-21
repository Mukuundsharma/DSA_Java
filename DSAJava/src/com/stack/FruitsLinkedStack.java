package com.stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class FruitsLinkedStack {
	private LinkedList<Fruits> stack;

	public FruitsLinkedStack() {
		stack = new LinkedList<Fruits>();
	}

	public void push(Fruits fruit) {
		stack.push(fruit);
	}

	public Fruits pop() {
		return stack.pop();
	}

	public Fruits peek() {
		return stack.peek();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public void printStack() {
		ListIterator<Fruits> iterator = stack.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
