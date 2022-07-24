package com.algonquin.PerfectMeal.dao;

import com.algonquin.PerfectMeal.beans.User;

public class RegisterUserProxyDAO {

	private UserDAO userDAO = new UserDAO();

	public int createUser(User user) throws ClassNotFoundException {

		return userDAO.createUser(user);

	}

}
