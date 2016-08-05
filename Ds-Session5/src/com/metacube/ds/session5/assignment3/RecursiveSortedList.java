/**
 * FileName : RecursiveSortedList.java
 */
package com.metacube.ds.session5.assignment3;

import java.util.LinkedList;

/**
 * This class will insert an element in the Sorted Link List 
 * By Recursion
 * 
 * @author Nikhil
 *
 * @param <E> - Object Type
 */

public class RecursiveSortedList<E> {
	
	private LinkedList<E> linkReference = new LinkedList<E>();
	
	/**
	 * This method add the element in sorted order
	 * 
	 * @param index where to insert data
	 * 
	 * @param dataValue is element to be inserted
	 */
	
	public void addAtIndex(int index, E dataValue){
		
		if(index >= linkReference.size()){
			linkReference.add(dataValue);
		}//end of if
		
		else{
			if(linkReference.get(index).toString().compareTo(dataValue.toString())>0){
				linkReference.add(index, dataValue);
			}
			else{
				addAtIndex(++index , dataValue);
			}
		}//end of else
	
	}// end of add()
	
	/**
	 * This is function which calls add(index,value) function
	 * @param value is element to be inserted
	 */
	
	public void add(E value){
		if(linkReference.size() == 0){
			linkReference.add(value);
		}
		
		else{
			addAtIndex(0,value);
		}
	}
	
	/**
	 * This function will print all elements in list
	 */
	
	public void printSortedList(){
		for (E index : linkReference) {
			System.out.println(index);
		}
	}
}
