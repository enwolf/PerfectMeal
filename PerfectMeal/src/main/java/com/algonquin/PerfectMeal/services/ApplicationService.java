package com.algonquin.PerfectMeal.services;

import java.util.Map;
import java.util.UUID;

import com.algonquin.PerfectMeal.beans.Recipe;

public interface ApplicationService {

    public Map<UUID, Recipe> readRecipes();

    public Recipe readRecipe(String id);

    public void createOrUpdateRecipe(Recipe recipe);

}
