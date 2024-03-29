package com.algonquin.PerfectMeal.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.algonquin.PerfectMeal.dao.UserDAO;

public class UserAuthenticationServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// redirects to registerUserForm
		RequestDispatcher dispatcher = req.getRequestDispatcher("/html/userAuthentication.jsp");
		dispatcher.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("page");
		System.out.println(name);
		// create user DAO
		UserDAO dao = new UserDAO();

		// add validation code to request object
		String validationCode = req.getParameter("validationCode");

		try {
			// user is already validate
			if (dao.isValidated(validationCode)) {
				throw new Exception("User already validated.");
			}
			// user does not exist
			if (dao.validateUser(validationCode) == 0) {
				throw new Exception("User not found.");
			}

			// go back to index page
			resp.sendRedirect("index.html");

		} catch (Exception e) {

			// send error to debug page
			req.setAttribute("errorMessage", e.getMessage());
			RequestDispatcher errorDispatcher = req.getRequestDispatcher("/html/debugPage.jsp");
			errorDispatcher.forward(req, resp);
		}

	}

}
