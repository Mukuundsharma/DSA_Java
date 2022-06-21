package com.stack;

public class Main {
	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		Employee janeJones2 = new Employee("Jane", "Jones", 123);
		Employee johnDoe2 = new Employee("John", "Doe", 4567);
		Employee marySmith2 = new Employee("Mary", "Smith", 22);
		Employee mikeWilson2 = new Employee("Mike", "Wilson", 3245);
		Employee billEnd2 = new Employee("Bill", "End", 78);

		ArrayStack stackArr = new ArrayStack(10);
		stackArr.push(janeJones2);
		stackArr.push(johnDoe2);
		stackArr.push(marySmith2);
		stackArr.push(mikeWilson2);
		stackArr.push(billEnd2);
		System.out.println(stackArr.peak());

		LinkedStack stack = new LinkedStack();
		stack.push(janeJones);
		stack.push(johnDoe);
		stack.push(marySmith);
		stack.push(mikeWilson);
		stack.push(billEnd);

		System.out.println("Popped: " + stack.pop());
		System.out.println(stack.peek());

	}
}
