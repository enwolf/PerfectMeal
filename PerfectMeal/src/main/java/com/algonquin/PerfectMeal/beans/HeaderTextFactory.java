package com.algonquin.PerfectMeal.beans;

public class HeaderTextFactory {

	public HeaderTextFactory() {

	}

	// base header and maybe userHeader or loginHeader object that holds current users login value?
	// Dispatch each as needed as a way to more properly implement this pattern.

	public static String getHeaderTextObj(String pageName) {

		if (pageName.equals("index.jsp")) {
			return "Welcome!";
		}
		if (pageName.equals("recipe.jsp")) {
			return "Recipe!";
		}
		return null;
	}

	public static String getHeaderText(String pageName) {

		String headerText = "";
		switch (pageName) {

		case "index.jsp":
			headerText = "Welcome!";
			break;
		case "recipe.jsp":
			headerText = "Meal Planning";
			break;
		case "registerUserForm.jsp":
			headerText = "Please Registar";
			break;
		case "login.jsp":
			headerText = "Logged In";
			break;
		case "userProfile.jsp":
			headerText = "Current User: ";
			break;
		case "logout.jsp":
			headerText = "Good Bye";
			break;
		case "deleteUser.jsp":
			headerText = "User Deleted";
			break;
		case "userAuthentication.jsp":
			headerText = "Validate User";
			break;
		case "forgot-password.jsp":
			headerText = "Enter Email";
			break;
		case "forgot-password-code-validation.jsp":
			headerText = "Enter Recovery Code";
			break;
		case "update-user-password.jsp":
			headerText = "Confrim Password";
			break;
		case "debugPage.jsp":
		case "errorPage.jsp":
			headerText = "Error: Somthing went wrong";
			break;
		default:
			// code block
		}
		return headerText;
	}
}
