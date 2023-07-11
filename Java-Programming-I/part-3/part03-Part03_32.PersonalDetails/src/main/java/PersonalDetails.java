
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nameLength = 0;
        String longestName = "";
        int yearSum = 0;
        int yearInputs = 0;
             
        while (true) {
            String input = scanner.nextLine();
            String[] parts = input.split(",");
            if (input.equals("")) {
                break;
            }
            String name = parts[0];
            int dateOfBirth = Integer.valueOf(parts[1]);
            if (name.length() > nameLength) {
                nameLength = name.length();
                longestName = name;
            }
            yearSum += dateOfBirth;
            yearInputs++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Aver of the birth years: " + 1.0 * yearSum / yearInputs);
    }
}
