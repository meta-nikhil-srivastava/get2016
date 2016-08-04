/**
 * FileName : PreOderTraversal.java
 * This class performs the PreOrder Traversal for the Binary Tree
 */
package com.metacube.ds.session3.assignment1;

/**
 * This method is for traversing the Binary tree in pre order and print the node
 * values
 * 
 * @author NIKHIL
 * @param <E>
 *            To define the data type at the time of execution
 */
public class PreOderTraversal<E> {
	/**
	 * Preorder Traversal for Binary Tree
	 * @param traversalNode-
	 * 						Reference of the Node which is to be traversed 
	 */
	public void preOrder(Node<E> traversalNode) {
		if (traversalNode == null)	//Checks the tree is empty or not
			return;
		System.out.println(traversalNode.getElement());//Display the PreOrder
		preOrder(traversalNode.getLeft());
		preOrder(traversalNode.getRight());
	}

}
