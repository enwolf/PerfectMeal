package com.algonquin.PerfectMeal.beans;

public class User {

	private String ID;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private int isVarified;

	public void setId(String ID) {
		this.ID = ID;
	}

	public String getId() {
		return ID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getIsVarified() {
		return isVarified;
	}

	public void setIsVarified(int isVarified) {
		this.isVarified = isVarified;
	}
}
