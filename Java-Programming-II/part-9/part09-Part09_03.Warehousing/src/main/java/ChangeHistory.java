import java.util.ArrayList;
public class ChangeHistory {
    private ArrayList<Double> changeHistory;
    
    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }
    
    public void add(double status) {
        this.changeHistory.add(status);
    }
    
    public void clear() {
        this.changeHistory.clear();
    }
    
    public String toString() {
        return this.changeHistory.toString();
    }
    
    public double maxValue() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        }
        double maxValue = this.changeHistory.get(0);
        for (double value: this.changeHistory) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
    
    public double minValue() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        }
        double minValue = this.changeHistory.get(0);
        for (double value: this.changeHistory) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
    
    public double average() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (double value: this.changeHistory) {
            total += value;
        }
        return total / this.changeHistory.size();
    }
    
    
}
