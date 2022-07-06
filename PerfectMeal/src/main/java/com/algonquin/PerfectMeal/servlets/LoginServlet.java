package com.algonquin.PerfectMeal.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		String loginEmail = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		
		
		System.out.println("Pressed login!!");
		System.out.println("Email input value = " + loginEmail);
		System.out.println("Password input value = " + password);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/html/login.jsp");
		dispatcher.forward(request, response);
		
		
		
	}

}
