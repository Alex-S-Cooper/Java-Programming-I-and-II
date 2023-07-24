import java.util.ArrayList;
public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        };
    }
    
    public String toString() {
        if (suitcases.size() == 0) {
            return "no items (" + this.totalWeight() + " kg)";
        } else if (suitcases.size() == 1) {
            return this.suitcases.size() + " suitcase" + " (" + this.totalWeight() + " kg)";
        } else {
            return this.suitcases.size() + " suitcases" + " (" + this.totalWeight() + " kg)";
        }
    }
    
    public int totalWeight() {
        int holdWeight = 0;
        if (this.suitcases.isEmpty()) {
            return holdWeight;
        }
        for (Suitcase suitcase: this.suitcases) {
            holdWeight += suitcase.totalWeight();
        }
        return holdWeight;
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printItems();
        }
    }
}
