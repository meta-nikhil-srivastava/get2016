package com.metacube.ds.session4.assingment1;

import java.util.Scanner;

public class HeapMain {

	/**
	 * Main method to control the flow of execution
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Priority Queue Test\n");
		Heap<String> heap = new Heap<String>();
		Helper scheduling = new Helper();

		// Insert data in heap
		while (true) {
			int userChoice = 0;
			heap.insert(new HeapNode<String>(scheduling
					.getIntfromUser("Priority"), scheduling
					.getStringfromUser("Name")));
			System.out.println("\nPress 1 for continue, 2 for exit");
			while (true) {
				userChoice = scheduling.getIntfromUser("Choice ");
				if (userChoice == 1 || userChoice == 2) {
					break;
				} else {
					System.out.println("try again, Enter 1 or 2");
				}
			}
			if (userChoice == 2) {
				break;
			}
		}
		scan.close();

		// Show all data according to priority
		while (heap.getSize() != 0) {
			System.out.println(heap.extractMax());
		}

	}

}
