/**
 * FileName : PostOrderTraversal.java
 */
package com.metacube.ds.session3.assignment1;

/**
 * This method is for traversing the Binary tree in post order and print the
 * node values
 * 
 * @author NIKHIL
 * @param <E> -					
 * 			    To define the data type at the time of execution
 */
public class PostOrderTraversal<E> {
	/**
	 * Post order Traversal for Binary Tree
	 * @param traversalNode 			
	 * 						Reference of the Node which is to be traversed 
	 */
	public void postOrder(Node<E> traversalNode) {
		if (traversalNode == null)	//Checks the tree is empty or not
			return;
		postOrder(traversalNode.getLeft());
		postOrder(traversalNode.getRight());
		System.out.println(traversalNode.getElement());//Display the PostOrder
	}

}
