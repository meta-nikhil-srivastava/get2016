/**
 * FileName : EmployeeOperator.java
 */
package com.metacube.ds.session6.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * THis class if to perform all types of sorting of the data
 * 
 * @author Nikhil
 *
 */
public class EmployeeOperator {

	private HashMap<String, Employee> employees; // Map for mapping the employee id with the details uniquely 													 
	private Employee details; // The employee object
	private Scanner scan; // to take input from the user
	private List<String> keys; // List of keys

	public EmployeeOperator() {
		employees = new HashMap<String, Employee>();
		keys = new ArrayList<String>();
		scan = new Scanner(System.in);
	}

	/**
	 * Method to get the details of the employee
	 */
	public void getDetails() {
		String choice; // choice for entering more employee details
		String name = ""; // to get name of the employee
		String id = ""; // to get id of the employee
		String address = ""; // to get address of the employee
		do {
			do {
				System.out.println("Enter ID");
				id = scan.nextLine();
				/* Checking for duplicate employee id */
				if (employees.containsKey(id.toLowerCase())) {
					System.out.println("ID already exist");
					continue;
				}

				System.out.println("Enter name");
				name = scan.nextLine();

				System.out.println("Enter address");
				address = scan.nextLine();
			} while (employees.containsKey(id.toLowerCase()));

			details = new Employee(id, name, address);
			/* Adding the employee details to map */
			employees.put(id.toLowerCase(), details);
			/* adding id to key list */
			keys.add(id.toLowerCase());

			System.out.println("Enter more employee details [y/n] :");
			choice = scan.nextLine();
		} while (choice.equalsIgnoreCase("y"));
	}

	/**
	 * Method to display the employee details
	 */
	public void display() {
		List<Employee> objects = new ArrayList<Employee>();

		/* Getting the employee objects */
		for (int i = 0; i < keys.size(); i++) {
			objects.add(employees.get(keys.get(i)));
		}

		/* Sorting in the natural order */
		System.out.println("\nSorting in natural order");
		Collections.sort(objects);
		// Printing the sorted employee list
		for (Employee e : objects) {
			System.out.println(e);
		}

		/* Sorting based on the names of the employee */
		System.out.println("\nSorting on the basis of name");
		Collections.sort(objects, new NameComparator());
		// Printing the sorted employee list
		for (Employee e : objects) {
			System.out.println(e);
		}
	}

	

}