/**
 * SupportClass.java
 */
package com.metacube.ds.session8.assignmnt2;

/**
 * This class is used for providing the additional support functionalities
 * --> for finding Maximum Number
 * --> for finding digit count
 * 
 * @author Nikhil
 *
 */

public class SupportClass {
	// find largest element in array
		public int maximumNumber(int array[]) {
			int temp = array[0];

			for (int index = 0; index < array.length; index++) {
				if (temp < array[index]) {
					temp = array[index];
				}
			}
			return temp;
		}

		// count digit of maximum element in array
		public int getDigitCount(int max) {
			int count = 1;
			while (max / 10 != 0) {
				count++;
				max = max / 10;
			}
			return count;
		}
}
