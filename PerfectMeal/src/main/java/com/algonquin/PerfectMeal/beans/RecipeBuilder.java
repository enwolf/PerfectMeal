package com.algonquin.PerfectMeal.beans;

public class RecipeBuilder {

	private int mealID;
	private String mealName;
	private String description;
	private String CookTime;
	private String MealLink;

	public RecipeBuilder() {

	}

	// getters
	public int getMealID() {
		return mealID;
	}

	public String getMealName() {
		return mealName;
	}

	public String getDescription() {
		return description;
	}

	public String getCookTime() {
		return CookTime;
	}

	public String getMealLink() {
		return MealLink;
	}

	public RecipeBuilder setMealID(int mealID) {
		this.mealID = mealID;
		return this;
	}

	public RecipeBuilder setName(String mealName) {
		this.mealName = mealName;
		return this;
	}

	public RecipeBuilder setDescription(String description) {
		this.description = description;
		return this;
	}

	public RecipeBuilder setCookTime(String CookTime) {
		this.CookTime = CookTime;
		return this;
	}

	public RecipeBuilder setMealLink(String MealLink) {
		this.MealLink = MealLink;
		return this;
	}

	public Recipe build() {
		Recipe recipe = new Recipe(this);
		return recipe;
	}

}
