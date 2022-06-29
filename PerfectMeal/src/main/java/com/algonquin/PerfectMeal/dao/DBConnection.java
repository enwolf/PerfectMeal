package com.algonquin.PerfectMeal.dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	private static final String DBUSER = "root";
	private static final String DBPASSWORD = "";
	private static final String CONN_STRING = "jdbc:mysql://localhost:3306/PerfectMeal";
	private static final String DB_INITIALIZER_FILEPATH = "com.algonquin.PerfectMeal.resources/DDL.sql";

	public static void CreateDatabase() throws IOException, ClassNotFoundException {
		// TODO: determine relative file path of the SQL file to call this method
		// from a servlet

		// create a file path
		Path fileName = Path.of(DB_INITIALIZER_FILEPATH);

		// create the query string
		String createDBQuery = Files.readString(fileName);

		try {

			Connection connection = DBConnection.getConnectionToDatabase();
			Statement statement = connection.createStatement();
			statement.execute(createDBQuery);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnectionToDatabase() throws SQLException, ClassNotFoundException {
		Connection connection = null;
		Class.forName("com.mysql.jdbc.Driver");
		try {
			connection = DriverManager.getConnection(CONN_STRING, DBUSER, DBPASSWORD);
			System.out.println("Connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}

}
