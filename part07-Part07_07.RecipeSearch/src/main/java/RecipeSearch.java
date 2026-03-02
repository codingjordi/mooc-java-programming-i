
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        while (true) {
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");

            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            if (command.contains("stop")) {
                break;
            }

            if (command.contains("list")) {

                ArrayList<Recipe> recipes = new ArrayList<>();

                try ( Scanner fileScanner = new Scanner(Paths.get(fileName))) {

                    String name = "";
                    int time = 0;
                    ArrayList<String> ingredients = new ArrayList<>();
                    int lineIndex = 0;

                    while (fileScanner.hasNextLine()) {
                        String row = fileScanner.nextLine();

                        if (row.isEmpty()) {
                            recipes.add(new Recipe(name, time, ingredients));
                            lineIndex = 0;
                            ingredients = new ArrayList<>();
                            continue;
                        }

                        if (lineIndex == 0) {
                            name = row;
                        } else if (lineIndex == 1) {
                            time = Integer.valueOf(row);
                        } else {
                            ingredients.add(row);
                        }

                        lineIndex++;
                    }

                    recipes.add(new Recipe(name, time, ingredients));

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                
                if (!recipes.isEmpty()) {
                    for (Recipe recipe : recipes) {
                    recipe.printRecipe();
                    
                }

                
                }
                    

            }
        }
    }

}
