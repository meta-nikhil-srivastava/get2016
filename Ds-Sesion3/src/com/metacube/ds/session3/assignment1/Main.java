/**
 * It is the Main class for the Execution of the Binary Tree class  
 */
package com.metacube.ds.session3.assignment1;

import java.util.Scanner;

/**
 * @author Nikhil
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BinaryTree<Integer> newTree = new BinaryTree<Integer>();
		PreOderTraversal<Integer> pre = new PreOderTraversal<Integer>();
		PostOrderTraversal<Integer> post = new PostOrderTraversal<Integer>();
		int nodeValues, totalNodes;

		System.out.println("Enter the total no. of nodes");
		totalNodes = input.nextInt();
		
		for (int index = 0; index < totalNodes; index++) {
			System.out.println("Enter the node value :");
			nodeValues = input.nextInt();
			newTree.buildBinaryTree(nodeValues, newTree.root);

		}
		System.out.println("Preorder of the inserted element of Binary Tree");
		pre.preOrder(newTree.root);
		
		System.out.println("Postorder of the inserted element of Binary Tree");
		post.postOrder(newTree.root);
		
		input.close();
	}
}