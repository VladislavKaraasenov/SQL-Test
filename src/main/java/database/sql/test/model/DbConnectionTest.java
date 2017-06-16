package database.sql.test.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionTest {

	public static Connection getConnection() {

		final String DRIVER = "com.mysql.jdbc.Driver";
		final String DB_CONNECTION = "jdbc:mysql://127.0.0.1:3306/testDB";
		final String DB_USERNAME = "root";
		final String DB_PASSWORD = "password";

		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, DB_USERNAME, DB_PASSWORD);
			System.out.println("Connected!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
