package com.queue.queuearray;

public class Main {
	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

		ArrayQueue queue = new ArrayQueue(10);
		queue.add(janeJones);
		queue.add(marySmith);
		queue.add(mikeWilson);
		queue.add(johnDoe);

		queue.printQueue();
		queue.remove();
		queue.remove();
		queue.peek();
	}
}
