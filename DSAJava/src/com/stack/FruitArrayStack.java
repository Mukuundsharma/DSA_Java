package com.stack;

import java.util.EmptyStackException;

public class FruitArrayStack {
	private Fruits[] stack;
	private int top;

	public FruitArrayStack(int capacity) {
		stack = new Fruits[capacity];
	}

	public void push(Fruits fruit) {
		if (top == stack.length) {
			Fruits[] newArray = new Fruits[2 * stack.length];
			System.arraycopy(fruit, 0, newArray, 0, stack.length);
			stack = newArray;
		}
		stack[top++] = fruit;
	}

	public Fruits pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		Fruits fruit = stack[top--];
		stack[top] = null;
		return fruit;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public Fruits peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top - 1];
	}

	public int size() {
		return top;
	}

	public void printStack() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
