/**
 * This class provide user input methods
 */
package com.metacub.jdbc.utill;

import java.util.Scanner;

public class UserInput {

	@SuppressWarnings("resource")
	public String getStringValue() {
		Scanner input = new Scanner(System.in);
		String characterValue = "";
		characterValue = input.nextLine();
		return characterValue;
	}		
}