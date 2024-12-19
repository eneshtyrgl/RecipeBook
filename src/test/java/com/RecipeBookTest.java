package com;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RecipeBookTest {
    private RecipeBook recipeBook;

    @Before
    public void setUp() {
        recipeBook = new RecipeBook();
    }

    @Test
    public void testAddRecipe() {
        Recipe recipe = new Recipe("Pancakes", "Flour, Eggs, Milk", "Mix ingredients and cook");
        recipeBook.addRecipe(recipe);
        List<Recipe> recipes = recipeBook.viewRecipes();
        assertEquals(1, recipes.size());
        assertEquals("Pancakes", recipes.get(0).getName());
    }

    @Test
    public void testSearchByName() {
        Recipe recipe = new Recipe("Pancakes", "Flour, Eggs, Milk", "Mix ingredients and cook");
        recipeBook.addRecipe(recipe);
        List<Recipe> recipes = recipeBook.searchByName("Pancakes");
        assertEquals(1, recipes.size());
        assertEquals("Pancakes", recipes.get(0).getName());
    }

    @Test
    public void testSearchByIngredient() {
        Recipe recipe = new Recipe("Pancakes", "Flour, Eggs, Milk", "Mix ingredients and cook");
        recipeBook.addRecipe(recipe);
        List<Recipe> recipes = recipeBook.searchByIngredient("Eggs");
        assertEquals(1, recipes.size());
        assertEquals("Pancakes", recipes.get(0).getName());
    }

    @Test
    public void testViewRecipes() {
        Recipe recipe1 = new Recipe("Pancakes", "Flour, Eggs, Milk", "Mix ingredients and cook");
        Recipe recipe2 = new Recipe("Omelette", "Eggs, Cheese", "Cook eggs and add cheese");
        recipeBook.addRecipe(recipe1);
        recipeBook.addRecipe(recipe2);
        List<Recipe> recipes = recipeBook.viewRecipes();
        assertEquals(2, recipes.size());
    }
}