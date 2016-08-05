/**
 * FileName : Main.java
 */
package com.metacube.ds.session5.assignment1;

/**
 * This Class will act as Main Class for our Concorndance.java
 * 
 * It will the perform Concorndance Operations on a given string input by  
 * the user via ---> Command Line <--
 * 
 * @author Nikhil
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Concorndance inputString = new Concorndance();
		System.out.println("Enter the String");
		for(int i=0;i<args.length;i++){
			inputString.checkString(args[i]);
			inputString.printOccurrences();
		}
	}//end of main()

}
