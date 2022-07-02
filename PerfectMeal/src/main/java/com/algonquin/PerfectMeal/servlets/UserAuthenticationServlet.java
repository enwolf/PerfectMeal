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

		// create user DAO
		UserDAO dao = new UserDAO();

	}

}
