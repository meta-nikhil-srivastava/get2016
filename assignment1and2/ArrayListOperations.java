package assignment1and2;

/**
 * This is an array list implementation class to implement all the
 * operations of array list using array
 */

public class ArrayListOperations<E> implements ArrayListInterface{

	private int size = 0;

	private Object[] elementData;

	/* Initial capacity of the array list */
	public static final int defaultCapacity = 10;

	/**
	 * Non parameterized constructor
	 */
	public ArrayListOperations() {
		elementData = new Object[defaultCapacity];
	}

	/** 
	 * @return the size - the number of elements present in the array list
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @return true if this list contains no elements
	 */

	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * To add the an element in the array list 
	 * @param value
	 */
	public void add(E value) {
		/*
		 * Check if the array list is full or not and if it is then increase the
		 * size of the array list by calling the increase capacity function
		 */
		if (size == elementData.length) {
			increaseCapacity();
		}
		elementData[size++] = value;

	}

	/**
	 * To make sure that the array list never gets full and gets increased in
	 * size when required
	 */
	public void increaseCapacity() {
		Object newArray[];
		newArray = copyAll(elementData);
		elementData = newArray;
	}

	/**
	 * To copy all elements from one array to another
	 * @param oldArray
	 * @return
	 */
	public Object[] copyAll(Object[] oldArray) {

		Object newArray[] = new Object[oldArray.length * (3 / 2) + 1];
		for (int index = 0; index < oldArray.length; index++) {
			newArray[index] = oldArray[index];
		}
		return newArray;
	}

	/**
	 * @param index- index position at which element is required
	 * @return the element present at the index given by the user
	 */

	@SuppressWarnings("unchecked")
	public E get(int index) {
		rangeCheck(index);

		return (E) elementData[index];
	}

	/**
	 * Checks if the input range by the user is valid or not
	 * @param index
	 */
	private void rangeCheck(int index) {
		if (index > size || index < 0)
			System.out.println("Invalid index");
	}

	/**
	 * @param o Object type value
	 * @return The first occurrence of the given element in the array list
	 */
	public int indexOf(Object o) {
		if (o == null) {
			for (int i = 0; i < size; i++)
				if (elementData[i] == null)
					return i;
		} else {
			for (int i = 0; i < size; i++)
				if (o.equals(elementData[i]))
					return i;
		}
		return -1;
	}

	/**
	 * Adds element at the given position and shifts all the items needed
	 * @param value- To be added
	 * @param position- position at which addition is to be done
	 */
	public void allElement(E value, int position) {
		if (size + 1 == elementData.length) {
			increaseCapacity();
		}
		for (int index = size; index > position; index--) {
			elementData[index] = elementData[index - 1];
		}
		elementData[position] = value;
		size++;
	}

	/**
	 * 
	 * @param position- index at which element is required
	 * @return the element at the given index
	 */
	public Object getElement(int position) {
		if (size >= position) {
			return elementData[position];
		} else
			return null;

	}

	/**
	 * 
	 * @param value
	 *            - The element which is required
	 * @return the first occurrence of the given element
	 */
	public int getElement(E value) {
		for (int index = 0; index < size; index++) {
			if (value.equals(elementData[index])) {
				return index;
			}
		}
		return -1;
	}
	/**
	 * removes the element from the linked list present at the position given by the user 
	 * @param position
	 */
	public void remove(int position) {
		if (size > 0 && size > position) {
			for (int index = position; index < size - 1; index++) {
				elementData[index] = elementData[index + 1];
			}
			size--;
		}
	}

	/**
	 * Removes the first occurrence of the given object
	 * @param value
	 */
	public void remove(Object value) {
		for (int index = 0; index < size; index++) {
			if (elementData[index].equals(value))
				;
			{
				remove(index);
			}
		}
	}

	/**
	 * Empty the array list and deletes all the elements
	 */
	public void clear() {
		elementData = new Object[defaultCapacity];
		;
	}

	/**
	 * Adds all element from one array list to another array list
	 * @param list2
	 * @return
	 */

	public Object addAll(ArrayListOperations<E> list2) {
		for (int i = 0; i < list2.getSize(); i++) {
			this.add(list2.get(i));
		}
		return this.elementData;
	}

	/**
	 * Reverse the whole array list sequence
	 */
	public void reverse() {
		for (int index = 0; index < (size / 2 - 1); index--) {
			Object temp = elementData[index];
			elementData[index] = elementData[size - index - 1];
			elementData[size - index - 1] = temp;
		}
	}

	/**
	 * Sorts the array list
	 * 
	 * @param array
	 *            - array of objects
	 */
	public void sort() {
		mergeSort(0, size - 1);
	}
	/**
	 * merge sort helper for sorting the array list
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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void merge(int low, int middle, int high) {
		Object[] temp = new Object[size];
		for (int i = low; i <= high; i++) {
			temp[i] = elementData[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		while (i <= middle && j <= high) {
			if (((Comparable) temp[i]).compareTo(temp[j]) < 0) {
				elementData[k] = temp[i];
				i++;
			} else {
				elementData[k] = temp[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			elementData[k] = temp[i];
			k++;
			i++;
		}
	}

}
