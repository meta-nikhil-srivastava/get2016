/**
 * Main.java
 */
package com.metacube.ds.session5.assignment3;

import java.util.Scanner;
/**
 * This class Will act Main class for RecursiveSortedList
 * @author Nikhil
 *
 */
public class Main {

	public static void main(String[] args) {
		
		RecursiveSortedList<Integer> list = new RecursiveSortedList<Integer>();
		Scanner input = new Scanner(System.in); 
		int value,index;
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		System.out.println("Enter the position to input and the value ");
		index = input.nextInt();
		value= input.nextInt();
		list.addAtIndex(index,value);
		System.out.println("Sorted List is ");
		list.printSortedList();
		input.close();

	}

}
