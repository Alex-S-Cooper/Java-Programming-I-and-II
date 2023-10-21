import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> stockBalance;
    
    public Warehouse() {
        this.productPrices = new HashMap<>();  
        this.stockBalance = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.productPrices.putIfAbsent(product, price);
        this.stockBalance.put(product, stock + this.stockBalance.getOrDefault(product, 0));
    }
    
    public int price(String product) {
        if (this.productPrices.containsKey(product)) {
            return this.productPrices.get(product);
        }
        return -99;
    }
    
    public int stock(String product) {
        if (this.stockBalance.containsKey(product)) {
            return this.stockBalance.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product) {
        if (this.stockBalance.containsKey(product)) {
            if (this.stockBalance.get(product) > 0) {
                this.stockBalance.put(product, this.stockBalance.get(product) - 1);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> products = this.productPrices.keySet();
        return products;
    }
}
