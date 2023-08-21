import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        int count = 0;
        boolean positiveNumber = false;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }
        
        for (int number: numbers) {
            if (number > 0) {
                sum += number;
                count++;
                positiveNumber = true;
            } 
        }
        
        if (positiveNumber == false) {
            System.out.println("Cannot calculate the average");
        }
        
        System.out.println((double) sum / count);
    }
}
