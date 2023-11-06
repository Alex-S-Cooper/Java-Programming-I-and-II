
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (Integer.valueOf(input) < 0) {
                break;
            }
            numbers.add(input);
        }
        
        numbers.stream()
            .mapToInt(num -> Integer.valueOf(num))
            .filter(num -> num < 6)
            .forEach(num -> System.out.println(num));
    }
}
