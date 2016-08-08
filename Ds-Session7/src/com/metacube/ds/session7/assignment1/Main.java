/**
 * FileName : Main.java
 */
package com.metacube.ds.session7.assignment1;


import java.util.Scanner;

/**
 * This class acts as Main Class for the BinarySearch.java 
 * To find the Left most occurrences of the given Target Value 
 * 
 * @author Nikhil
 *
 */
public class Main {

	public static int[] performSorting(int[] inputArray) {
		int swap;

		//Sorting Operation
		for (int index1 = 0; index1 < ( inputArray.length - 1 ); index1++) {

			for (int index2 = 0; index2 < inputArray.length - index1 - 1; index2++) {

				if (inputArray[index2] > inputArray[index2+1]) 
				{
					swap = inputArray[index2];
					inputArray[index2] = inputArray[index2+1];
					inputArray[index2+1] = swap;
				}//end of for if
			}
		}//end of for loop

		return inputArray;

	}//end of performSorting() 


	public static void main(String[] args) {

		BinarySearch binarySearch = new BinarySearch();
		int totalElements,target,searchResult;
		try{

			Scanner input = new Scanner(System.in);

			System.out.println("Please Enter the number of Elements");
			totalElements = input.nextInt();
			int[] inputArray = new int[totalElements];

			//Input the Array Elements

			System.out.println("Enter the array Elements");
			for(int index = 0; index<totalElements;index++){
				inputArray[index] = input.nextInt();
			}//end of for loop

			/**
			 * Now we perform the Sorting Operation coz its not necessary that our given array is in 
			 * Sorted order
			 */
			inputArray = performSorting(inputArray);

			/**
			 * Searching Task
			 */
			System.out.println("Enter the Element to be Searched");
			target = input.nextInt();
			searchResult = binarySearch.binarySearch(inputArray,target);

			/**
			 * Searching Task Evaluation 
			 * 
			 */
			if(searchResult ==-1)
			{
				System.out.println("Elemnet Not Found");

			}//end of if

			else{

				System.out.println("Element Found at " + searchResult + " Position");
			}//end of else

		}//end of Try

		catch(Exception exp){

			System.out.println("Wrong Input");

		}//end of catch block
	}


}//end of Main class
