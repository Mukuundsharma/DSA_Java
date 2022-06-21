package com.queue.circularqueue;

import java.util.NoSuchElementException;

public class FlowerCircleQueue {
	private int front, back;
	private Flowers[] queue;

	public FlowerCircleQueue(int capacity) {
		queue = new Flowers[capacity];
	}

	public void add(Flowers flower) {
		if (size() == queue.length - 1) {
			int numFlowers = size();
			Flowers[] newArray = new Flowers[2 * queue.length];
			System.arraycopy(queue, front, newArray, 0, queue.length - front);
			System.arraycopy(queue, 0, newArray, queue.length - front, back);
			queue = newArray;
			front = 0;
			back = numFlowers;
		}
		queue[back] = flower;
		if (back < queue.length - 1) {
			back++;
		} else {
			back = 0;
		}
	}

	private int size() {
		if (front <= back) {
			return back - front;
		} else {
			return back - front + queue.length;
		}
	}

	public Flowers remove() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}
		Flowers flower = queue[front];
		queue[front] = null;
		front++;
		if (size() == 0) {
			front = 0;
			back = 0;
		} else if (front == queue.length) {
			front = 0;
		}

		return flower;
	}

	public void printQueue() {
		if (front <= back) {
			for (int i = front; i < back; i++) {
				System.out.println(queue[i]);
			}
		} else {
			for (int i = front; i < queue.length; i++) {
				System.out.println(queue[i]);
			}
			for (int i = 0; i < back; i++) {
				System.out.println(queue[i]);
			}
		}
	}
}
