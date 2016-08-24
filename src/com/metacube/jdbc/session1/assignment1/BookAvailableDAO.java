/**
 * Its a Dao class for the implementation of the Second assignment2
 */
package com.metacube.jdbc.session1.assignment1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.metacube.jdbc.pojo.Books;

/**
 * DAO class to execute the query on book availability
 */
public class BookAvailableDAO {

	private Connection connection;
	
	public BookAvailableDAO(Connection connection) {
		
		this.connection = connection;
	}
		
		
		/**
		 *  method to execute query and provide the desired results
		 */
		public void bookAvailable(Books book)  {
			
			try {
				Statement stmt = connection.createStatement();				//Statement object is created
				
				ResultSet rst = stmt.executeQuery("SELECT COUNT(b.accession_no) AS books_not_issued FROM titles t "
													+"INNER JOIN books b ON b.title_id = t.title_id WHERE "
													+"title_nm = '"+book.getTitle_name()+"' AND b.accession_no "
													+"NOT IN (SELECT bi.accession_NO FROM book_issue bi "
													+"LEFT JOIN book_return br ON bi.accession_no = br.accession_no "
													+"AND bi.member_id = br.member_id AND bi.issue_dt = br.issue_dt "
													+"WHERE br.return_dt IS NULL)");
				//provides the result according to query 
				
				while(rst.next()) {
					
					if(rst.getInt(1) > 0) {	//if books are available the setBookIssue method is called and 
						//value is set to true else false
						
						book.setBookIssued(true);
					} else {
						
						book.setBookIssued(false);
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


