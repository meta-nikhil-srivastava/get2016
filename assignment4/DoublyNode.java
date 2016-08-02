/**
 * Node data type for use in Doubly linked list creation and operation
 */
package assignment4;

public class DoublyNode<E> {
	private E data; // To store the data
	private DoublyNode<E> next; // To store the address for the next node in the
								// linked list
	private DoublyNode<E> previous; // To store the address for the previous node
									// in the linked list

	/**
	 * Sets value for data with the given parameter
	 * @param data
	 */
	public void setData(E data) {
		this.data = data;
	}

	/**
	 * @return the value of data
	 */
	public E getData() {
		return data;
	}

	/**
	 * sets the value of next node with the given parameter
	 * @param next
	 */
	public void setNext(DoublyNode<E> next) {
		this.next = next;
	}

	/** 
	 * @return the value of the next node
	 */
	public DoublyNode<E> getNext() {
		return next;
	}

	
	public void setPrevious(DoublyNode<E> previous) {
		this.previous = previous;
	}

	/** 
	 * @return the value of the previous node
	 */
	public DoublyNode<E> getPrevious() {
		return previous;
	}

}
