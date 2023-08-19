import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private NumberSet numberSet;

    public UserInterface(Scanner scanner, NumberSet numberSet) {
        this.scanner = scanner;
        this.numberSet = numberSet;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");   
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input > -1 && input < 101) {
                numberSet.add(input);
            }
        }
        System.out.println(this.numberSet.pointAverageAll());
        System.out.println(this.numberSet.pointAveragePassing());
        System.out.println(this.numberSet.passPercentage());
        numberSet.gradeDistribution();

    }
}
