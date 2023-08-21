public class Container {
    private int liter;
    
    public Container() {
        this.liter = 0;
    }
    
    public void addAmount(int amount) {
        this.liter += amount;
        if (this.liter > 100) {
            this.liter = 100;
        }
    }
    
    public void removeAmount(int amount) {
        this.liter -= amount;
        if (this.liter < 0) {
            this.liter = 0;
        }
    }
    
    public int getAmount() {
        return this.liter;
    }
    
    public String toString() {
        return this.liter + "/100";
    }
}
