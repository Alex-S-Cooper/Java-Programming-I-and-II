import java.util.ArrayList;
public class MisplacingBox extends Box {
    private ArrayList<Item> items;
    
    public MisplacingBox() {
        this.items = new ArrayList<>();
    }
    
    public void add(Item item) {
        this.items.add(item);
    }
    
    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            this.add(item);
        }
    }

    public boolean isInBox(Item item) {
        return false;
    }
}
