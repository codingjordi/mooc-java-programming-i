/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Bird {
    
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
     public void setLatinName(String latinName) {
        this.latinName = latinName;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public void setObservations() {
        this.observations++;
    }
    
    public int getObservations() {
        return this.observations;
    }
    
    public String toString() {
        return this.getName() + " (" + this.getLatinName() + "): " + this.getObservations() + " observations";
    }
}
