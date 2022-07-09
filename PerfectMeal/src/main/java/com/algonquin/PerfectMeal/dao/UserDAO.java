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

		// Returns true if greater then 0 and false if not
		return rowsAffected > 0;
	}

	public boolean userIDExists(String uuid) throws ClassNotFoundException {
		// returns true if email address exists in User Table
		int rowsAffected = 0;

		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			String findUser = "select count(*) as total from user where UUID = ?";

			PreparedStatement statement = connection.prepareStatement(findUser);
			statement.setString(1, uuid);
			ResultSet set = statement.executeQuery();

			// set the cursor to the first (and only) row of the results
			set.next();
			rowsAffected = set.getInt("total");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Returns true if greater then 0 and false if not
		return rowsAffected > 0;
	}


	public boolean isValidated(String uuid) throws ClassNotFoundException {
		// returns true if email address exists in User Table
		int rowsReturned = 0;

		try {
			Connection connection = DBConnection.getConnectionToDatabase();
			String findUser = "select count(*) as total from user where UUID = ? and isVerified = 1";

			PreparedStatement statement = connection.prepareStatement(findUser);
			statement.setString(1, uuid);
			ResultSet set = statement.executeQuery();

			// set the cursor to the first (and only) row of the results
			set.next();
			rowsReturned = set.getInt("total");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowsReturned > 0;
	}


	public boolean isValidatedByEmail(String email) throws ClassNotFoundException {
		// returns true if email address exists in User Table and isVerified = 1
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

	/*
	 * Method getSpeicifcUserFromDatabaseByEmail() takes an String representing an
	 * email as parameter
	 * 
	 * Then initialize a new user object.
	 * 
	 * Creates a connection object which use our DBConnection object to obtain an
	 * open connection to the database we have specified.
	 * 
	 * Builds the SQL Query String to be executed to return all data for the user
	 * with the email passed into the method.
	 * 
	 * Using PreparedStatement object with our Connection object to execute the SQL
	 * query and return a ResultSet containing the specific user information.
	 * 
	 * While loop is used to added data stored in the database to our user Object.
	 * 
	 * Once the user object is created we close the Database connection and return
	 * the user object.
	 * 
	 * TODO sys.out messages can be removed once everything is working, or replaced
	 * with something better.
	 */

	public User getSpeicifcUserFromDatabaseByEmail(String email) throws SQLException, ClassNotFoundException {

		User specificUser = new User();

		Connection dbConnection = DBConnection.getConnectionToDatabase();


		String selectUserSqlQuery = "SELECT * " + "FROM user " + "WHERE email='" + email + "'";

		PreparedStatement sqlQueryStatement = dbConnection.prepareStatement(selectUserSqlQuery);
		ResultSet resultSetFromQuery = sqlQueryStatement.executeQuery();

		while (resultSetFromQuery.next()) {

			specificUser.setId(resultSetFromQuery.getString("UUID"));
			specificUser.setFirstName(resultSetFromQuery.getString("FirstName"));
			specificUser.setLastName(resultSetFromQuery.getString("LastName"));
			specificUser.setPassword(resultSetFromQuery.getString("Password"));
			specificUser.setEmail(resultSetFromQuery.getString("email"));

		}

		dbConnection.close();
		if (specificUser.getId() == null) {
			return null;
		}
		return specificUser;
	}

	public User getUserByID(String uuid) throws SQLException, ClassNotFoundException {

		User specificUser = new User();

		Connection dbConnection = DBConnection.getConnectionToDatabase();

		String selectUserSqlQuery = "SELECT * " + "FROM user " + "WHERE uuid='" + uuid + "'";

		System.out.println("Get Specfic User Connected");

		String selectUserSqlQuery = "SELECT * " + "FROM user " + "WHERE email='" + email + "'";

		System.out.println("Get Specfic user query string = " + selectUserSqlQuery);


		PreparedStatement sqlQueryStatement = dbConnection.prepareStatement(selectUserSqlQuery);
		ResultSet resultSetFromQuery = sqlQueryStatement.executeQuery();

		while (resultSetFromQuery.next()) {

			specificUser.setId(resultSetFromQuery.getString("UUID"));
			specificUser.setFirstName(resultSetFromQuery.getString("FirstName"));
			specificUser.setLastName(resultSetFromQuery.getString("LastName"));
			specificUser.setPassword(resultSetFromQuery.getString("Password"));
			specificUser.setEmail(resultSetFromQuery.getString("email"));

		}

		dbConnection.close();
		return specificUser;

	}

	public boolean validateUserLogin(String email, String password) {

		boolean isValidUser = false;

		try {

			Connection dbConnection = DBConnection.getConnectionToDatabase();

			String sqlQuery = "SELECT * " + "FROM user " + "WHERE email=? " + "AND password=?";

			PreparedStatement sqlStatement = dbConnection.prepareStatement(sqlQuery);

			sqlStatement.setString(1, email);
			sqlStatement.setString(2, password);

			ResultSet returnedSet = sqlStatement.executeQuery();

			while (returnedSet.next()) {
				isValidUser = true;
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();

		}

		return isValidUser;
	}

	public boolean updatePassword(String email, String password) {
		int rowsAffected = 0;
		try {

			Connection dbConnection = DBConnection.getConnectionToDatabase();

			String sqlQuery = "update user set password = ? where email = ?";

			PreparedStatement sqlStatement = dbConnection.prepareStatement(sqlQuery);

			sqlStatement.setString(1, password);
			sqlStatement.setString(2, email);

			rowsAffected = sqlStatement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return rowsAffected > 0;

		}
    

	public int updateUserDataInDatabase(String loginEmail, String firstName, String lastName, String password)
			throws SQLException, ClassNotFoundException {

		Connection dbConnection = DBConnection.getConnectionToDatabase();

		String updateSqlQuery = "UPDATE user " + "SET FirstName='" + firstName + "', LastName='" + lastName
				+ "', Password='" + password + "' " + "WHERE Email='" + loginEmail + "'";

		System.out.println("update user in databae query = " + updateSqlQuery);

		PreparedStatement sqlStatment = dbConnection.prepareStatement(updateSqlQuery);

		System.out.println("updateUserDataInDatabase query = " + updateSqlQuery);

		int rowsAffected = sqlStatment.executeUpdate();

		dbConnection.close();

		return rowsAffected;

	}

	public int deleteUserFromDatabase(String userEmail) throws SQLException, ClassNotFoundException {

		Connection dbConnection = DBConnection.getConnectionToDatabase();
		System.out.println("DeleteTextLog Connected");

		String deleteSqlQuery = "DELETE FROM user " + "WHERE Email='" + userEmail + "'";

		System.out.println("Delete User query string = " + deleteSqlQuery);

		PreparedStatement sqlStatment = dbConnection.prepareStatement(deleteSqlQuery);

		System.out.println("Deleteing User matching this query= " + deleteSqlQuery);

		int rowsAffected = sqlStatment.executeUpdate();
		dbConnection.close();
		return rowsAffected;


	}

}// End of UserDAO
