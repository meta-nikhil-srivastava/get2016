package com.metacube.ds.session4.assingment1;

import org.junit.*;

import static org.junit.Assert.*;

public class TestHeap {

	@Test
	public void testGetSize() {
		Heap<String> heap = new Heap<String>();
		heap.insert(new HeapNode<String>(4, "hi"));
		heap.insert(new HeapNode<String>(3, "hello"));

		assertEquals(2, heap.getSize());
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testExtractMax() {
		Heap<String> heap = new Heap<String>();
		heap.insert(new HeapNode<String>(4, "four"));
		heap.insert(new HeapNode<String>(3, "three"));
		heap.insert(new HeapNode<String>(5, "five"));
		heap.insert(new HeapNode<String>(1, "one"));
		heap.insert(new HeapNode<String>(3, "three2"));
		heap.insert(new HeapNode<String>(5, "five2"));
		heap.insert(new HeapNode<String>(5, "five3"));

		assertEquals("five", heap.extractMax());
		assertEquals("five2", heap.extractMax());
		assertEquals("five3", heap.extractMax());

		assertEquals("four", heap.extractMax());

		assertEquals("three", heap.extractMax());
		assertEquals("three2", heap.extractMax());

	}

}