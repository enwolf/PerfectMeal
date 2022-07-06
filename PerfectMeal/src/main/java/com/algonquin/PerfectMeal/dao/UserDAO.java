package com.algonquin.PerfectMeal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.algonquin.PerfectMeal.beans.User;

public class UserDAO {

	public int createUser(User user) throws ClassNotFoundException {
		int rowsAffected = 0;

		try {

			Connection connection = DBConnection.getConnectionToDatabase();
			String insertQuery = "insert into user (UUID, FirstName, LastName, Password, Email) values (?, ?, ?, ?, ?)";

			PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setString(1, user.getId());
			statement.setString(2, user.getFirstName());
			statement.setString(3, user.getLastName());
			statement.setString(4, user.getPassword());
			statement.setString(5, user.getEmail());

			rowsAffected = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowsAffected;
	}

	public boolean userExists(String emailAddress) throws ClassNotFoundException {
		// returns true if email address exists in User Table
		int rowsAffected = 0;

		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			String findUser = "select count(*) as total from user where Email = ?";

			PreparedStatement statement = connection.prepareStatement(findUser);
			statement.setString(1, emailAddress);
			ResultSet set = statement.executeQuery();

			// set the cursor to the first (and only) row of the results
			set.next();
			rowsAffected = set.getInt("total");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowsAffected > 0;
	}

	public boolean isValidated(String uuid) throws ClassNotFoundException {
		// returns true if email address exists in User Table
		int rowsAffected = 0;

		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			String findUser = "select count(*) as total from user where UUID = ? and isVerified = 1";

			PreparedStatement statement = connection.prepareStatement(findUser);
			statement.setString(1, uuid);
			ResultSet set = statement.executeQuery();

			// set the cursor to the first (and only) row of the results
			set.next();
			rowsAffected = set.getInt("total");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowsAffected > 0;
	}
	
	public boolean isValidatedByEmail(String email) throws ClassNotFoundException {
		// returns true if email address exists in User Table
		int rowsAffected = 0;

		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			String findUser = "select count(*) as total from user where Email = ? and isVerified = 1";

			PreparedStatement statement = connection.prepareStatement(findUser);
			statement.setString(1, email);
			ResultSet set = statement.executeQuery();

			// set the cursor to the first (and only) row of the results
			set.next();
			rowsAffected = set.getInt("total");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowsAffected > 0;
	}

	public int validateUser(String validationCode) throws ClassNotFoundException {
		int rowsAffected = 0;
		try {

			Connection connection = DBConnection.getConnectionToDatabase();
			String updateQuery = "update user set isVerified = 1 where uuid = ?";

			PreparedStatement statement = connection.prepareStatement(updateQuery);
			statement.setString(1, validationCode);
			rowsAffected = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowsAffected;

	}
}
