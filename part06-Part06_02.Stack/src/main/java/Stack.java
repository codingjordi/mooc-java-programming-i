/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josaca
 */
import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> s = new ArrayList<>();
    
    public Stack() {
        this.s = new ArrayList<>();
    }
    
    public void add(String value) {
        this.s.add(0, value);
    }
    
    public String take() {
        return this.s.remove(0);
    }
    
    public boolean isEmpty() {
        return this.s.isEmpty();
    }
    
    public ArrayList<String> values() {
        return this.s;
    }
}
