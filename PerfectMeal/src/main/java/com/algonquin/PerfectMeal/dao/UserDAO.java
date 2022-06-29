package com.algonquin.PerfectMeal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

}
