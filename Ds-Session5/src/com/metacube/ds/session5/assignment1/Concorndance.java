/**
 * Filename : Concorndance.java
 */
package com.metacube.ds.session5.assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
/**
 * This class performs the Concorndance operations and the resultant output will be 
 * 
 * String : Hello World
 * Output : {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}
 * 
 * @author NIkhil
 * 
 *
 */
public class Concorndance {

	/**
	 * We use HasMap to map the Key(Characters) and Values(Occurrences)
	 */
	HashMap<Character, List<Integer>> concordanceMap;

	/**
	 * Unparameterized Constructor to initialized the HashMap (ConcordanceMap)
	 *   
	 */

	public Concorndance() {
		concordanceMap = new HashMap<Character, List<Integer>>();
	}

	/**
	 * This method Checks for the presence of Key or not 
	 * 
	 * @param key is unique Character
	 * 
	 * @return true if it contains that key else false
	 */

	public boolean isKeyPresent(char key) {
		Set<Character> keys = concordanceMap.keySet();
		return keys.contains(key);
	}

	/**
	 * This method check for the presence of key and map the values in the HashMap
	 * 
	 * @param string : Input String by the User
	 * 
	 */
	public void checkString(String string) {

		for (int index = 0; index < string.length(); index++) {
			//uniqueKey Stores the the characters from the map 
			char uniqueKey = string.charAt(index);

			List<Integer> valueList = new ArrayList<Integer>();

			if (!isKeyPresent(uniqueKey)) {// Checking occurrence of the character
				valueList.add(index);		// if Found then add
				
				for (int j = index + 1; j < string.length(); j++) {

					if (uniqueKey == string.charAt(j)) {
						valueList.add(j);

					}//end of if 
	
				}// end of second for loop

				// Adding that list to hash map
				concordanceMap.put(uniqueKey, valueList);

			}//end of if

		}//end of first for loop

	}//end of checkString method

	/**
	 * This method will print the total Occurrences of the each Key
	 *  
	 */

	public void printOccurrences() {

		Set<Character> keys = concordanceMap.keySet();

		for (Character character : keys) {
			
			List<Integer> Values = concordanceMap.get(character);
			System.out.print(character + "=[ ");//Output format

			for (Integer integer : Values) {
				System.out.print(integer + " ");
			}// end of second for loop

			System.out.println("]");
		
		}// end of first for loop

	}// end of printOccurrences()

}//end of Concorndance class