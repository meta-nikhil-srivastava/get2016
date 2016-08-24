package com.metacube.jdbc.session1.assignment1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.metacube.jdbc.pojo.Books;

public class DeleteBookDAO {

	private Connection connection;
	
	public DeleteBookDAO(Connection con) {
	
		this.connection = con;
	}
	
	public int deleteBook()  {
		List<Books> listOfBooks=null;
		try{
		Statement stmt = connection.createStatement();
		
		ResultSet rst = stmt.executeQuery("SELECT DISTINCT b.accession_no FROM books b LEFT JOIN book_issue bi "
										+"ON b.accession_no = bi.accession_no LEFT JOIN book_return br "
										+"ON bi.accession_no = br.accession_no AND bi.member_id = br.member_id "
										+"AND bi.issue_dt = br.issue_dt WHERE DATEDIFF(CURRENT_TIMESTAMP, "
										+"IFNULL(bi.issue_dt, purchase_dt)) >= 365");
		
		listOfBooks = new ArrayList<Books>();
		while(rst.next()) {
			
			Books book = new Books();
			book.setAccession_no(rst.getInt(1));
			listOfBooks.add(book);
		}
		
		if(listOfBooks.size() > 0) {

			for(Books b : listOfBooks) {
			
				stmt.executeUpdate("DELETE From book_return WHERE accession_no = "+b.getAccession_no());
				stmt.executeUpdate("DELETE From book_issue WHERE accession_no = "+b.getAccession_no());
				stmt.executeUpdate("DELETE From books WHERE accession_no = "+b.getAccession_no());
			}
		}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return listOfBooks.size();
	}
}