package com.lists.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Ravi", "sharma", 171));
		employeeList.add(new Employee("nick", "lopes", 123));
		employeeList.add(new Employee("ayush", "shah", 145));

		employeeList.forEach(employee -> System.out.println(employee));

		System.out.println(employeeList.get(2));

		employeeList.set(3, new Employee("james", "doe", 234));
		employeeList.forEach(employee -> System.out.println(employee));
		

	}
}