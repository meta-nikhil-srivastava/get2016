/**
 * FileName : UniqueCharcters.java
 */
package com.metacube.ds.session6.assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class is to find all the unique characters in a given string and if the
 * same string is given again then it can be retrieved from previously entered
 * string and number of unique characters can be told without and calculations
 * 
 * @author Nikhil
 *
 */
public class UniqueCharacters {

	private static Map<String, Integer> dataStorage = new HashMap<String, Integer>();
	private int uniqueCount;
	private char character;

	/**
	 * THis function takes the input string and calculates the number of unique
	 * characters in the string
	 * 
	 * @param inputString
	 * @return int number of unique characters in the string
	 */
	public int checkUnique(String inputString) {

		if (dataStorage.containsKey(inputString)) {
			return dataStorage.get(inputString);
		}

		else {
			List<Character> charList = new ArrayList<Character>();

			int length = inputString.length();

			for (int i = 0; i < length; i++) {
				character = inputString.charAt(i);

				if (charList.contains(character)) {
					continue;
				} else {
					uniqueCount++;
					charList.add(character);
				}
			}

			dataStorage.put(inputString, uniqueCount);

			return uniqueCount;
		}
	}

	/**
	 * @return the uniqueCount
	 */
	public int getUniqueCount() {
		return uniqueCount;
	}

	/**
	 * @param uniqueCount
	 *            the uniqueCount to set
	 */
	public void setUniqueCount(int uniqueCount) {
		this.uniqueCount = uniqueCount;
	}

	
}
