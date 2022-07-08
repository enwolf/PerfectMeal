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


public class UpdateUserProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*
		String newFirstName = request.getParameter("firstName");
		String newLastName = request.getParameter("LastName");
		String newPassword = request.getParameter("Password");
		
		
		
		
		System.out.println(newFirstName);
		System.out.println(newLastName);
		System.out.println(newPassword);
		*/
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		/*
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String password = request.getParameter("password");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(password);
		
		request.getRequestDispatcher("/html/userProfile.jsp").forward(request, response);
		
		
		HttpSession session = request.getSession(false);
		
		
		System.out.println(session.getAttribute("loginEmail"));
		System.out.println(session.getAttribute("firstName"));
		System.out.println(session.getAttribute("lastName"));
		System.out.println(session.getAttribute("password"));

		

		
		
		if (session != null) {	
		
			
			
	
		
		String loginEmail = (String) session.getAttribute("loginEmail");
		String firstName  = (String) session.getAttribute("firstName");
		String lastName  = (String) session.getAttribute("lastName");
		String password  = (String) session.getAttribute("password");
		
		System.out.println(loginEmail);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(password);
		
			
		try {
				UserDAO userDAO = new UserDAO();
				
				userDAO.updateUserDataInDatabase(loginEmail, firstName, lastName, password);
									
				//User userToUpdate;	
			
			/*
				userToUpdate = userDAO.getSpeicifcUserFromDatabaseByEmail((String)session.getAttribute("loginEmail"));
	
			
				session.setAttribute("firstName", userToUpdate.getFirstName());
				session.setAttribute("lastName", userToUpdate.getLastName());
				session.setAttribute("Password", userToUpdate.getPassword());
					
				
			
			}catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
		}
		
	}


	

