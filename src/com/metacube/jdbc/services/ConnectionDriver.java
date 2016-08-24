/**
 * This Package will provide the JDBC Services 
 */
package com.metacube.jdbc.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDriver{

	private static ConnectionDriver driver;
	private Connection connection; 

	/**
	 * We declare this method as private so the its object can't accessed from outside.
	 */
	private ConnectionDriver(){}

	public static ConnectionDriver getInstance() {
		if(driver==null){
			driver = new ConnectionDriver();  

		}
		return driver;
	}


	public Connection createConnection()  {

		try {
			if(connection == null || connection.isClosed()){
			
				try{

				Class.forName("com.mysql.jdbc.Driver");

				}
			catch (ClassNotFoundException cnfe) {
				System.out.println("Error loading driver" +cnfe);
			}

			//DATABASE Information
			String host ="jdbc:mysql://localhost:3306/";
			String dbName ="LIS";
			String sqlURL = host + dbName; 

			//DATABASE ACCESS Rights
			String userID = "root";
			String password = "tiger";		

			try{

				connection = DriverManager.getConnection(sqlURL,userID,password);

			}

			catch(SQLException exp)
			{
				exp.printStackTrace();
			}

}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return connection;
	}
	
	/**
	 * This method close the connection
	 */
	public void closeConnection()
	{
		try {
			if(!(connection == null || connection.isClosed())){
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
