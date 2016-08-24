/*
 * DAO class to execute the query on book list
 */
package com.metacube.jdbc.session1.assignment1;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.metacube.jdbc.pojo.Authors;
import com.metacube.jdbc.pojo.Books;

public class BookDAO {

	private Connection connection;
	
	/**
	 * parameterized constructor
	 * @param con : Connection object
	 */
	public BookDAO(Connection con) {
	
		this.connection = con;
	}
	
	/**
	 * method to execute the query and provide the desired results
	 * @param author : Author object whose book titles has to find
	 * @return : list of Books objects published by the given author
	 */
	public List<Books> selectBooks(Authors author)  {
		
		List<Books> listOfBooks = null;
		try {
			Statement stmt = connection.createStatement();													//Statement object is created
			
			ResultSet rst = stmt.executeQuery("SELECT t.title_nm FROM titles t "
												+"INNER JOIN title_author ta ON ta.title_id = t.title_id "
												+"INNER JOIN authors a ON a.author_id = ta.author_id "
												+"WHERE a.author_nm = '"+author.getAuthor_nm()+"'");
																									//provides the result according to query
			
			listOfBooks = new ArrayList<Books>();										//list of books reference
			
			while(rst.next()) {
				
				Books book = new Books();															//Books object is created
				book.setTitle_name(rst.getString(1));												//book title is set
				listOfBooks.add(book);																//book is added to the list
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listOfBooks;
	}
}

