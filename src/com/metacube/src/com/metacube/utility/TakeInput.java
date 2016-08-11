package com.metacube.utility;

import java.io.BufferedReader;
import java.io.IOException;

import com.metacube.ds.session8.assigmnent2.Display;

/**
 * class to take input from user
 * 
 * @author Nikhil
 *
 */
public class TakeInput {

	private final static int INITIAL_VALUE = -92192;

	/**
	 * method to take input from user
	 * 
	 * @param message
	 *            : message to display
	 * @param buffer
	 *            : buffered reader object
	 * @return int
	 */
	public static int inputSizeOfArray(String message, BufferedReader buffer) {

		System.out.println(message);
		int input = INITIAL_VALUE;

		try {
			while (input == INITIAL_VALUE) {

				input = Integer.parseInt(buffer.readLine().trim());

				if (!validateSizeOfArray(input)) {

					input = INITIAL_VALUE;
					return inputSizeOfArray(message, buffer);
				}
			}

		} catch (NumberFormatException | IOException e) {

			System.out.println(e.getLocalizedMessage());
			return inputSizeOfArray(message, buffer);
		} catch (Exception e) {

			System.out.println(e.getLocalizedMessage());
			return inputSizeOfArray(message, buffer);
		}
		return input;
	}

	/*
	 * method to validate sizeOfArray
	 * 
	 * @param input : sizeOfArray
	 * 
	 * @return boolean
	 */
	private static boolean validateSizeOfArray(int input) {

		if (input <= 0) {

			System.out.println("number of elements can not be zero or less");
			return false;
		} else if (input > 100) {

			System.out.println("number of elements can not more than 100");
			return false;
		} else {

			return true;
		}
	}

	/**
	 * method to take array elements input from user
	 * 
	 * @param message
	 *            : message to display
	 * @param buffer
	 *            : buffered reader object
	 * @param size
	 *            : size of array
	 * @return int[]
	 */
	public static int[] inputArray(String message, BufferedReader buffer,
			int size) {

		System.out.println(message);
		int[] inputArray = new int[size];

		for (int incrementor = 0; incrementor < size; incrementor++) {

			message = "please enter element at index " + incrementor
					+ " of array";
			inputArray[incrementor] = inputArrayElement(message, buffer,
					incrementor);
		}

		return inputArray;
	}

	/*
	 * method to take array element input
	 * 
	 * @param message : message to display
	 * 
	 * @param buffer : buffered reader object
	 * 
	 * @param index : index of the array for which input is being taken
	 * 
	 * @return int
	 */
	private static int inputArrayElement(String message, BufferedReader buffer,
			int index) {

		System.out.println(message);
		int input = INITIAL_VALUE;
		try {
			while (input == INITIAL_VALUE) {

				input = Integer.parseInt(buffer.readLine().trim());
			}
		} catch (NumberFormatException | IOException e) {

			System.out.println(e.getLocalizedMessage());
			return inputArrayElement(message, buffer, index);
		} catch (Exception e) {

			System.out.println(e.getLocalizedMessage());
			return inputArrayElement(message, buffer, index);
		}
		return input;
	}

	/**
	 * method to take input the sort type from user
	 * 
	 * @param buffer
	 *            : BufferedReader Object
	 * @return selected sort type
	 */
	public static int inputSortType(BufferedReader buffer) {

		Display.displaySortMenu();
		int input = INITIAL_VALUE;
		try {
			while (input == INITIAL_VALUE) {

				input = Integer.parseInt(buffer.readLine().trim());

				if (!validateInputSortType(input)) {

					input = INITIAL_VALUE;
					return inputSortType(buffer);
				}
			}
		} catch (NumberFormatException | IOException e) {

			System.out.println(e.getLocalizedMessage());
			return inputSortType(buffer);
		} catch (Exception e) {

			System.out.println(e.getLocalizedMessage());
			return inputSortType(buffer);
		}
		return input;
	}

	/*
	 * method to validate sort type
	 * 
	 * @param input : user input
	 * 
	 * @return boolean
	 */
	private static boolean validateInputSortType(int input) {

		if (input == 1 || input == 2) {

			return true;
		} else {

			System.out.println(input + " is not a valid option");
			return false;
		}
	}

	/**
	 * method to check if array has any negative element
	 * 
	 * @param array
	 *            : input array
	 * @return boolean
	 */
	public static boolean hasNegative(int[] array) {

		for (int tempInt : array) {

			if (tempInt < 0) {

				return true;
			}
		}
		return false;
	}
}
