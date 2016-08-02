package assignment3;
import java.util.NoSuchElementException;

/**
 * Linked list implementation using arrays 
 * Its inheriting the Node class
 */
public class SinglyLinkedList<E> extends Node<E> {
	public static final int INITIAL_CAPACITY = 10;
	/**
	 * Non-parameterized constructor to initialize the value of number of
	 * elements present in the linked list to zero
	 */
	public SinglyLinkedList() {
	}

	Node<E> start = new Node<E>();
	Node<E> currentNode = null;

	/**
	 * It will add data to link list
	 * @param : data to be added to list
	 */
	public void add(E data) {
		Node<E> newNode = new Node<E>();
		newNode.data = data;
		if (start.next == null) {
			start.next = newNode;
		} else {
			currentNode = start.next;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}
	/**
	 * method to traverse the whole list and display list items
	 */
	public void traverse() {

		currentNode = start.next;
		System.out.println("link list : ");

		while (currentNode != null) {

			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	/**
	 * method to remove dataItem from link list
	 * @param dataItem  : data item to be removed from list           
	 * @return : true if data item is successfully removed from list
	 */
	public boolean removeDataItem(E dataItem) {
		Node<E> previous = new Node<E>();
		currentNode = start.next;
		if (currentNode.data == dataItem) {
			start.next = currentNode.next;
			return true;
		} else {
			while (currentNode != null) {
				if (currentNode.data == dataItem) {
					previous.next = currentNode.next;
					return true;
				}
				previous = currentNode;
				currentNode = currentNode.next;
			}
		}
		throw new NoSuchElementException();
	}

	/**
	 * method to remove item on given index
	 * @param index: index from which the item is to be removed
	 * @return : true if the item at index is removed successfully
	 */
	public boolean removeItemOnIndex(int index) {
		Node<E> previous = new Node<E>();
		currentNode = start.next;
		int incrementor = INITIAL_CAPACITY;
		if (index == INITIAL_CAPACITY) {
			start.next = currentNode.next;
			return true;
		} else {
			while (currentNode != null) {
				if (index == incrementor) {
					previous.next = currentNode.next;
					return true;
				}
				previous = currentNode;
				currentNode = currentNode.next;
				incrementor++;
			}
		}
		throw new IndexOutOfBoundsException();
	}

	/**
	 * method to get item at index
	 * @param index : index of item
	 * @return : data item at index
	 */
	public E getItem(int index) {
		int incrementor = INITIAL_CAPACITY;
		currentNode = start.next;
		while (incrementor < index) {
			currentNode = currentNode.next;
			incrementor++;
			if (currentNode == null) {
				throw new IndexOutOfBoundsException();
			}
		}
		return currentNode.data;
	}

	/**
	 * method to add data at position in list
	 * @param position: position at which data is to be added
	 * @param data
	 *            : data to be added at position
	 * @return : true if data is successfully added at position
	 */
	public boolean addAtlocation(int position, E data) {

		int incrementor = INITIAL_CAPACITY;
		Node<E> newNode = new Node<E>();
		newNode.data = data;

		if (position == INITIAL_CAPACITY) {

			newNode.next = start.next;
			start.next = newNode;
			return true;
		} else {

			currentNode = start.next;
			while (incrementor < position - 1) {

				currentNode = currentNode.next;
				if (currentNode == null) {

					throw new IndexOutOfBoundsException();
				}
				incrementor++;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
			return true;

		}

	}

	/**
	 * method to reverse the link list
	 */
	public void reverseList() {

		if (start.next == null) {

			return;
		} else {

			currentNode = start.next;
			Node<E> firstPointer = new Node<E>();
			Node<E> secondPointer = new Node<E>();

			while (currentNode != null) {

				secondPointer = firstPointer;
				firstPointer = currentNode;
				currentNode = currentNode.next;
				firstPointer.next = secondPointer;
			}
			start.next = firstPointer;
			secondPointer.next.next = null;
		}

	}

	/**
	 * method to get the size of the list
	 * 
	 * @return number of elements in list
	 */
	public int getSize() {

		int size = 0;
		currentNode = start.next;

		while (currentNode != null) {

			size++;
			currentNode = currentNode.next;
		}
		return size;
	}

	/**
	 * This method sets the given object at the given position
	 * @param object
	 * @param index
	 * @return
	 */
	public E set(E object, int index) {

		currentNode = start.next;
		int counter = 0;
		if (index < getSize() - 1) {

			while (currentNode != null && counter < index) {
				counter++;
				currentNode = currentNode.next;
			}
			currentNode.data = object;
			return currentNode.data;
		} else {

			throw new IndexOutOfBoundsException();
		}
	}

	/**
	 *This method sorts the linked list
	 */
	public void sort() {

		int size = this.getSize();
		mergeSort(0, size - 1);
	}

	/**
	 * Method to perform merge sort of the object array 
	 * @param low
	 * @param high
	 */
	private void mergeSort(int low, int high) {

		if (low < high) {

			int middle = low + (high - low) / 2;
			mergeSort(low, middle);
			mergeSort(middle + 1, high);
			merge(low, middle, high);
		}
	}

	/**
	 * This method is used to merge the linked list
	 * @param low : starting index
	 * @param middle : middle index
	 * @param high : upper bound of array
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void merge(int low, int middle, int high) {

		E[] helper = (E[]) new Object[getSize()];

		for (int i = low; i <= high; i++) {

			helper[i] = getItem(i);
		}
		int lowerBound = low;
		int middleIndex = middle + 1;
		int lowerIndex = low;

		while (lowerBound <= middle && middleIndex <= high) {

			if (((Comparable) helper[lowerBound])
					.compareTo(helper[middleIndex]) < 0) {
				E old = getItem(lowerIndex);
				old = helper[lowerBound];
				set(old, lowerIndex);
				lowerBound++;
			} else {
				E old = getItem(lowerIndex);
				old = helper[middleIndex];
				set(old, lowerIndex);
				middleIndex++;
			}
			lowerIndex++;
		}
		while (lowerBound <= middle) {
			E old = getItem(lowerIndex);
			old = helper[lowerBound];
			set(old, lowerIndex);
			lowerIndex++;
			lowerBound++;
		}
	}
}
