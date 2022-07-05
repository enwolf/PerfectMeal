package com.algonquin.PerfectMeal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.sql.Statement;



import com.algonquin.PerfectMeal.beans.Recipe;
import com.algonquin.PerfectMeal.beans.RecipeLog;
import com.algonquin.PerfectMeal.services.ApplicationService;

public class RecipeDAO  {
/*	public int insertLog(Recipe log) throws ClassNotFoundException {
		int rowsAffected = 0;
		try {

			Connection connection = DBConnection.getConnectionToDatabase();
			String insertQuery = "insert into meal (uuid, name, description, CookTime, MealLink)  values (?, ?, ?, ?)";

			PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setString(1, log.getId());
			statement.setString(2, log.getName());
			statement.setString(3, log.getDescription());
			statement.setString(3, log.getCookTime());
			statement.setString(3, log.getMealLink());
			// TODO: fix conversion issue for java.util.Date
			statement.setDate(4, null);

			rowsAffected = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowsAffected;

	} */



	public List<Recipe> allLogs () throws SQLException, ClassNotFoundException {
		// return a log from the DB
		Connection connection = DBConnection.getConnectionToDatabase();
		Recipe recipe = null;
		List<Recipe> recipes = new ArrayList<Recipe>();

		try {
			//Connection connection = DBConnection.getConnectionToDatabase();
			// obtain log from the
			String sql = "select * from PerfectMeal.meal";
			// statement object to enable sql execution
			//Statement statement = connection.createStatement();
			// execute the statement
			//ResultSet set = statement.executeQuery(sql);
			PreparedStatement sqlQueryStatement = connection.prepareStatement(sql);
	    	ResultSet resultSetFromQuery = sqlQueryStatement.executeQuery();
			while (resultSetFromQuery.next()) {
				recipe = new Recipe();
				recipe.setId(resultSetFromQuery.getString("mealID"));
				recipe.setName(resultSetFromQuery.getString("mealName"));
				recipe.setDescription(resultSetFromQuery.getString("description"));
				recipe.setCookTime(resultSetFromQuery.getString("cooktime"));
				recipe.setMealLink(resultSetFromQuery.getString("meallink"));
			}

		} catch (SQLException e) {
			System.out.println("yep this is where it failed");
			e.printStackTrace();
		}
		connection.close();;
		return recipes;
	}

}
