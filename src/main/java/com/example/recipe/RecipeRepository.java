// Write your code here
package com.example.recipe;
import com.example.recipe.RecipeService;
import com.example.recipe.Recipe;
import java.util.*;

public interface RecipeRepository{
    ArrayList<Recipe> getAllRecipe();
    Recipe getRecipe(int recipeId);
    Recipe postRecipe(Recipe recipe);
    Recipe putRecipe(int recipeId, Recipe recipe);
    void deleteMapping(int recipeId);
}


    