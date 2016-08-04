/**
 * FileName : Node.Java
 * 
 * This class will act as the node for the Binary Tree
 * 
 * @author Nikhil
 */

package com.metacube.ds.session3.assignment1;
/**
 *
 * @param <E>
 * 			  - Element Type for the class
 */
public class Node<E> {
	private E element;		// Store Element Data
	private Node<E> left;	//Stores the Reference of Left Pointer
	private Node<E> right;	//Stores the References of Right Pointer
	
	/**
	 * @return -
	 * 			the data of the node
	 */
	public E getElement(){
		return element;
	}
	/**
	 * 
	 * @param dataValue 
	 * 					- data to set
	 */

	public void setElement(E dataValue){
		this.element = dataValue;
	}
	
	/**
	 * 
	 * @return the left node
	 */
	public Node<E> getLeft(){
		return left;
	}
	
	/** 
	 * @param left -
	 * 				left node to set
	 */
	public void setLeft(Node<E> left){
		this.left = left;
	}
	
	/**  
	 * @return the right node
	 */
	public Node<E> getRight() {
		return right;
	}
	
	/**
	 * 
	 * @param right
	 * 				- right to set
	 */
	public void setRight(Node<E> right) {
		this.right = right;
	}
}

