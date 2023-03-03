// Write your code here
package com.example.recipe;
import java.util.*;
public class Recipe{
    private int recipeId;
    private String recipeName;
    private String recipeType;
    private List<String> ingredients;

    public Recipe(int recipeId, String recipeName, String recipeType, List<String> ingredients){
        this.recipeId=recipeId;
        this.recipeName=recipeName;
        this.recipeType=recipeType;
        this.ingredients=ingredients;
    }

    public void setRecipeId(int recipeId){
        this.recipeId=recipeId;
    }
    public int getRecipeId(){
        return recipeId;
    }

    public void setRecipeName(String recipeName){
        this.recipeName=recipeName;
    }
    public String getRecipeName(){
        return recipeName;
    }

    public void setRecipeType(String recipeType){
        this.recipeType=recipeType;
    }
    public String getRecipeType(){
        return recipeType;
    }

    public void setIngredients(List<String> ingredients){
        this.ingredients=ingredients;
    }
    public List<String> getIngredients(){
        return ingredients;
    }



}