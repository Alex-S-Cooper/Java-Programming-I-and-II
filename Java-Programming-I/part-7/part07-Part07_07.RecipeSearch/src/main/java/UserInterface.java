import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
    }
    
    public void start() {
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        this.readFile(fileName);
        System.out.println("");
        System.out.println("Commands: ");
        System.out.println("list - lists the reciples");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        System.out.println("Enter command: ");
        
        while (true) {
            String command = scanner.nextLine();
            System.out.println("");

            if (command.equals("list")) {
                this.listRecipes();
            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String searchedWord = scanner.nextLine();
                this.findRecipeByName(searchedWord);
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int searchedTime = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes:");
                this.findRecipeByTime(searchedTime);
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String searchedIngredient = scanner.nextLine();
                this.findRecipeByIngredients(searchedIngredient);
            } else if (command.equals("test")) {
                for (int i = 0; i < this.recipes.size(); i++) {
                    System.out.println("Recipe " + (i + 1) + " is " + this.recipes.get(i).getName() + ".");
                    System.out.println("It takes " + this.recipes.get(i).getCookingTime() + " minutes to cook.");
                    System.out.println("Its ingredients are:");
                    for (String ingredient: this.recipes.get(i).getIngredients()) {
                        System.out.println(ingredient);
                    }
                    System.out.println("");
                }
            }
        }
    }
                    
    public void readFile(String fileName) {
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            
            String name = "";
            int cookingTime = 0;
            ArrayList<String> ingredients = new ArrayList<>();
            int count = 0;
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                count++;
                
                if (!(row.isBlank())) {
                    if (count == 1) {
                        name = row;
                    } else if (count == 2) {
                        cookingTime = Integer.valueOf(row);
                    } else {
                        ingredients.add(row);
                    }
                } else {
                    this.recipes.add(new Recipe(name, cookingTime, new ArrayList<>(ingredients)));
                    name = "";
                    cookingTime = 1;
                    ingredients.clear();
                    count = 0;
                }
            }
            this.recipes.add(new Recipe(name, cookingTime, new ArrayList<>(ingredients)));
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void listRecipes() {
        for (Recipe recipe: this.recipes) {
            System.out.println(recipe.toString());
        }
    }
    
    public void findRecipeByName(String name) {
        for (Recipe recipe: this.recipes) {
            if (recipe.getName().toLowerCase().contains(name)) {
                System.out.println(recipe.toString());
            }
        }
    }
    
    public void findRecipeByTime(int cookingTime) {
        for (Recipe recipe: this.recipes) {
            if (recipe.getCookingTime() <= cookingTime) {
                System.out.println(recipe.toString());
            }
        }
    }
    
    public void findRecipeByIngredients(String searchedIngredient) {
        for (Recipe recipe: this.recipes) {
            for (String ingredient: recipe.getIngredients()) {
                if (ingredient.equals(searchedIngredient)) {
                    System.out.println(recipe.toString());
                }
            }
        }
    }
}
