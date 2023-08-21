public class Container {
    private int liter;
    
    public Container() {
        this.liter = 0;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        this.liter += amount;
        if (this.liter > 100) {
            this.liter = 100;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        this.liter -= amount;
        if (this.liter < 0) {
            this.liter = 0;
        }
    }
    
    public int contains() {
        return this.liter;
    }
    
    public String toString() {
        return this.liter + "/100";
    }
}
