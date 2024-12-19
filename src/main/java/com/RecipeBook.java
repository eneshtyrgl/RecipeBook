package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RecipeBook {
    private List<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public List<Recipe> viewRecipes() {
        return recipes;
    }

    public List<Recipe> searchByName(String name) {
        return recipes.stream()
                .filter(recipe -> recipe.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<Recipe> searchByIngredient(String ingredient) {
        return recipes.stream()
                .filter(recipe -> recipe.getIngredients().toLowerCase().contains(ingredient.toLowerCase()))
                .collect(Collectors.toList());
    }
}