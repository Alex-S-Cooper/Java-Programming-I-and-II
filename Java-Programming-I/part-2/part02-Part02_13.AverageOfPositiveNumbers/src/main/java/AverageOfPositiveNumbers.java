
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float inputs = 0;
        float sum = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num > 0) {
                inputs = inputs + 1;
                sum = sum + num;
            }
        }
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / inputs);
        }
    }
}
