import java.util.ArrayList;
public class Box implements Packable {
    private double maxWeight;
    private ArrayList<Packable> packables;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.packables = new ArrayList<>();
    }
    
    public void add(Packable packable) {
        if (this.weight() + packable.weight() <= this.maxWeight) {
            this.packables.add(packable);
        }
    }
    
    public String toString() {
        return "Box: " + this.packables.size() + " items, total weight " + this.weight() + " kg";
    }
    
    public double weight() {
        double weight = 0.0;
        for (Packable packable: packables) {
            weight += packable.weight();
        }
        return weight;
    }
    
}
