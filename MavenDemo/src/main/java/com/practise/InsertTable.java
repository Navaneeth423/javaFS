package com.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class InsertTable {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/javamaven";
		String username = "root";
		String password = "root";
		
		String sql = 
				"""
				INSERT INTO EMPLOYEE(EMP_NAME, CITY) VALUES(?,?);
				""";
		
		try(Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement statement = connection.prepareStatement(sql);
			Scanner sc = new Scanner(System.in);) {
			for(int i=0;i<3;i++) {
				System.out.println("Enter Employee Name:");
				statement.setString(1, sc.next());
//				sc.next();
				System.out.println("Enter Employee City:");
				statement.setString(2, sc.next());
				statement.execute();
			}
		}
	}
}
