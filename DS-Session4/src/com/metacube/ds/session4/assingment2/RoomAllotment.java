package com.metacube.ds.session4.assingment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class is for allotting the rooms to the guests
 * 
 * @author Nikhil
 *
 */
public class RoomAllotment {

	private Scanner scan; // To take input from user
	private MyHashMap<Guest, Integer> rooms; // Hash Map to map the customers with rooms
												
	public static int totalCustomer; // Total number of customers
	private List<Guest> keyList; // The customer list

	public RoomAllotment() {
		int size;
		boolean result;
		scan = new Scanner(System.in);
		keyList = new ArrayList<Guest>();
		// taking input the total number of customers
		do {
			// Exception handling for the numeric value for total customer
			try {
				System.out.println("Enter total number of customers");
				totalCustomer = Integer.parseInt(scan.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Enter numerals only");
			}
		} while (true);

		size = totalCustomer;
		// Calculating the next prime number for hash map bucket size
		do {
			size++;
			result = false;
			// loop to check for prime number
			for (int i = 2; i < size / 2; i++) {
				if (size % i == 0) {
					result = true;
					break;
				}
			}
		} while (result);
		rooms = new MyHashMap<Guest, Integer>(size);
	}

	/**
	 * Method to take the input about the customer information
	 */
	public void takeCustomer() {
		String name;
		int age;
		Guest guest;

		// loop to take input for every customer
		for (int i = 0; i < totalCustomer; i++) {
			System.out.println("Enter name");
			name = "";
			try {
				name = scan.nextLine();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// loop to get the correct value of customer age
			do {
				age = 0;
				// Exception handling for the numeric value for customer age
				try {
					System.out.println("Enter age");
					age = Integer.parseInt(scan.nextLine());
				} catch (Exception e) {
					System.out.println("Enter numerals only");
				}
			} while (age < 1);

			// creating object of customer
			guest = new Guest(name, age);

			// Adding the customer object to the list
			keyList.add(guest);
			// Mapping the customer with the room number
			// Room number will be generated automatically
			rooms.insert(guest, null);
		}
	}

	/**
	 * Method to print the room allocation for the customers
	 */
	public void printDetails() {
		System.out.println("Name\tAge\tRoom");
		// loop to traverse the customer list and print their details
		for (int i = 0; i < keyList.size(); i++) {
			System.out.println(keyList.get(i).getName() + "\t"
					+ keyList.get(i).getAge() + "\t"
					+ rooms.get(keyList.get(i)));
		}
	}

	
}