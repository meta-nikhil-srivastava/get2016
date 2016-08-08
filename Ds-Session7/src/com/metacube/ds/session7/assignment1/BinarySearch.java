/**
 * FileName : BinarySearch.java
 */
package com.metacube.ds.session7.assignment1;

/**
 * Task 1 : Perform the Binary Search to find the Target Value
 * 
 * Binary Search is applied to search for number. Here the input array needs to be sorted 
 * Here the Binary Search is performed by Recursion
 * 
 * Task 2 : If the Target Value found in then Find the Left most occurrences of the target Value
 * 
 *  We can accomplish this Task by continuing the Binary Search Method. 

 */
public class BinarySearch {
	/**
	 * 
	 * @param array 
	 * 				- Input array
	 * @param target
	 * 				- Target Value to be Searched
	 * 
	 * @return - position of the target
	 * 							
	 */
	public int binarySearch(int array[], int target) {
		return leftMostOccurence(array, 0, array.length - 1, target);
	}
	/**
	 * 
	 * @param array
	 * @param start
	 * 				- Start Position 
	 * @param end
	 * 			  - End Position
	 * @param target
	 * 				- Target Value
	 * 
	 * @return position of the target
	 */

	public int leftMostOccurence(int[] array, int start, int end, int target) {
		int middle = (start + end) / 2;
		int tempPostion;

		if (end < start) {
			return -1;
		}//end of if 

		if (target == array[middle]) {
			tempPostion = leftMostOccurence(array, start, middle - 1, target);

			if (tempPostion == -1) {
				return middle + 1;
			}//end of if 

			else {
				return tempPostion;
			}//end of else
		}//end of if 

		else {

			if (target < array[middle]) {
				return leftMostOccurence(array, start, middle - 1, target);
			}//end of if 

			else {

				return leftMostOccurence(array, middle + 1, end, target);
			}//end of else
		}//end of else
	}//end of leftMostOccurence()
}//end of BinarySearch
