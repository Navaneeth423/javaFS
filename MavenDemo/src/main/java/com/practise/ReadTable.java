package com.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadTable {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/javamaven";
		String username = "root";
		String password = "root";

		String sql = """
				SELECT * FROM EMPLOYEE WHERE CITY=?;
				""";

		try (Connection connection = DriverManager.getConnection(url, username, password);
			 PreparedStatement statement = connection.prepareStatement(sql);) {
			statement.setString(1, "Texas");
			try (ResultSet rs = statement.executeQuery();) {
				while (rs.next()) {
					String employeeName = rs.getString("emp_name");
					int employeeId = rs.getInt(2);
					String city = rs.getString("city");
					System.out.println(employeeId + " " + employeeName + " " + city);
				}
			}
		}
	}
}
