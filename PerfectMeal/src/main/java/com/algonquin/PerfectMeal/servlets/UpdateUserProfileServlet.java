package com.algonquin.PerfectMeal.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.algonquin.PerfectMeal.beans.User;
import com.algonquin.PerfectMeal.dao.UserDAO;

public class UpdateUserProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		
		if (session != null) {

			String loginEmail = (String) session.getAttribute("loginEmail");
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String password = request.getParameter("password");
			int isUpdated = 1;
			
			try {

				UserDAO userDAO = new UserDAO();

				userDAO.updateUserDataInDatabase(loginEmail, firstName, lastName, password);

				User userToUpdate;

				userToUpdate = userDAO.getSpeicifcUserFromDatabaseByEmail((String) session.getAttribute("loginEmail"));

				session.setAttribute("firstName", userToUpdate.getFirstName());
				session.setAttribute("lastName", userToUpdate.getLastName());
				session.setAttribute("password", userToUpdate.getPassword());
				session.setAttribute("isUpdated", isUpdated);

				request.getRequestDispatcher("/html/userProfile.jsp").forward(request, response);

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		/*
		String loginEmail = (String) session.getAttribute("loginEmail");
		if (loginEmail == null)

		{
			request.setAttribute("errorMessage", "Error no user logged in");
			RequestDispatcher errorDispatcher = request.getRequestDispatcher("/html/error.jsp");
			errorDispatcher.forward(request, response);
		}
		 */
	}

}
