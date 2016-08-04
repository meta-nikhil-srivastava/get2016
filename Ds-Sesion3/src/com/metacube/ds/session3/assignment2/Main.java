package com.metacube.ds.session3.assignment2;

/**
 * This is the Main class for MirrorBinary Tree Class
 */

import java.util.Scanner;

import com.metacube.ds.session3.assignment1.*;

/**
 * @author NIKHIL
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BinaryTree<Integer> newTree = new BinaryTree<Integer>();
		MirrorBinaryTree<Integer> newMirrorTree = new MirrorBinaryTree<Integer>();
		//PreOderTraversal<Integer> pre = new PreOderTraversal<Integer>();
		int nodeValues, totalNodes;
		
		System.out.println("Enter the total no. of nodes");
		totalNodes = input.nextInt();
		
		for (int i = 0; i < totalNodes; i++) {
			System.out.println("Enter the node value for Binary Tree :");
			nodeValues = input.nextInt();
			newTree.buildBinaryTree(nodeValues, newTree.root);
		}
		
		for (int i = 0; i < totalNodes; i++) {
			System.out.println("Enter the node value for Mirror Tree :");
			nodeValues = input.nextInt();
			newMirrorTree.buildMirrorTree(nodeValues, newMirrorTree.rootMirror);
		}
		/*
		 * System.out.println("Preorder of the inserted element of BinaryTree");
		 * pre.preOrder(newTree.root); System.out.println(
		 * "Preorder of the inserted element of Mirror Binary Tree");
		 * pre.preOrder(newMirrorTree.rootMirror);
		 */
		System.out.println("two trees is "
				+ newMirrorTree.mirrorEquals(newTree.root,
						newMirrorTree.rootMirror) + " mirror");

		input.close();
	}
}
