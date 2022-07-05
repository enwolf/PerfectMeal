package com.algonquin.PerfectMeal.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.algonquin.PerfectMeal.beans.Recipe;
import com.algonquin.PerfectMeal.beans.RecipeLog;
import com.algonquin.PerfectMeal.dao.DBConnection;
import com.algonquin.PerfectMeal.dao.RecipeDAO;

public class testDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		DBConnection myDBConn = new DBConnection();
		myDBConn.getConnectionToDatabase();		
		RecipeDAO myDAO = new RecipeDAO();
		List<Recipe> recipeList = new ArrayList<Recipe>();
		recipeList = myDAO.allLogs();
		recipeList.toString();
		System.out.println(recipeList.size());
	}

}
