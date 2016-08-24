/**
 * This package holds the Pojo classes for Database LIS
 */

package com.metacube.jdbc.pojo;

public class BookReturn {
		
		private String return_dt;
		private int accession_no;
		private String issue_dt;
		private int member_id;
		
		public void setReturn_dt(String return_dt) {
			this.return_dt = return_dt;
		}
		
		public void setAccession_no(int accession_no) {
			this.accession_no = accession_no;
		}
		
		public void setIssue_dt(String issue_dt) {
			this.issue_dt = issue_dt;
		}
		
		public void setMember_id(int member_id) {
			this.member_id = member_id;
		}
		
		public String getReturn_dt() {
			return return_dt;
		}
		
		public int getAccession_no() {
			return accession_no;
		}
		
		public String getIssue_dt() {
			return issue_dt;
		}
		
		public int getMember_id() {
			return member_id;
		}
		
		
		
}
