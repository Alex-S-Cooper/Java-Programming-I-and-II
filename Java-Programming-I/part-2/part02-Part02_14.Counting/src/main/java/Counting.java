
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endInput = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < endInput + 1; i++) {
            System.out.println(i);
        }
    }
}
