
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            } 
            
            inputs.add(input);
        }
        
        System.out.println("Pring the average of the negative numbers or the positive numbers?");
        String input = scanner.nextLine();
        if (input.equals("n")) {
            double negativeAverage = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(num -> num < 0)
                .average()
                .getAsDouble();
            System.out.println("average of the negative numbers: " + negativeAverage);
        } else if (input.equals("p")) {
            double positiveAverage = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(num -> num > 0)
                .average()
                .getAsDouble();    
            System.out.println("average of the positive numbers: " + positiveAverage);
        }
    }
}
