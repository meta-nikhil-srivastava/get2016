/**
 * 
 */
package com.metacube.ds.session7.assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Nikhil
 *
 */
public class TestBinarySearch {

	@Test
	public void tests() {
		BinarySearch binarSearchTest= new BinarySearch();
		assertEquals(1,binarSearchTest.binarySearch(new int[] {1,1,1,2,2,2,2,3,4,4},1));
		assertEquals(-1,binarSearchTest.binarySearch(new int[] {},3));
	}

}
