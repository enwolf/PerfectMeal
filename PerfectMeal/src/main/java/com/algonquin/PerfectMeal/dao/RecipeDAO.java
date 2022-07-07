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


public class RecipeDAO  {
	public int insertLog(Recipe log) throws ClassNotFoundException {
		int rowsAffected = 0;
		try {

			Connection connection = DBConnection.getConnectionToDatabase();
			String insertQuery = "insert into meal (uuid, name, description, CookTime, MealLink)  values (?, ?, ?, ?)";

			PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setInt(1, log.getId());
			statement.setString(2, log.getName());
			statement.setString(3, log.getDescription());
			statement.setString(3, log.getCookTime());
			statement.setString(3, log.getMealLink());

			statement.setDate(4, null);

			rowsAffected = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowsAffected;

	} 



	public List<Recipe> allLogs () throws SQLException, ClassNotFoundException {
		// return a log from the DB
		Connection connection = DBConnection.getConnectionToDatabase();
		Recipe recipe = null;
		List<Recipe> recipes = new ArrayList<Recipe>();

		try {

			String sql = "select * from PerfectMeal.meal";

			PreparedStatement sqlQueryStatement = connection.prepareStatement(sql);
	    	ResultSet resultSetFromQuery = sqlQueryStatement.executeQuery();
			while (resultSetFromQuery.next()) {
				recipe = new Recipe();
				recipe.setId(resultSetFromQuery.getInt("mealID"));
				recipe.setName(resultSetFromQuery.getString("mealName"));
				recipe.setDescription(resultSetFromQuery.getString("description"));
				recipe.setCookTime(resultSetFromQuery.getString("cooktime"));
				recipe.setMealLink(resultSetFromQuery.getString("meallink"));
				recipes.add(recipe);
			}

		} catch (SQLException e) {
			System.out.println("failed");
			e.printStackTrace();
		}
		connection.close();;
		return recipes;
	}

}
