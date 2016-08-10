package com.metacube.ds.session8.assignment1;

/**
 * this class is to create a Node 
 * @author Nikhil
 *
 */
public class Node {
	int data;
	Node right;
	Node left;

	public Node() {
		data = 0;
		right = null;
		left = null;
	}

	public Node(int item) {
		data = item;
		right = null;
		left = null;
	}
}
