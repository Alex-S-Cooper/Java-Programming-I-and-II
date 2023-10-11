import java.util.ArrayList;
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Item item) {
        if (this.getWeight() + item.getWeight() > this.capacity) {
            return;
        }
        this.items.add(item);
    }
    
    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            if (this.getWeight() + item.getWeight() > this.capacity) {
                return;
            }
            this.add(item);
        }
    }

    public boolean isInBox(Item item) {
        for (Item boxItem: this.items) {
            if (boxItem.equals(item)) {
                return true;
            } 
        } 
        return false;
    }
    
    public int getWeight() {
        int weight = 0;
        for (Item item: this.items) {
            weight += item.getWeight();
        }
        return weight;
    }
}
