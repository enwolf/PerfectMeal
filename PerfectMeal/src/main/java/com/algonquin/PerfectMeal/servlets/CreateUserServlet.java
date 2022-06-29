package com.algonquin.PerfectMeal.servlets;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.algonquin.PerfectMeal.beans.User;
import com.algonquin.PerfectMeal.dao.UserDAO;

public class CreateUserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDAO dao = new UserDAO();

		// handles redirect from signup button and forwards to signup page
		RequestDispatcher dispatcher = req.getRequestDispatcher("/html/signup.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// create user DAO
		UserDAO dao = new UserDAO();

		// create new user
		User user = new User();

		user.setId(UUID.randomUUID().toString());
		user.setEmail(req.getParameter("email"));
		user.setPassword(req.getParameter("password"));

		// probably don't need all these try/catch blocks, but can't remember how best
		// to handle them
		try {
			dao.createUser(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.print("Can't find class from servlet");
			e.printStackTrace();
		}

	}

}
