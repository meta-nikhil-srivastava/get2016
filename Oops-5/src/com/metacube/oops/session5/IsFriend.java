package com.metacube.oops.session5;

import java.util.Scanner;

/**
 * class to check if a user is friend to other or not
 */
public class IsFriend {

	private static final int ZERO_LENGTH = 0;
	
	/**
	 * method to check if a user is a friend with other or not
	 * @param graph : graph
	 * @param input : scanner object
	 */
	public IsFriend(Graph graph, Scanner input) {
		
		System.out.println("Enter name of the user1:");
		String name1 = "";
		while(name1.length() == ZERO_LENGTH) {
			
			name1 = input.nextLine().trim();
		}
		Node node1 = graph.getNode(name1);

		if(node1 == null) {
				
			System.out.println(name1+" is not present in the system.");
			new IsFriend(graph, input);
		}
		
		System.out.println("Enter name of the user2:");
		String name2 = "";
		while(name2.length() == ZERO_LENGTH) {
			
			name2 = input.next().trim();
		}
		Node node2 = graph.getNode(name2);
		
		if(node2 == null) {
			
			System.out.println(name2+" is not present in the system.");
			new IsFriend(graph, input);
		}
			
		if(!node1.isFriend(node2)) {
				
			System.out.println("No "+name1+" and "+name2+" are not friends.");
		} else {
				
			System.out.println("Yes "+name1+" and "+name2+" are friends.");
		}
	}
}