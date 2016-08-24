/**
 * This main class for the implementation of  Queries
 */
package com.metacube.jdbc.session1.assignment1;

import com.metacube.jdbc.services.ConnectionDriver;

public class LibraryMain {

	public static void main(String[] args) {
		
		LibraryDaoManager lib = new LibraryDaoManager();
		ConnectionDriver db = null;
		
			db = ConnectionDriver.getInstance();
			lib.queryExecution(db.createConnection());		
			db.closeConnection();

	}
}
