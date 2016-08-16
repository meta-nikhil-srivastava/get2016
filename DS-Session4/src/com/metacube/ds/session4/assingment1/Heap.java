package com.metacube.ds.session4.assingment1;

import java.util.ArrayList;

public class Heap<E> {

	ArrayList<HeapNode<E>> heapArray;
	int heapSize = 0;

	/**
	 * Constructor
	 */
	public Heap() {
		heapArray = new ArrayList<HeapNode<E>>();
		heapArray.add(new HeapNode<E>());
	}

	/**
	 * sets heap size
	 */
	public void setHeapSize() {
		this.heapSize = heapArray.size() - 1;
	}

	/**
	 * Getter for heapsize
	 * 
	 * @return
	 */
	public int getSize() {
		return heapSize;
	}

	/**
	 * to insert node in heap
	 * 
	 * @param node
	 */
	public void insert(HeapNode<E> node) {
		heapArray.add(node);
		setHeapSize();
		bubbleUp(getSize());
	}

	/**
	 * To move index element to its proper position (moves bottom to up)
	 * 
	 * @param index
	 */
	private void bubbleUp(int index) {
		// find the parent index
		int parentIndex = index / 2;

		// priority of parent is greater than children or current is the root
		if (index == 1
				|| heapArray.get(parentIndex).getJobPriority() >= heapArray
						.get(index).getJobPriority()) {
			return;
		}
		// swap children and parent
		swap(parentIndex, index);
		// recursively do the same thing with new parent
		bubbleUp(parentIndex);
	}

	/**
	 * To extract node having max priority
	 * 
	 * @return E
	 */
	public E extractMax() {
		E data = heapArray.get(1).getJobData();
		swap(1, heapSize);
		heapArray.remove(heapSize);
		setHeapSize();
		sinkDown(1);
		return data;
	}

	/**
	 * To check index node is leaf
	 * 
	 * @param index
	 * @return
	 */
	private boolean isLeaf(int index) {
		return (index * 2) > heapSize;
	}

	/**
	 * To move index element to its proper position (moves top to down)
	 * 
	 * @param index
	 */
	private void sinkDown(int index) {
		if (isLeaf(index)) {
			return;
		}

		int leftChild = index * 2;
		int rightChild = index * 2 + 1;
		int maxIndex;

		if (rightChild > heapSize) {
			maxIndex = leftChild;
		} else {
			if (heapArray.get(rightChild).getJobPriority() > heapArray.get(
					leftChild).getJobPriority()) {
				maxIndex = rightChild;
			} else {
				maxIndex = leftChild;
			}
		}

		if (heapArray.get(index).getJobPriority() > heapArray.get(maxIndex)
				.getJobPriority()) {
			// do nothing
			return;
		} else {
			// swap parent with maxindex
			swap(index, maxIndex);
			sinkDown(maxIndex);
		}
	}

	/**
	 * To swap two nodes
	 * 
	 * @param index1
	 * @param index2
	 */
	public void swap(int index1, int index2) {
		HeapNode<E> parentNode = heapArray.get(index1);
		heapArray.set(index1, heapArray.get(index2));
		heapArray.set(index2, parentNode);

	}

}