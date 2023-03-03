/*
 * 
 * You can use the following import statements
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here

package com.example.recipe;
import org.springframework.web.bind.annotation.*;
import com.example.recipe.RecipeService;
import java.util.*;
import com.example.recipe.Recipe;

@RestController 
public class RecipeController{
    RecipeService recipeService = new RecipeService();

    @GetMapping("/recipes")
    public ArrayList<Recipe> getAllRecipe(){
        return recipeService.getAllRecipe();
    }

    @GetMapping("/recipes/{recipeId}")
    public Recipe getRecipe(@PathVariable int recipeId){
        return recipeService.getRecipe(recipeId);
    }

    @PostMapping("/recipes")
    public Recipe postRecipe(@RequestBody Recipe recipe){
        return recipeService.postRecipe(recipe);
    }

    @PutMapping("/recipes/{recipeId}")
    public Recipe putRecipe(@PathVariable int recipeId, @RequestBody Recipe recipe){
        return recipeService.putRecipe(recipeId,recipe);
    }

    @DeleteMapping("/recipes/{recipeId}")
    public void deleteMapping(@PathVariable int recipeId){
        recipeService.deleteMapping(recipeId);
    }

}
