package com.algonquin.PerfectMeal.dao;

import java.util.ArrayList;

import com.algonquin.PerfectMeal.beans.Observer;
import com.algonquin.PerfectMeal.beans.Subject;
import com.algonquin.PerfectMeal.beans.User;

public class RegisterUserProxyDAO implements Subject {
	// Original Object we are acting as proxy for.
	private UserDAO userDAO = new UserDAO();
	// list of observers
	private ArrayList<Observer> observers;
	// local user object.
	private User userProxy;

	public RegisterUserProxyDAO() {
		this.userProxy = new User();
		this.observers = new ArrayList<Observer>();
	}

	public void createUser(User user) throws ClassNotFoundException {
		userProxy = user;
		userDAO.createUser(userProxy);
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.dispachNewUserVarificationEmail(userProxy);
		}
	}

}
