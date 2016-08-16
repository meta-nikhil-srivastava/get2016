package com.metacube.ds.session4.assingment2;

/**
 * Assignment 2 Class to represent the customer for a guest house
 * 
 * @author Nikhil
 */

public class Guest {

	private String name; // TO store the Guest name
	private int age; // TO store the age of the guest

	public Guest(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * setName sets guest name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return the name of the guest
	 */
	public String getName() {
		return name;
	}

	/**
	 * setAge sets the value for the age of the customer
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 
	 * @return the age of the customer
	 */
	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		return age + System.identityHashCode(this);
	}
}