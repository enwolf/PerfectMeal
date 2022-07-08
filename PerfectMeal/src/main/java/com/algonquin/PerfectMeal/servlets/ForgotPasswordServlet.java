package com.algonquin.PerfectMeal.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.algonquin.PerfectMeal.beans.User;
import com.algonquin.PerfectMeal.dao.UserDAO;

public class ForgotPasswordServlet extends HttpServlet {
// servlet accessed when a user clicks on the "forgot password" button

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// redirects to forgot password form
		RequestDispatcher dispatcher = req.getRequestDispatcher("/html/forgot-password.jsp");
		dispatcher.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// create user DAO
		UserDAO dao = new UserDAO();
		HttpSession session = req.getSession();
		Integer code;
		// add validation code to request object
		String email = req.getParameter("email-address");

		try {
			// user exists
			User user = dao.getSpeicifcUserFromDatabaseByEmail(email);

			if (user == null) {
				throw new Exception("User not found");
			}

			// create a code, print to console and add it to session object
			Random rand = new Random();
			// generate a random integer
			code = rand.nextInt(36789);
			System.out.println(code);

			// add user to session object
			session.setAttribute("user", user);
			// add code to session object
			session.setAttribute("code", code);
			// forward to validation form

			RequestDispatcher dispatcher = req.getRequestDispatcher("/html/forgot-password-code-validation.jsp");
			dispatcher.forward(req, resp);

		} catch (SQLException e) {
			// user not found exception

			e.printStackTrace();

			// send error to debug page

			session.setAttribute("errorMessage", e.getMessage() + " | User Not Found");
			resp.sendRedirect("/html/debugPage.jsp");

		} catch (Exception e) {

			// catch any other errors that happen and send to debug page
			session.setAttribute("errorMessage", e.getMessage() + " | User Not Found");
			resp.sendRedirect("/html/debugPage.jsp");
		}

	}

}
