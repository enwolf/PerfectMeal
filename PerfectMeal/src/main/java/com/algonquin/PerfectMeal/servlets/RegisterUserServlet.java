package com.algonquin.PerfectMeal.servlets;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.algonquin.PerfectMeal.beans.User;
import com.algonquin.PerfectMeal.dao.UserDAO;

public class RegisterUserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// forwards to registerUserForm
		RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/html/registerUserForm.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// create user DAO
		UserDAO dao = new UserDAO();
		HttpSession session = req.getSession();

		// create new user
		User user = new User();
		String pw1 = req.getParameter("password");
		String pw2 = req.getParameter("confirmPassword");
		String email = req.getParameter("emailAddress");

		// password validation, then user exists validation
		try {
			// check if passwords are equal
			if (!pw1.equals(pw2)) {
				System.out.println("unmatched passwords error");
				throw new Exception("Passwords do not match.  Try again.");
			}

			// check if user exists
			if (dao.userExists(email)) {
				System.out.println("user exists error");
				throw new Exception("User already exists.  Try another email address.");
			}

			// update user object attributes
			user.setId(UUID.randomUUID().toString());
			user.setEmail(req.getParameter("emailAddress"));
			user.setFirstName(req.getParameter("firstName"));
			user.setLastName(req.getParameter("lastName"));
			user.setUserName(req.getParameter("emailAddress"));
			user.setPassword(pw2);

			// create the user in the Database
			dao.createUser(user);

			// print out validation token to console. Use this for validation.
			// TODO: add this token to an email URL or general email to use in future
			// release
			System.out.println("Code: " + user.getId());

			// need to redirect instead of forward because we want a GET request to be
			// triggered (original was a POST).
			resp.sendRedirect("verify-email");

		} catch (Exception e) {

			// forward to error page for debugging
			System.out.println(e.getMessage());
			session.setAttribute("errorMessage", e.getMessage());
			RequestDispatcher errorDispatcher = req.getServletContext().getRequestDispatcher("/html/debugPage.jsp");
			errorDispatcher.forward(req, resp);
		}

	}

}
