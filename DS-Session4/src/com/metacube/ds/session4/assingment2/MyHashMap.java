package com.metacube.ds.session4.assingment2;

/**
 * Class to create a key value pair for the mapping
 * 
 * @author Nikhil
 *
 * @param <K>
 *            - Key
 * @param <V>
 *            - Value
 */
public class MyHashMap<K, V> {

	private Node<K, V>[] bucket; // The bucket array for the mapping
	private static final int DEFAULT_CAPACITY = 10; // The default capacity of
													// bucket
	private int capacity; // Capacity of the bucket defined
	private int[] roomNum;

	@SuppressWarnings("unused")
	private static class Node<K, V> {
		K key;
		V value;
		Node<K, V> next;

		/**
		 * Parameterized constructor to set the values of the parameters
		 * 
		 * @param key
		 * @param value
		 * @param next
		 */
		Node(K key, V value, Node<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	@SuppressWarnings("unchecked")
	public MyHashMap() {
		bucket = new Node[DEFAULT_CAPACITY];
		capacity = DEFAULT_CAPACITY;

		// Generating room numbers
		roomNum = new int[DEFAULT_CAPACITY];
		for (int i = 0; i < DEFAULT_CAPACITY; i++) {
			roomNum[i] = 101 + i;
		}
	}

	@SuppressWarnings("unchecked")
	public MyHashMap(int capacity) {
		bucket = new Node[capacity];
		this.capacity = capacity;

		// Generating room numbers
		roomNum = new int[capacity];
		for (int i = 0; i < capacity; i++) {
			roomNum[i] = 101 + i;
		}
	}

	/**
	 * Method to insert a key-value pair into the hash map in correct position
	 * by using hashing
	 * 
	 * @param key
	 *            - The key for the value
	 * @param value
	 *            - The value to be stored in the map
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void insert(K key, V value) {
		int index;
		Node<K, V> mapping;
		// Null key is not valid
		if (key == null) {
			throw new IllegalArgumentException("key cannot be null");
		}
		// Getting index value for the bucket
		index = key.hashCode() % capacity;

		// Checking if the bucket at index value is already filled
		if (bucket[index] != null) {
			// Checking if the out of bounds condition for next index value
			if ((RoomAllotment.totalCustomer + 1) == capacity) {
				index = 0;
			} else {
				index = RoomAllotment.totalCustomer + 1;
			}

			// Performing linear probing on the index value for the map
			while (bucket[index] != null) {
				if ((index + 1) == capacity) {
					index = 0;
				} else {
					index++;
				}
			}
		}
		value = (V) new Integer(roomNum[index]);
		mapping = new Node(key, value, null);
		// Adding the node at the calculated index position in the bucket
		bucket[index] = mapping;
	}

	/**
	 * Method to get the value stored using its corresponding key by the process
	 * of hashing
	 * 
	 * @param key
	 *            - The key at which we want to retrieve the value
	 * @return The value stored at the particular key
	 */
	public V get(K key) {
		// Getting the index value for the key
		int index = key.hashCode() % capacity;
		V value = null;

		// checking for the key matching at the index position
		if (bucket[index].key.hashCode() != key.hashCode()) {
			// Checking if the out of bounds condition for next index value
			if ((RoomAllotment.totalCustomer + 1) == capacity) {
				index = 0;
			} else {
				index = RoomAllotment.totalCustomer + 1;
			}

			// loop to traverse through the bucket using linear probing
			while (bucket[index].key.hashCode() != key.hashCode()) {
				if ((index + 1) == capacity) {
					index = 0;
				} else {
					index++;
				}
			}
		} else {
			value = bucket[index].value;
		}
		return value;
	}
}