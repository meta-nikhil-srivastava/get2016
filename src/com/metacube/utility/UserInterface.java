/**
 * FileName : UserInterface.java 
 */
package com.metacube.utility;

import java.util.Scanner;

/**
 * This class acts as the USerInterface for the other class implementation 
 * Task Perform here are 
 * --> Take Input from User 
 * --> Validation of inputs
 * --> Display of Outputs
 * 
 * @author Nikhil
 *
 */

public class UserInterface {

	public int getIntegerInput() {
		int integerValue = 0;
		Scanner input = new Scanner(System.in);
		boolean toContinue = true;
		String userinput = "";
		while (toContinue) {
			userinput = input.next();
			if (!isInputValid(userinput)) {
				System.out.println("Enter only integers");
			} 
			else {
				toContinue = false;
			}
		}
		integerValue = Integer.parseInt(userinput);
		return integerValue;
	}

	/**
	 * 
	 * @return the character value
	 */
	public String getCharacterValue() {
		Scanner input = new Scanner(System.in);
		String characterValue;
		characterValue = input.nextLine();
		return (characterValue);
	}

	public void display(int[] inputArray, int numberOfElements) {
		System.out.println();
		for (int index = 0; index < numberOfElements; index++) {
			System.out.print("\t" + inputArray[index]);
		}
	}
/**
 * 
 * @param userInput
 * @return True if valid
 */
	public boolean isInputValid(String userInput) {
		int totalChar = userInput.length();
		if (totalChar == 0) {
			return false;
		}
		for (int index = 0; index < totalChar; index++) {
			if (userInput.codePointAt(index) < "0".codePointAt(0)
					|| userInput.codePointAt(index) > "9".codePointAt(0)) {
				return false;
			}
		}
		return true;
	}
}
