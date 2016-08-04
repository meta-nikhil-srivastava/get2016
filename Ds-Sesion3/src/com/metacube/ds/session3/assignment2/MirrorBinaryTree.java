package com.metacube.ds.session3.assignment2;
import com.metacube.ds.session3.assignment1.*;

/**
 * FileName : MirrorBinaryTree.java
 * 
 * This class is for the creation of Mirror binary tree in which the values are entered
 * by the user
 * 
 * @author NIKHIL
 *
 */
public class MirrorBinaryTree<E> {
	Node<E> rootMirror; // root for mirror 
	
	/**
	 * Unparameterized constructor to set the value of rootMirror to null
	 */
	
	public MirrorBinaryTree(){
		rootMirror = null;
	}

/**
 * This method is for the creation of mirror Binary tree
 * 
 * @param data
 *  	       : Value to be Inserted

 * @param tempRefremce
 */
	public void buildMirrorTree(E data, Node<E> tempRefremce) {
		
		if (rootMirror == null) {//For the First node
			rootMirror = new Node<E>();
			rootMirror.setElement(data);
			rootMirror.setLeft(null);
			rootMirror.setRight(null);
		}// end of if
		
		else if (data.toString().compareTo(tempRefremce.getElement().toString()) >= 0
				&& tempRefremce.getLeft() == null)  //we convert both data tempRefrence into string
													//and we compare them
		{
			Node<E> newnode = new Node<E>();   //Creating the object of the Node 
			newnode.setElement(data);
			newnode.setLeft(null);
			newnode.setRight(null);
			tempRefremce.setLeft(newnode);
			return;
		}//end of if else 
		
		else if (data.toString().compareTo(tempRefremce.getElement().toString()) < 0
				&& tempRefremce.getRight() == null) //we convert both data tempRefrence into string
													//and we compare them
		{
			Node<E> newnode = new Node<E>();
			newnode.setElement(data);
			newnode.setLeft(null);
			newnode.setRight(null);
			tempRefremce.setRight(newnode);
			return;
		}// end of else if 
		
		//This conditions executes when the both left and right is not Null 
		else {
			if (data.toString().compareTo(tempRefremce.getElement().toString()) >= 0) {
				buildMirrorTree(data, tempRefremce.getLeft());
			} else {
				buildMirrorTree(data, tempRefremce.getRight());
			}
		}//end of else
	}//end of buildMirrorTree

	/**
	 * This function check whether the created tree is reversed or not
	 * 
	 * @param left : Left node of the Root Node
	 * 
	 * @param right : Right node of the Root Node
	 * 
	 * @return TRUE or False if the Tree is Mirror or Not
	 */
	boolean mirrorEquals(Node<E> left, Node<E> right) {
		if (left == null || right == null)
			return left == null && right == null;
			
		//When both are not Null
			return left.getElement().toString()
				.compareTo(right.getElement().toString()) == 0
				&& mirrorEquals(left.getLeft(), right.getRight())
				&& mirrorEquals(left.getRight(), right.getLeft());
	}//end of mirrorEquals
}//MirrorBinaryTree class
