package linh.springframework.recipeapp.services;

import linh.springframework.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
     Set<Recipe> getRecipes();

}
