package com.algonquin.PerfectMeal.beans;

public class Recipe {
	private int mealID;
	private String mealName;
	private String description;
	private String CookTime;
	private String MealLink;

	public Recipe(RecipeBuilder builder) {
		this.mealID = builder.getMealID();
		this.mealName = builder.getMealName();
		this.description = builder.getDescription();
		this.CookTime = builder.getCookTime();
		this.MealLink = builder.getMealLink();

	}

	public void setId(int mealID) {
		this.mealID = mealID;

	}

	public int getId() {
		return mealID;
	}

	public void setName(String mealName) {
		this.mealName = mealName;

	}

	public String getName() {
		return mealName;
	}

	public void setDescription(String description) {
		this.description = description;

	}

	public String getDescription() {
		return description;
	}

	public void setCookTime(String CookTime) {
		this.CookTime = CookTime;

	}

	public String getCookTime() {
		return CookTime;
	}

	public void setMealLink(String MealLink) {
		this.MealLink = MealLink;

	}

	public String getMealLink() {
		return MealLink;
	}

}
