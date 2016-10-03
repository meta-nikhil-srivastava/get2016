package com.metacube.utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 
 * @author Nikhil
 * Singleton design pattern implementation 
 * Creates a single object of the connection
 *
 */
public class ConnectionSingleton {
	InputStream inputStream = null;

    private static final ConnectionSingleton CONNECTION_SINGLETON = new ConnectionSingleton();
    private static Connection connection;

    /**
     * @return the connection
     */
    private static Connection getConnection() {
        return connection;
    }

    /**
     * @param connection
     *            the connection to set
     */
    public void setConnection(Connection connection) {
        ConnectionSingleton.connection = connection;
    }

    /**
     * private constructor
     * creates the connection object 
     * called only once
     */
    private ConnectionSingleton() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            setConnection(DriverManager.getConnection(getPropValues("dbURL"),getPropValues("username"), getPropValues("password")));
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     * @return the connection object
     */
    public static Connection getConnectionObject() {
        return getConnection();
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