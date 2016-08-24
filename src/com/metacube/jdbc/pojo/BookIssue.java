/**
 * This package holds the Pojo classes for Database LIS
 */

package com.metacube.jdbc.pojo;

public class BookIssue {
	
		private String issue_dt;
		private int accession_no;
		private int member_id;
		private String due_dt;
		
		public String getIssue_dt() {
			return issue_dt;
		}
		
		public int getAccession_no() {
			return accession_no;
		}
		
		public int getMember_id() {
			return member_id;
		}
		
		public String getDue_dt() {
			return due_dt;
		}

		public void setIssue_dt(String issue_dt) {
			this.issue_dt = issue_dt;
		}

		public void setAccession_no(int accession_no) {
			this.accession_no = accession_no;
		}

		public void setMember_id(int member_id) {
			this.member_id = member_id;
		}

		public void setDue_dt(String due_dt) {
			this.due_dt = due_dt;
		}
		
		
	

}
