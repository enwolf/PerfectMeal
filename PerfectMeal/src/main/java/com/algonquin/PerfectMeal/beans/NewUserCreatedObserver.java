package com.algonquin.PerfectMeal.beans;

public class NewUserCreatedObserver implements Observer {

	private final String fromAddress = "validate@fake.fake";
	private Subject registerUserProxyDAO;

	public NewUserCreatedObserver(Subject registerUserProxyDAO) {
		this.registerUserProxyDAO = registerUserProxyDAO;
		registerUserProxyDAO.registerObserver(this);
	}

	@Override
	public void dispachNewUserVarificationEmail(User user) {

		String emailHeaderFrom = "From: " + fromAddress + "\n";
		String emailHeaderTo = "To: " + user.getEmail() + "\n\n";
		String message = "Hello " + user.getFirstName() + " " + user.getLastName() + " welcome to Perfect Meal! \n";
		String code = "Please use this code to verify your account: " + user.getId();

		generatetEmail(emailHeaderFrom, emailHeaderTo, message, code);

	}

	public void generatetEmail(String from, String to, String message, String code) {
		System.out.println(from + to + message + code);
	}

}
