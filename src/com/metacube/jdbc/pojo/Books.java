/**
 * This package holds the Pojo classes for Database LIS
 */

package com.metacube.jdbc.pojo;

public class Books {

	
		private  String title_name ;
		private int accession_no;
		private int title_id;
		private String purchase_dt;
		private int price;
		private String status;
		private boolean isBookIssued;
		
		
		/**
		 * unparameterized constructor
		 */
		public Books() {}
		
		/**
		 * parameterized constructor
		 * @param accession_no : Unique ID of the books
		 * @param purchase_dt : Date of the purchase of the book
		 * @param price : Price of the book
		 * @param title_name : Name of the book 
		 */
		public Books(int accession_no, String purchase_dt, int price, String title_name) {
			
			this.accession_no = accession_no;
			this.purchase_dt = purchase_dt;
			this.price = price;
			this.title_name=title_name;
		}
		public void setAccession_no(int accession_no) {
			this.accession_no = accession_no;
		}
		
		public void setTitle_id(int title_id) {
			this.title_id = title_id;
		}
		
		public void setPurchase_dt(String purchase_dt) {
			this.purchase_dt = purchase_dt;
		}
		
		public void setPrice(int price) {
			this.price = price;
		}
		
		public void setStatus(String status) {
			this.status = status;
		}
		
		public int getAccession_no() {
			return accession_no;
		}
		
		public int getTitle_id() {
			return title_id;
		}
		
		public String getPurchase_dt() {
			return purchase_dt;
		}
		
		public int getPrice() {
			return price;
		}
		
		public String getStatus() {
			return status;
		}

		public boolean isBookIssued() {
			return isBookIssued;
		}

		public void setBookIssued(boolean isBookIssued) {
			this.isBookIssued = isBookIssued;
		}

		public String getTitle_name() {
			return title_name;
		}

		public void setTitle_name(String title_name) {
			this.title_name = title_name;
		}
	
}
