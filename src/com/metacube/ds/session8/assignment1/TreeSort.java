/**
 * FileName: BinarySearchTree.java
 */
package com.metacube.ds.session8.assignment1;

import com.metacube.utility.*;

/**
 * This class implements the Binary Search Tree concept to sort the the Rollno. of Students
 * @author NIKHIL
 *
 */
public class TreeSort {

	UserInterface UI = new UserInterface();
	private int numberOfElements;
	private int index;
	private int inputArray[];


	/**
	 * Following function takes input from the user.
	 */
	public void getUserInput() {

		System.out.println("Enter the total number of Students");

		numberOfElements = UI.getIntegerInput();

		Node root = null;

		inputArray = new int[numberOfElements];

		for (int index = 0; index < numberOfElements; index++) {

			System.out.println("Enter the Roll No. of  " + (index + 1) + " Student : ");

			inputArray[index] = UI.getIntegerInput();

			root = binarySearchTree(root, inputArray[index]);
		}

		System.out.println("\n\nStudents in disorderly format :");
		UI.display(inputArray, numberOfElements);

		System.out.println("\n\nStudents in Inorder form : ");
		inOrder(root);
		UI.display(inputArray, numberOfElements);

	}

	/**
	 * Following function binarySearchTree() searches for the item.
	 * @param root() denotes the root node of tree.
	 * @param item(int) denotes the item to search.
	 * @return the root node.
	 */
	public Node binarySearchTree(Node root, int item) {

		if (root == null) {
			Node newNode = new Node(item);
			root = newNode;
			return root;
		} 
		
		else if (root.data > item) {
			root.left = binarySearchTree(root.left, item);
		} 
		
		else {
			root.right = binarySearchTree(root.right, item);
		}
		
		return root;
	}

	/**
	 * Following function displays the sorted array.
	 */


	/**
	 * Following function stores the elements of binary search tree in inorder form
	 * @param root
	 */
	public void inOrder(Node root) {
	
		if (root == null)
			return;
		inOrder(root.left);
		inputArray[index++] = root.data;
		inOrder(root.right);
	}

}
	