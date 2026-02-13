/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josaca
 */
public class Container {
    
    public int liquid;
    
    public Container() {
        this.liquid = 0;
    }
    
    public int contains() {
        return this.liquid;
    }
    
    public void add(int amount) {
        if(amount > 0) {
            this.liquid += amount;
        }
        
        if(this.liquid > 100) {
            this.liquid = 100;
        }
        
    }
    
    public void remove(int amount)  {
        if(amount > 0) {
            this.liquid -= amount;
        }
        
        if(this.liquid < 0) {
            this.liquid = 0;
        }
        
    }
    
    public String toString() {
        return String.valueOf(this.liquid) + "/100";
    }
}
