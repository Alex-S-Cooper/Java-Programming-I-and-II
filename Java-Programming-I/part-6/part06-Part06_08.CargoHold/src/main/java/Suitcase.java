import java.util.ArrayList;
public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    
    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maximumWeight) {
            this.items.add(item);
        }
    }
    
    public String toString() {
        if (items.size() == 0) {
            return "no items (" + this.totalWeight() + " kg)";
        } else if (items.size() == 1) {
            return this.items.size() + " item" + " (" + this.totalWeight() + " kg)";
        } else {
            return this.items.size() + " items" + " (" + this.totalWeight() + " kg)";
        }
    }
    
    public int totalWeight() {
        int suitcaseWeight = 0;
        if (this.items.isEmpty()) {
            return suitcaseWeight;
        }
        for (Item item: this.items) {
            suitcaseWeight += item.getWeight();
        }
        return suitcaseWeight;
    }
    
    public void printItems() {
        for (Item item: this.items) {
            System.out.println(item.toString());
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);
        for (Item item: this.items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
}
