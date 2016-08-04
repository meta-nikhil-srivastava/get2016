package com.metacube.ds.session3.assignment1;

/**
 * FileName : BinaryTree.java
 * 
 * This class is for the creation of binary tree in which the values are entered
 * by the user
 *
 * @author Nikhil
 * @param <E>
 *            -Object Type
 */

public class BinaryTree<E> extends Node<E> {

	public Node<E> root; // Its is a root node for the Binary Tree

	/**
	 * Unparameterized constructor to set the value of root to null
	 */

	public BinaryTree() {
		root = null;
	}

	/**
	 * Build a Binary Tree Dynamically by input through User
	 * 
	 * @param data
	 *            : Value to be Inserted
	 * @param tempReference
	 */
	public void buildBinaryTree(E data, Node<E> tempReference) {

		if (root == null) {//For the First node
			root = new Node<E>();
			root.setElement(data);
			root.setLeft(null);
			root.setRight(null);
		} // end of if

		else if (data.toString().compareTo(
				tempReference.getElement().toString()) < 0
				&& tempReference.getLeft() == null) //we convert both data tempRefrence into string
													//and we compare them
			{
			Node<E> newnode = new Node<E>();	//Creating the object of the Node 
			newnode.setElement(data);
			newnode.setLeft(null);
			newnode.setRight(null);
			tempReference.setLeft(newnode);
			return;
		}// end of else if

		else if (data.toString().compareTo(
				tempReference.getElement().toString()) >= 0
				&& tempReference.getRight() == null) {
			Node<E> newnode = new Node<E>();
			newnode.setElement(data);
			newnode.setLeft(null);
			newnode.setRight(null);
			tempReference.setRight(newnode);
			return;
		} // end of else if
		
		//This conditions executes when the both left and right is not Null 
		else {
			if (data.toString()
					.compareTo(tempReference.getElement().toString()) < 0) {
				buildBinaryTree(data, tempReference.getLeft());
			} 
			
			else {
				buildBinaryTree(data, tempReference.getRight());
			}
		}// end of else
	}//end of buildBinaryTree Method

}//end of BinaryTree class
