package com.example.recipe;

import com.example.recipe.RecipeRepository;
import com.example.recipe.Recipe;

import java.util.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.server.handler.ResponseStatusExceptionHandler;
import org.springframework.http.HttpStatus;

// Don't modify the below code

public class RecipeService implements RecipeRepository {

        private static HashMap<Integer, Recipe> recipeBook = new HashMap<>();

        public RecipeService() {
                recipeBook.put(1,
                                new Recipe(1, "Pasta", "veg",
                                                Arrays.asList("pasta", "tomatoes", "olive oil", "garlic", "basil")));
                recipeBook.put(2, new Recipe(2, "Chicken Curry", "non-veg",
                                Arrays.asList("chicken", "onion", "tomato", "ginger", "garlic", "spices")));
                recipeBook.put(3, new Recipe(3, "Sushi", "non-veg",
                                Arrays.asList("sushi rice", "tuna fish", "seaweed", "wasabi", "ginger")));
                recipeBook.put(4, new Recipe(4, "Mushroom Risotto", "veg",
                                Arrays.asList("rice", "mushrooms", "onion", "garlic", "butter", "parmesan")));
                recipeBook.put(5, new Recipe(5, "Fish and Chips", "non-veg",
                                Arrays.asList("fish", "potatoes", "flour", "oil", "spices")));
        }

        // Don't modify the above code

        // Write your code here

        Integer uniId = 6;
        public ArrayList<Recipe> getAllRecipe(){
            Collection<Recipe> collRecipe = recipeBook.values();
            ArrayList<Recipe> allRecipe = new ArrayList<>(collRecipe);
            return allRecipe;
        }
        public Recipe getRecipe(int recipeId){
                Recipe recipe = recipeBook.get(recipeId);
                if(recipe == null){
                        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
                }
                return recipe;
        
        }

       public Recipe postRecipe(Recipe recipe){
        recipe.setRecipeId(uniId);
        recipeBook.put(uniId,recipe);
        uniId+=1;
        return recipe;

    }

    public Recipe putRecipe(int recipeId, Recipe recipe){
        Recipe recipes = recipeBook.get(recipeId);
        if(recipes == null){
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        if(recipe.getRecipeName() != null){
                recipes.setRecipeName(recipe.getRecipeName());
        }
        if(recipe.getRecipeType() != null){
                recipes.setRecipeType(recipe.getRecipeType());
        }
        if(recipe.getIngredients() != null){
                recipes.setIngredients(recipe.getIngredients());
        }
        return recipes;
        
    }

    public void deleteMapping(int recipeId){
        Recipe recipes = recipeBook.get(recipeId);
        if(recipes == null){
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        else{
                recipeBook.remove(recipeId);
                throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
    }
}