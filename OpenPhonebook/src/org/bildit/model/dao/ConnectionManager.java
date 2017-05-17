package org.bildit.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {	
	
	private static ConnectionManager instance = null;
	
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "pass";
	private static final String CONN_STRING = "jdbc:mysql://localhost/imenik";
	
	private Connection connection = null;
	
	private ConnectionManager() {
			
	}
	
	public static ConnectionManager getInstance() {
		if (instance == null) {
			instance = new ConnectionManager();
		}
		return instance;
	}
	
	public Connection getConnection() {
		if (connection == null) {
			if(openConnection()) {
				return connection;
			} else {
				return null;
			}
		}
		return connection;
	}

	private boolean openConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("nesto");
			connection = DriverManager.getConnection(CONN_STRING, USER_NAME, PASSWORD);
			System.out.println("nesto2");
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}
			
	}
	
	public void close() {
		try {
			connection.close();
			connection = null;
		} catch (Exception e) {
			
		}
	}

}
