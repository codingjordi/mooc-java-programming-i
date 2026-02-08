
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
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int suitcaseMaxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = suitcaseMaxWeight;
    }

    public void addItem(Item item) {
        int suitcaseWeight = 0;

        for (Item i : this.items) {
            suitcaseWeight += i.getWeight();
        }

        if (suitcaseWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public Item heaviestItem() {

        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.items.get(0);

        for (Item item : items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }

        return heaviestItem;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public int totalWeight() {

        if (this.items.isEmpty()) {
            return 0;
        }

        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public String toString() {

        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        int suitcaseWeight = 0;

        for (Item item : items) {
            if (!(this.items.isEmpty())) {
                suitcaseWeight += item.getWeight();
            }
        }

        if (items.size() == 1) {
            return this.items.size() + " item (" + suitcaseWeight + "kg)";

        }

        return this.items.size() + " items (" + suitcaseWeight + "kg)";

    }
}
