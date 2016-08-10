/**
 * FileName : StudentArrangement.java
 */
package com.metacube.ds.session8.assignment1;

import com.metacube.utility.UserInterface;

/**
 * 
 * This class Implements the Tree sorting approach to sort the  students on the basis of rollno.
 * @author Nikhil
 *
 */
public class StudentArrangement {

	/**
	 * Following function main() is a driver class for the Binary Search Tree.
	 * 
	 * @param arg - (String[]) denotes command line arguments.
	 */
	public static void main(String args[]) {
		String choiceCharacter = "y";
		int choiceValue;

		do {
			System.out.println("STudent Roll no. Arrangement System");
			System.out.println("\nPress 1 to Peform the Arrangement Task");
			System.out.println("Press 0 to Exit the System");
			System.out.println("Please Enter your Choice");
			UserInterface UI = new UserInterface();
			choiceValue = UI.getIntegerInput();

			switch (choiceValue) {

			case 1:
				TreeSort rollnoSorting = new TreeSort();
				rollnoSorting.getUserInput();
				System.out.println("\n\nDo you want to continue (Press Y)");
				choiceCharacter = UI.getCharacterValue();
				break;

			case 0:
				System.out.println("ThankYou for Using the System");
				System.exit(0);
				break;
			
			default:
				System.out.println("Wrong Input please Try Again");

			}//end of switch

		}//end of do
		while ((choiceCharacter.equalsIgnoreCase("y")));

	}//end of main

}//end of StudentArrangement
