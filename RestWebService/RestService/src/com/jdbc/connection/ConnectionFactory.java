package com.jdbc.connection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Singelton Connection Factory
 * @author admin
 *
 */
public class ConnectionFactory {


	private static final ConnectionFactory CONNECTION_SINGLETON = new ConnectionFactory();
	private static Connection connection;
	InputStream inputStream = null;

	/**
	 * @return the connection
	 */
	private Connection getConnection() {
		return connection;
	}

	/**
	 * @param connection
	 *            the connection to set
	 */
	public void setConnection(Connection connection) {
		ConnectionFactory.connection = connection;
	}

	/**
	 * private constructor creates the connection object called only once
	 */
	private ConnectionFactory() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			setConnection(DriverManager.getConnection(getPropValues("dbURL"), getPropValues("username"), getPropValues("password")));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return the connection object
	 */
	public static Connection getConnectionObject() {
		return ConnectionFactory.CONNECTION_SINGLETON.getConnection();
	}

	public String getPropValues(String propertyName) {
		String result = "";
		
		try {
			Properties properties = new Properties();
			String propFileName = "config.properties";

			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

			if (inputStream != null) {
				properties.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '"+ propFileName + "' not found in the classpath");
			}

			result = properties.getProperty(propertyName);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
}


