package com.algonquin.PerfectMeal.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.algonquin.PerfectMeal.dao.UserDAO;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		//Strings to store values entered by user for login
		String loginEmail = request.getParameter("email");
		String password = request.getParameter("password");

		//Booleans to check if users exists and are validated. 
		boolean userExists = false;
		boolean userValidated = false;
		
		
		UserDAO userDAO = new UserDAO();
		/*
		try {
			userExists = userDAO.userExists(loginEmail);
		} catch (ClassNotFoundException e) {
			System.out.println("User not found");
			e.printStackTrace();
		}
		
		try {
			userValidated = userDAO.isValidatedByEmail(loginEmail);
		} catch (ClassNotFoundException e) {
			System.out.println("User account not verified.  ");
			e.printStackTrace();
		}
		*/
		
		try {
			if(!userDAO.userExists(loginEmail))
				throw new Exception("User not found");
			
			if(!userDAO.isValidatedByEmail(loginEmail))
				throw new Exception("User account not verified.");
				
		}catch (Exception e) {

			// forward to error page for debugging
			request.setAttribute("errorMessage", e.getMessage());
			RequestDispatcher errorDispatcher = request.getRequestDispatcher("/html/error.jsp");
			errorDispatcher.forward(request, response);
		}
		
		/*
		if (userExists == true && userValidated == true)
			System.out.println("user exists and has validated account");
		
		
		
		//sys.out messages for testing. 
		System.out.println("Pressed login!!");
		System.out.println("Email input value = " + loginEmail);
		System.out.println("Password input value = " + password);
		System.out.println("userExists = " + userExists);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/html/login.jsp");
		dispatcher.forward(request, response);
		
		*/
		
	}

}
