/**
 * FileName : Stack.java
 */

package com.metacube.ds.session2.assignment1;

import java.util.EmptyStackException;

/**
 * This class implements the Stack Operations
 *  
 * @author NIKHIL
 *
 * @param <E>
 */
public class Stack<E> {

	private int size;
	private Node<E> top;

	/**
	 * Non-parameterized constructor for value initialization
	 */
	public Stack() {
		size = 0;
		top = null;
	}

	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty() {
		return (size == 0);
	}

	/**
	 * Adds the specified data to the top of the stack
	 * 
	 * @param data
	 *            - to be added in the stack
	 */

	public void push(E data) {
		Node<E> temp = new Node<E>(data);
		temp.setNext(top);
		top = temp;
		size++;
	}

	/**
	 * Removes the top element from the stack and return the reference to the
	 * element
	 * 
	 * @return Reference to the top element of the stack after removing it from
	 *         the stack
	 * @throws EmptyStackexception
	 */
	public E pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		E requiredData = top.getData();
		top = top.getNext();
		size--;
		return requiredData;

	}

	/**
	 * 
	 * @return the top element reference from the stack without removing it
	 * @throws EmptyStackException
	 */
	public E peek() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.getData();

	}

	/**
	 * 
	 * @return the size of the stack i.e the number of elements in the stack
	 */
	public int getSize() {
		return size;
	}

}
