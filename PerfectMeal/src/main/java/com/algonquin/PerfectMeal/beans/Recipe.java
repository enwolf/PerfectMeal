package com.algonquin.PerfectMeal.beans;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

public class Recipe {
	private int mealID;
	private String mealName;
	private String description;
	private String CookTime;
	private String MealLink;
	
	
    public Recipe() {
    }
    public Recipe(int mealID, String mealName, String description, String CookTime, String MealLink) {
        this.mealID = mealID;
        this.mealName = mealName;
        this.description = description;
        this.CookTime = CookTime;
        this.MealLink = MealLink;
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
