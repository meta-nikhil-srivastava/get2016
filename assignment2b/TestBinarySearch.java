package assignment2b;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBinarySearch {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		BinarySearch serachObject =new BinarySearch();
		int[] array ={2,5,8,9,10,11,55,77};
		assertEquals(0, serachObject.searchElement(array, 88, 0, array.length-1));
		assertEquals(1, serachObject.searchElement(array, 77, 0, array.length-1));
	}

}
