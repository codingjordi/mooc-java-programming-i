
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Recipe {
    
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe() {
        this.name = "";
        this.cookingTime = 0;
        this.ingredients = new ArrayList<>();
    }
    
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }
    
     public int getCookingTime() {
        return this.cookingTime;
    }
    
    public void setIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    public void printRecipe() {
        System.out.println(this.name + ", cooking time: " + this.cookingTime);
    }
}
