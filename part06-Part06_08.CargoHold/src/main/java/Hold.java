
import java.util.ArrayList;

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

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int holdMaxWeight) {
        this.maxWeight = holdMaxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.getWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    private int getWeight() {
        int total = 0;
        for (Suitcase s : suitcases) {
            total += s.totalWeight(); 
        }
        return total;
    }
    
    public void printItems() {
        for(Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "0 suitcases (0 kg)";
        }
        
        return this.suitcases.size() + " suitcases (" + this.getWeight() + " kg)";
    }
}