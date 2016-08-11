/**
 * FileName : BubbleSort.java
 */
package com.metacube.ds.session8.assignmnt2;

/**
 * this class sort array using bubble
 *sort
 */
public class BubbleSort {

	public int[] bubbleSort(int array[]){
		int size = array.length;
		for(int index1 = 0 ; index1 < size ; index1++){
			for(int index2 = 0 ; index2 < size - index1-1 ; index2++){
				if(array[index2] > array[index2+1]){
					swap(array , index2 , index2+1);  	//swapping of array element
				}
			}
		}
		
		
		return array;
	}
	
	//swapping logic
	public void swap(int array[] , int index ,int nextIndex  ){
		int temp = array[index];
		array[index] = array[nextIndex];
		array[nextIndex] = temp;
	}
}
