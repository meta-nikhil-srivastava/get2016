/**
 * This package holds the Pojo classes for Database LIS
 */
package com.metacube.jdbc.pojo;

public class Titles {

	private int title_id;
	private String title_nm;
	private int subject_id;
	private String subject_nm;

	public int getTitle_id() {
		return title_id;
	}
	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}
	public void setTitle_nm(String title_nm) {
		this.title_nm = title_nm;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
	public void setSubject_nm(String subject_nm) {
		this.subject_nm = subject_nm;
	}
	public String getTitle_nm() {
		return title_nm;
	}
	public int getSubject_id() {
		return subject_id;
	}
	public String getSubject_nm() {
		return subject_nm;
	}
	
	

	
	

}
