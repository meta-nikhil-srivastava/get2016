/**
 * FileName : SortingSystemMain.java
 */
package com.metacube.ds.session8.assignmnt2;

import java.util.Scanner;

import com.metacube.utility.UserInterface;

/**
 * This class is act as Driver (main) class for the SortingSystem
 * 
 * @author Nikhil
 *
 */
public class SortingSystem {

	public void sortingSystem() {
		Scanner scan;
		int inputArray[] = null, result[] = null;
		int arraySize = 0;
		
		UserInterface ui = new UserInterface();
		SupportClass support = new SupportClass();
		
		char choiceCharacter;
		try {
			do {
				
				scan = new Scanner(System.in);
				ui.displayMessage();

				int integerChoice = ui.getIntegerInput();

				switch (integerChoice) {
				case 1:
					System.out.println("Enter Size Of Array");
					//size = Integer.parseInt(scan.next());
					arraySize = ui.getIntegerInput();
					
					if (arraySize <= 0) {
						System.out.println("Invalid Size");
						break;
					}
					inputArray = new int[arraySize];
					for (int index = 0; index < arraySize; index++) {
						System.out.println("Enter the "+ (index+1) + " Value");
						//inputArray[index] = Integer.parseInt(scan.next());
						inputArray[index] = ui.getIntegerInput();
					}

					break;

				case 2:
					if (arraySize <= 10) {
						BubbleSort bsort = new BubbleSort();
						result = bsort.bubbleSort(inputArray);
						System.out.println("\n System has used BubbleSort coz the Elements are less than 10 ");
						ui.printSortedArray(result);
					} 
					
					else {
						QuickSort qsort = new QuickSort();
						result = qsort.quickSortResult(inputArray, 0, arraySize - 1);
						System.out.println("\n System has used QuickSort coz the Elements are greater than 10");
						ui.printSortedArray(result);
					}
					break;

				case 3:
					int digitCount = support.getDigitCount(support.maximumNumber(inputArray));
					if (digitCount <= 2) {
						
						CountingSort cSort = new CountingSort();
						System.out.println("\n System has used CountingSort coz the Elements are less than 100");
						result = cSort.countingSort(inputArray, support.maximumNumber(inputArray));
						ui.printSortedArray(result);
					} 
					else {
						RadixSort rSort = new RadixSort();
						result = rSort.radixSort(inputArray, digitCount);
						System.out.println("\n System has used RadixSort coz the Elements are greater than 100");
						ui.printSortedArray(result);
					}
					break;
				case 4:
					System.exit(0);
					break;

				default:
					System.out.println("Wrong Entry \n ");
					break;
				}

				System.out
						.println("\nDo you want to continue (Type y or n) \n");
				choiceCharacter = scan.next().charAt(0);
			} while (choiceCharacter == 'Y' || choiceCharacter == 'y');
		} 
		
		catch (Exception e) {
			e.getMessage();
			sortingSystem();
		}

	}

	
	

}
