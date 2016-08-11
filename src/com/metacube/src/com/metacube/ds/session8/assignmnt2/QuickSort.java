/**
 * FileName : QuickSort.java
 */
package com.metacube.ds.session8.assignmnt2;

/**
 * This class performs QuickSort operation
 * 
 * @author Nikhil
 *
 */
class QuickSort {
	/*
	 * sort array & return resulting sorted array arr-->array to be sorted
	 * first-->starting index last-->end index
	 */
	public int[] quickSortResult(int inputArray[], int first, int last) {
		if (inputArray.length == 0) {
			return null;
		} else {
			if (first < last) {
				int partitionIndex = partitionArray(inputArray, first, last); // partitioning of array

				// Recursive sorting approch
				quickSortResult(inputArray, first, partitionIndex - 1);
				quickSortResult(inputArray, partitionIndex + 1, last);
			}

			return inputArray;
		}
	}

	/*
	 * partition array & return index arr-->array to be sorted first-->starting
	 * index last-->end index
	 */
	public int partitionArray(int inputArray[], int first, int last) {

		int pivot = inputArray[last]; // pivot element
		int index = first - 1;
		for (int row = first; row <= last - 1; row++) {
			if (inputArray[row] <= pivot) { // swapping of element
				index++;
				int temp = inputArray[index];
				inputArray[index] = inputArray[row];
				inputArray[row] = temp;
			}
		}

		// swapping of pivot element
		int temp = inputArray[index + 1];
		inputArray[index + 1] = inputArray[last];
		inputArray[last] = temp;

		return index + 1;
	}
}
