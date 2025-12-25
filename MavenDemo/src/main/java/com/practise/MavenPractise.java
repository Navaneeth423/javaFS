package com.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MavenPractise {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javamaven";
		String username = "root";
		String password = "root";
		
		String sql = 
				"""
				CREATE TABLE EMPLOYEE(EMP_NAME VARCHAR(20),
				EMP_ID INT PRIMARY KEY,
				CITY VARCHAR(20));
				""";
		
		Connection connection = null;
		Statement statement = null;
		//Getting a connection
		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			boolean status = statement.execute(sql);
			System.out.println(!status ? "Table is created": "Table not created");;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
				if (connection != null)				
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
