/**
 * This package holds the Pojo classes for Database LIS
 */

package com.metacube.jdbc.pojo;


public class Authors {

	private int author_id;
	private String author_nm;
	
	/**
	 * unparameterized constructor
	 */
	public Authors() {}
	
	/**
	 * parameterized constructor
	 * @param author_id : Unique Id of the author
	 * @param author_name : Name of the author
	 */
	public Authors(int author_id, String author_name) {
		
		this.author_id = author_id;
		this.author_nm = author_name;
	}

	
	public int getAuthor_id() {
		return author_id;
	}
	
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	
	public void setAuthor_nm(String author_nm) {
		this.author_nm = author_nm;
	}
	
	public String getAuthor_nm() {
		return author_nm;
	} 

}
