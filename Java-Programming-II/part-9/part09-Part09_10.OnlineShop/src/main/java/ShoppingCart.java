import java.util.List;
import java.util.ArrayList;
public class ShoppingCart {
    private List<Item> items;
    
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }
    
    public void add(String product, int price) {
        for (Item item: this.items) {
            if (item.getProductName().equals(product)) {
                item.increaseQuantity();
                return;
            }
        }
        this.items.add(new Item(product, 1, price));
    }
    
    public int price() {
        int total = 0;
        for (Item item: this.items) {
            total += item.price();
        }
        return total;
    }
    
    public void print() {
        for (Item item: this.items) {
            System.out.println(item.toString());
        }
    }
}
