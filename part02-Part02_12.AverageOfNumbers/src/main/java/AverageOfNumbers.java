
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float inputs = 0;
        float sum = 0;
        float average = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            inputs = inputs + 1;
            sum = sum + num;
        }
        average = sum / inputs;
        System.out.println("Average of the numbers: " + average);
        System.out.println(inputs);
        System.out.println(sum);
    }
}
