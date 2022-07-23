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


public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		
		if(session.getAttribute("loginEmail") != null) {
			
			String userEmailToDelete = (String) session.getAttribute("loginEmail");
			UserDAO userDAO = new UserDAO();
						
			try {
					userDAO.deleteUserFromDatabase(userEmailToDelete);
					request.getRequestDispatcher("/html/deleteUser.jsp").forward(request, response);
			}catch(ClassNotFoundException | SQLException e){
					System.out.println("Unable to delete user.");
					e.printStackTrace();
			}
					
		}
		

	}

}
