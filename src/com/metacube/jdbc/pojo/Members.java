/**
 * This package holds the Pojo classes for Database LIS
 */
package com.metacube.jdbc.pojo;

public class Members {

	private int member_id;
	private String member_nm;
	private String addressLine1;
	private String adddessLine2;
	private String category;
	
	public int getMember_id() {
		return member_id;
	}
	
	public String getMember_nm() {
		return member_nm;
	}
	
	public String getAddressLine1() {
		return addressLine1;
	}
	
	public String getAdddessLine2() {
		return adddessLine2;
	}
	
	public String getCategory() {
		return category;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public void setMember_nm(String member_nm) {
		this.member_nm = member_nm;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public void setAdddessLine2(String adddessLine2) {
		this.adddessLine2 = adddessLine2;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
