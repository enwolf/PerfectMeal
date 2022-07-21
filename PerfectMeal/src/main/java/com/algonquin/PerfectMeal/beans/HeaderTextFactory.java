package com.algonquin.PerfectMeal.beans;

public class HeaderTextFactory {

	public HeaderTextFactory() {

	}

	public static String getHeaderText(String pageName) {

		if (pageName.equals("index.jsp")) {
			return "Welcome!";
		}
		if (pageName.equals("recipe.jsp")) {
			return "Recipe!";
		}
		return null;
	}

}
