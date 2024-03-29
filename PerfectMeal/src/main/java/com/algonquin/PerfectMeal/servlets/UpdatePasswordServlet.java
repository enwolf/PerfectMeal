package com.algonquin.PerfectMeal.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.algonquin.PerfectMeal.beans.User;
import com.algonquin.PerfectMeal.dao.UserDAO;

// url string: /update-password
public class UpdatePasswordServlet extends HttpServlet {
// servlet accessed when user submits an email address for password update

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		UserDAO dao = new UserDAO();

		Integer codeFromForm = Integer.parseInt(req.getParameter("validation-code"));
		Integer codeFromSession = (Integer) session.getAttribute("code");

		try {
			if (!codeFromForm.equals(codeFromSession)) {
				throw new Exception("Invalid Code. Please start over");
			}

			// catch and redirect to error page
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.setAttribute("errorMessage", e.getMessage());
			resp.sendRedirect("/html/debugPage.jsp");
		} catch (Exception e) {

			session.setAttribute("errorMessage", e.getMessage());
			resp.sendRedirect("/html/debugPage.jsp");
		}

		// redirects to update password form
		resp.sendRedirect("../html/update-user-password.jsp");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// takes in 2 passwords and a user name and updates the password
		// create user DAO
		UserDAO dao = new UserDAO();
		HttpSession session = req.getSession();
		System.out.println("reached");
		String pw1 = req.getParameter("password");
		String pw2 = req.getParameter("confirmPassword");

		User user = (User) session.getAttribute("user");
		String email = user.getEmail();

		try {
			// check if passwords are equal
			if (!pw1.equals(pw2)) {
				throw new Exception("Passwords do not match.  Try again.");
			}

			dao.updatePassword(email, pw2);

		} catch (Exception e) {
			req.setAttribute("errorMessage", e.getMessage());
			RequestDispatcher errorDispatcher = req.getRequestDispatcher("/html/debugPage.jsp");
			errorDispatcher.forward(req, resp);
		}

	}

}
