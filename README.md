# Recipe Book Project

## Overview
The Recipe Book Project is a text-based CLI application designed to provide users with an extendable catalog of food recipes. This application allows users to add new recipes, view existing recipes, and search for recipes based on ingredients or recipe names. The application is designed to be simple and user-friendly, making it easy for users to manage their personal recipe collection.

## Features
- Add new recipes
- View all recipes
- Search recipes by name
- Search recipes by ingredients
- Store recipes locally in a text-based format

## Requirements
- Java Development Kit (JDK) 8 or higher

## Project Structure
```
RecipeBook/
├── .gitignore
├── .vscode/
│   └── settings.json
├── diagrams/
│   ├── uml-diagram.jpeg
│   └── use-case-diagram.jpeg
├── LICENSE
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           ├── CLI.java
│   │           ├── Recipe.java
│   │           └── RecipeBook.java
│   └── test/
│       └── java/
│           └── com/
│               └── RecipeBookTest.java
├── target/
│   ├── classes/
│   │   └── main/
│   │       └── java/
│   │           ├── CLI.class
│   │           ├── Recipe.class
│   │           └── RecipeBook.class
│   ├── generated-sources/
│   │   └── annotations/
│   ├── generated-test-sources/
│   │   └── test-annotations/
│   ├── maven-archiver/
│   │   └── pom.properties
│   ├── maven-status/
│   │   └── maven-compiler-plugin/
│   │       └── compile/
│   │           └── default-compile/
│   │               ├── createdFiles.lst
│   │               └── inputFiles.lst
│   ├── surefire-reports/
│   │   ├── TEST-test.java.RecipeBookTest.xml
│   │   └── test.java.RecipeBookTest.txt
│   ├── test-classes/
│   │   └── test/
│   └── RecipeBookProject-1.0-SNAPSHOT.jar
```

## Setup and Usage

### 1. Clone the Repository
Clone the repository to your local machine:
```sh
git clone https://github.com/eneshtyrgl/RecipeBook.git
cd RecipeBook
```

### 2. Build the Project with Maven
Open a terminal and navigate to the RecipeBook directory. Build the project using Maven:
```sh
mvn clean install
```
This command compiles all Java files in the `src` directory and places the compiled `.class` files in the `target` directory.

### 3. Run the Application
Run the application using the java command:
```sh
java -jar target/RecipeBookProject-1.0-SNAPSHOT.jar
```
This will compile your project, package it into a JAR file, and then run the JAR file.

### 4. Run the Unit Tests
To run the unit tests using Maven:
```sh
mvn test
```

## Usage
- **Add Recipe**: Follow the prompts to enter the recipe name, ingredients, and preparation steps.
- **View All Recipes**: Displays a list of all recipes.
- **Search Recipe by Name**: Enter the recipe name to search for matching recipes.
- **Search Recipe by Ingredient**: Enter an ingredient to search for recipes containing that ingredient.
- **Exit**: Exit the application.

## Contributing
This project was created for a the Principles of Software Design and Development course assignment. However, contributions are welcome! If you would like to enhance the code or add new features, please feel free.

## License
This project is licensed under the MIT License.
