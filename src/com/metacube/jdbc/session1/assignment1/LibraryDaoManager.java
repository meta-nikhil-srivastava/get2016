package com.metacube.jdbc.session1.assignment1;

import java.sql.Connection;
import java.util.List;

import com.metacub.jdbc.utill.UserInput;
import com.metacube.jdbc.pojo.Authors;
import com.metacube.jdbc.pojo.Books;

public class LibraryDaoManager {

	public void queryExecution(Connection con) {
		
		UserInput input = new UserInput();
		
		System.out.println("Q1. Fetch all the books published by author, given the name of the author. "
											+"Return the books data (List of Titles).");
		System.out.println("Please enter the author's name :");
		String authorName = input.getStringValue();
		Authors author = new Authors();
		author.setAuthor_nm(authorName);
		
		BookDAO bookDAO = new BookDAO(con);
		List<Books> listOfBooks = bookDAO.selectBooks(author);
		if(listOfBooks.size() > 0) {

			System.out.println("The list of books are:");
			for(Books b : listOfBooks) {
			
				System.out.println(b.getTitle_name());
			}
		} else {
			
			System.out.println("There is no book published by '"+authorName+"'");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Q2. Given the name of the book, to be issued by an existing member. "
								+"Return flag to indicate whether the  the book has been issued or not.");
		System.out.println("Please enter the book's name :");
		String bookName =input.getStringValue();
		Books book = new Books();
		book.setTitle_name(bookName);
		
		BookAvailableDAO bookAvailable = new BookAvailableDAO(con);
		bookAvailable.bookAvailable(book);
		if(book.isBookIssued()) {
			
			System.out.println("Book '"+bookName+"' is available to be issued.");
		} else {
			
			System.out.println("Book '"+bookName+"' is not available.");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Q3. Delete all those books which were not issued in last 1 year. "
												+"Return the number of books deleted.");
		
		DeleteBookDAO deleteBook = new DeleteBookDAO(con);
		int count = deleteBook.deleteBook();
		System.out.println("Total count of books deleted which were not issued for more than 1 year is : "+count);
		}
	}
