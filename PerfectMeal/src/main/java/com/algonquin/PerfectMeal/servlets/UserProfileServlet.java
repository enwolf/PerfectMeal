package com.algonquin.PerfectMeal.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.algonquin.PerfectMeal.beans.User;
import com.algonquin.PerfectMeal.dao.UserDAO;


public class UserProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("user profile button pressed");
		
		HttpSession session = request.getSession(false);
		
		if(session.getAttribute("loginEmail") != null) {
			
			UserDAO userDAO = new UserDAO();
			User userToLogin;
			
			try {
			
			userToLogin = userDAO.getSpeicifcUserFromDatabaseByEmail((String)session.getAttribute("loginEmail"));
	
			session.setAttribute("userEmail", userToLogin.getEmail());
			session.setAttribute("firstName", userToLogin.getFirstName());
			session.setAttribute("lastName", userToLogin.getLastName());
			session.setAttribute("password", userToLogin.getPassword());
			
			request.getRequestDispatcher("/html/userProfile.jsp").forward(request, response);
			
			}catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}
