package com;

import java.util.List;
import java.util.Scanner;

public class CLI {
    private RecipeBook recipeBook;
    private Scanner scanner;

    public CLI() {
        this.recipeBook = new RecipeBook();
        this.scanner = new Scanner(System.in);
    }

    public void mainMenu() {
        while (true) {
            System.out.println("1. Add Recipe");
            System.out.println("2. View All Recipes");
            System.out.println("3. Search Recipe by Name");
            System.out.println("4. Search Recipe by Ingredient");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
    
            clearScreen();
            switch (choice) {
                case 1:
                    addRecipe();
                    break;
                case 2:
                    viewRecipes();
                    break;
                case 3:
                    searchByName();
                    break;
                case 4:
                    searchByIngredient();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    // Clears the console screen for better experience
    private void clearScreen() {
        System.out.print("\033[H\033[2J"); // ANSI escape code
        System.out.flush();
    }

    private void addRecipe() {
        System.out.print("Enter recipe name: ");
        String name = scanner.nextLine();
        System.out.print("Enter ingredients: ");
        String ingredients = scanner.nextLine();
        System.out.print("Enter preparation steps: ");
        String steps = scanner.nextLine();

        Recipe recipe = new Recipe(name, ingredients, steps);
        recipeBook.addRecipe(recipe);
        System.out.println("Recipe added successfully!");
    }

    private void viewRecipes() {
        List<Recipe> recipes = recipeBook.viewRecipes();
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    private void searchByName() {
        System.out.print("Enter recipe name: ");
        String name = scanner.nextLine();
        List<Recipe> recipes = recipeBook.searchByName(name);
        if (recipes.isEmpty()) {
            System.out.println("No recipes found with that name.");
        } else {
            for (Recipe recipe : recipes) {
                System.out.println(recipe);
            }
        }
    }

    private void searchByIngredient() {
        System.out.print("Enter ingredient: ");
        String ingredient = scanner.nextLine();
        List<Recipe> recipes = recipeBook.searchByIngredient(ingredient);
        if (recipes.isEmpty()) {
            System.out.println("No recipes found with that ingredient.");
        } else {
            for (Recipe recipe : recipes) {
                System.out.println(recipe);
            }
        }
    }

    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.mainMenu();
    }
}