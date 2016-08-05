/**
 * FileName : Queue.java
 * 
 *	We used Linked List for the implementation of queue because 
 * 		--> The Operations performed in Queue is enQueue (insertion) at Last
 * 		--> The Operations performed in Queue is deQueue (deletion) from First
 *  
 *  Therefore the efficency of Queue is much higher for both the cases as compared to other 
 *  Data Structures  
 */
package com.metacube.ds.session5.assignment2;

import java.util.LinkedList;

/**
 * This class implements all the operations of Queue using Linked List
 * @author Nikhil
 *
 * @param <E>
 */
public class Queue<E> {
	private LinkedList<E> queueList = new LinkedList<E>();

	/**
	 * Inserting the Element into the queue
	 * @param dataElement will insert to queue
	 */

	public void enQueue(E dataElement){
		queueList.addLast(dataElement);
	}

	/**
	 * Removing the element from the front
	 * @return
	 */
	
	public E deQueue(){
		return queueList.removeFirst();
	}
	
	/**
	 * @return queue is empty or not
	 */
	
	public boolean isEmpty(){
		return queueList.isEmpty();
	}

	/**
	 * Checks the value is contain in the queue or not
	 * @param dataElement
	 * @return true if value is contain else false
	 */
	
	public boolean contains(E dataElement){
		return queueList.contains(dataElement);
	}

	/**
	 * @return the size of the queue
	 */
	
	public int size(){
		return queueList.size();
	}

	/** 
	 * @return the element from the front
	 */
	
	public E getFront(){
		return queueList.getFirst();
	}
	
}//end of Queue class
