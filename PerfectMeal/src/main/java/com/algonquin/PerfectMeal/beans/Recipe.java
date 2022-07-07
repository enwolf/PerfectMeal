package com.algonquin.PerfectMeal.beans;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

public class Recipe {
	private String id;
	private String name;
	private String description;
	private String CookTime;
	private String MealLink;
	
	
    public Recipe() {
    }
    public Recipe(String id, String name, String description, String CookTime, String MealLink) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.CookTime = CookTime;
        this.MealLink = MealLink;
    }
	public void setId(String uuid) {
		this.id = uuid;
		
	}
    public String getId() {
        return id;
    }
    
	public void setName(String name) {
		this.name = name;
		
	}
    public String getName() {
        return name;
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
	

  /*  public String getAllRecipes() {
    	return id;
    	return name;
    	return description;
    	return CookTime;
    	return MealLink;
    } */
}
