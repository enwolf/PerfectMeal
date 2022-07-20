package com.algonquin.PerfectMeal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.algonquin.PerfectMeal.beans.Recipe;
import com.algonquin.PerfectMeal.beans.RecipeBuilder;

public class RecipeDAO {
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

	public List<Recipe> allLogs() throws SQLException, ClassNotFoundException {
		// return a log from the DB
		Connection connection = DBConnection.getConnectionToDatabase();
		Recipe recipe = null;
		List<Recipe> recipes = new ArrayList<Recipe>();

		try {

			String sql = "select * from PerfectMeal.meal";

			PreparedStatement sqlQueryStatement = connection.prepareStatement(sql);
			ResultSet resultSetFromQuery = sqlQueryStatement.executeQuery();
			while (resultSetFromQuery.next()) {
				// implementation of the builder pattern
				recipes.add(new RecipeBuilder().setMealID(resultSetFromQuery.getInt("mealID"))
						.setName(resultSetFromQuery.getString("mealName"))
						.setDescription(resultSetFromQuery.getString("description"))
						.setCookTime(resultSetFromQuery.getString("cooktime"))
						.setMealLink(resultSetFromQuery.getString("meallink")).build());
			}

		} catch (SQLException e) {
			System.out.println("failed");
			e.printStackTrace();
		}
		connection.close();
		;
		return recipes;
	}

}
