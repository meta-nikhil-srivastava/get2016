/**
 * FileName : Node.java
 */
package com.metacube.ds.session2.assignment1;

/**
 * This class is for making node data type for use in linked lists
 * 
 * @author Nikhil
 *
 * @param <E>
 */
public class Node<E> {

    private E data; // To store the data

    private Node<E> next; // To store the location of the next node

    /**
     * parameterized constructor to set the value of data initially
     * 
     * @param data
     */
    public Node(E data) {
	this.data = data;
    }

    /**
     * To set the value of data
     * @param data
     */
    public void setData(E data) {
	this.data = data;
    }
/**
 * 
 * @return the value of data
 */
    public E getData() {
	return data;
    }
/**
 * To set the value of next node
 * @param next
 */
    public void setNext(Node<E> next) {
	this.next = next;

    }
/**
 * 
 * @return the value of the next node
 */
    public Node<E> getNext() {
	return next;
    }
}
