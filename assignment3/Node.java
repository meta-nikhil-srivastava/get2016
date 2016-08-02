package assignment3;

/**
 * Node data type for use in singly linked list creation and operation
 * @param <E> : object type
 */
public class Node<E> {
	
	public E data;
	Node<E> next;
	
	public Node() {
	
		data=null;
		next=null;
	}
	
	/**
	 * parameterized constructor
	 * It will Invokes when the dataValue is passed 
	 * @param dataValue :  input node value 
	 */
	public Node(E dataValue){
		
		data=dataValue;
		next=null;
	}
	
}
