package linh.springframework.recipeapp.services;

import linh.springframework.recipeapp.commands.RecipeCommand;
import linh.springframework.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
     Set<Recipe> getRecipes();
     Recipe findById(Long l);
     RecipeCommand saveRecipeCommand(RecipeCommand command);

     RecipeCommand findCommandById(Long l);

    void deleteById(Long id);
}
