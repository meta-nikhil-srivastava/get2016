/**
 * FileName : Queue.java
 */
package com.metacube.ds.session2.assignment2;

/**
 * Implementation of queue using array in java
 * 
 * @author Nikhil
 * @param <E>
 * 			- Object Type
 *
 */
public class Queue<E> {
    private Object[] data;
    private int size;
    private int front;
    private int rear;;
    public static final int DEFAULT_CAPACITY = 30;

    public Queue() {
	front = 0;
	rear = 0;
	size = 0;
	data = new Object[DEFAULT_CAPACITY];
    }

    /**
     * To add element in the queue i.e enqueue
     */
    public void enQueue(E item) {
	data[rear] = item;
	rear++;
	size++;
    }

    /**
     * This method removes the element from the front of the queue i.e dequeue
     * 
     * @return
     */
    public Object deQueue() {
	Object requiredData = data[front];
	front++;
	size--;
	return requiredData;
    }

    public void makeEmpty() {
	data = null;
	size = 0;
    }

    /**
     * Return the least recently used element from the queue
     * 
     * @return
     */
    public Object getFront() {
	return data[front];
    }
/**
 * 
 * @return the number of elements in the queue
 */
    public int getSize() {
	return size;
    }
    /**
     * 
     * @return size when its empty
     */
    public boolean isEmpty()
    {
    	return(size==0);
    }
}
