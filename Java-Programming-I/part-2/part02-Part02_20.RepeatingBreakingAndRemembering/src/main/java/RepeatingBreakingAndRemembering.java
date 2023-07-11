
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int num = 0;
        int sum = 0;
        int inputs = 0;
        int evenNums = 0;
        int oddNums = 0;
        while (true) {
            num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            if (num % 2 == 0) {
                evenNums ++;
            } else {
                oddNums ++;
            }
            inputs ++;
            sum = sum + num;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + inputs);
        System.out.println("Average: " + ((float) sum / inputs));
        System.out.println("Even " + evenNums);
        System.out.println("Odd " + oddNums);
    }
}
