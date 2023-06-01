
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        while (true) {
            String input = scanner.nextLine();
            String[] parts = input.split(",");
            if (input.equals("")) {
                break;
            }
            int age = Integer.valueOf(parts[1]);
            if (age > oldest) {
                oldest = age;
                oldestName = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
