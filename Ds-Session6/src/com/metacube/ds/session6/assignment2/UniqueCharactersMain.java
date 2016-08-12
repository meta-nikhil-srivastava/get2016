/**
 * 
 */
package com.metacube.ds.session6.assignment2;

import Helper.InputClass;

/**
 * @author Nikhil
 *
 */
public class UniqueCharactersMain {

	/**
	 * Main function to control the flow of execution
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		UniqueCharacters uc = new UniqueCharacters();
		InputClass input = new InputClass();
		String inputArray = new String();
		System.out.println("Please Enter the String ");
		inputArray = input.getStringValue();
		uc.checkUnique(inputArray);
		System.out
				.println("Number of unique characters in the given test case\n"
						+ inputArray + "\n" + uc.getUniqueCount());
	}

	}


