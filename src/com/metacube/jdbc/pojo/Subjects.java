/**
 * This package holds the Pojo classes for Database LIS
 */

package com.metacube.jdbc.pojo;

public class Subjects {
	
	private int subject_id;
	private String subject_nm;
	
	public int getSubject_id() {
		return subject_id;
	}
	
	public String getSubject_nm() {
		return subject_nm;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public void setSubject_nm(String subject_nm) {
		this.subject_nm = subject_nm;
	}
	
}
