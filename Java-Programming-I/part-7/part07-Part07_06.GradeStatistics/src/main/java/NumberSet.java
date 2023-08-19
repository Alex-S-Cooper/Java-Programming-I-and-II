import java.util.ArrayList;

public class NumberSet {
    private ArrayList<Integer> numbers;
    private ArrayList<Integer> passingNumbers;
    
    public NumberSet() {
        this.numbers = new ArrayList<>();
        this.passingNumbers = new ArrayList<>();
    }
    
    public void add(int number) {
        this.numbers.add(number);
        if (number >= 50) {
            this.passingNumbers.add(number);
        }
        
    }
    
    public String pointAverageAll() {
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        return "Point average (all): " + (float) sum / numbers.size();
    }
    
    public String pointAveragePassing() {
        int sum = 0;
        for (int number: numbers) {
            if (number >= 50) {
                sum += number;
            }
        }
    
        if (this.passingNumbers.isEmpty()) {
            return "Point average (passing): -";
        }
        
        return "Point average (passing): " + (float) sum / this.passingNumbers.size();
    }
    
    public String passPercentage() {
        return "Pass percentage: " +  (float) 100 * this.passingNumbers.size() / this.numbers.size();
    }
    
    public void gradeDistribution() {
        for (int i = 5; i >= 0; i--) {
            int count = 0;
            for (int number: this.numbers) {
                if (this.pointConverter(number) == i) {
                    count++;
                }
            }
            System.out.println(i + ":" + this.starBuilder(count));
        }
    }
    
    public int pointConverter(int points) {
        if (points < 50) {
            return 0;
        } else if (points < 60) {
            return 1;
        } else if (points < 70) {
            return 2;
        } else if (points < 80) {
            return 3;
        } else if (points < 90) {
            return 4;
        } else {
            return 5;   
        }
    }
    
    public String starBuilder(int count) {
        String stars = "*".repeat(count);
        return stars;
    }
}
