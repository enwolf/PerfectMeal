package com.algonquin.PerfectMeal.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.algonquin.PerfectMeal.beans.User;
import com.algonquin.PerfectMeal.dao.UserDAO;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Strings to store values entered by user for login
		String loginEmail = request.getParameter("email");
		String password = request.getParameter("password");
		// Create our UserDAO and User objects
		UserDAO userDAO = new UserDAO();
		User userToLogin = new User();

		/*
		 * Try statement is used as a logic gate, if exception's are throw the user is
		 * sent to error.jsp page along with the appropriate error message.
		 * 
		 * UserDAO.userExisits() and .isValidated() return turn if user found or
		 * verified. UserDAO also returns a user Object with values fetched from the
		 * user Database. Request used to setAttribute to be displayed on login.jsp
		 * page. Dispatcher's send either to login.jsp page, or error.jsp page
		 * 
		 * I'm not sure if this is a valid / correct way to use try catch but I think
		 * for what we need to demonstrate it should be fine.
		 * 
		 */

		try {
			if (!userDAO.userExists(loginEmail))
				throw new Exception("User not found");

			if (!userDAO.isValidatedByEmail(loginEmail))
				throw new Exception("User account not verified.");

			if (!userDAO.validateUserLogin(loginEmail, password))
				throw new Exception("Error: Username or Password Incorrect");

			HttpSession session = request.getSession();
			session.setAttribute("loginEmail", loginEmail);

			System.out.println("Password Correct forwarding to login.jsp");
			userToLogin = userDAO.getSpeicifcUserFromDatabaseByEmail(loginEmail);

			request.setAttribute("userEmail", userToLogin.getEmail());
			request.setAttribute("firstName", userToLogin.getFirstName());
			request.setAttribute("lastName", userToLogin.getLastName());
			request.setAttribute("Password", userToLogin.getPassword());

			request.getRequestDispatcher("/html/login.jsp").forward(request, response);

		} catch (Exception e) {

			// Forward to error page if exception is caught.
			request.setAttribute("errorMessage", e.getMessage());
			request.getRequestDispatcher("/html/error.jsp").forward(request, response);
			e.printStackTrace();
		}

	}

}// End of doPost
