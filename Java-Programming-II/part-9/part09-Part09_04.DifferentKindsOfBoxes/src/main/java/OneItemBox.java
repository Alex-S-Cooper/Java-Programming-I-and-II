import java.util.ArrayList;
public class OneItemBox extends Box {
    private ArrayList<Item> items;
    
    public OneItemBox() {
        this.items = new ArrayList<>();
    }
    
    public void add(Item item) {
        if (this.items.isEmpty()) {
            this.items.add(item);
        }
    }
    
    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            if (this.items.isEmpty()) {
                this.add(item);
            }
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
}
