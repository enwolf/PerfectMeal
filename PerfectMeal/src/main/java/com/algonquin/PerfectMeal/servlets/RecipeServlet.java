package com.algonquin.PerfectMeal.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.algonquin.PerfectMeal.beans.Recipe;
import com.algonquin.PerfectMeal.beans.RecipeLog;
import com.algonquin.PerfectMeal.dao.RecipeDAO;

public class RecipeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RecipeDAO dao = new RecipeDAO();
		try {
			List<Recipe> recipes = dao.allLogs();
			request.setAttribute("recipe", recipes);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/html/recipe.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get post parameters
		String title = request.getParameter("title");
		String text = request.getParameter("logText");

		// create a new log object
		Recipe log = new RecipeLog();

		// use the application in memory object to add log to collection
		// aim.addLog(log);
		RecipeDAO dao = new RecipeDAO();
		try {
			int rows = dao.insertLog(log);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			List<Recipe> logs = dao.allLogs();
			request.setAttribute("recipe", logs);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/html/logForm.jsp");
		dispatcher.forward(request, response);

	}
}
