
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int numbersToPrint = Integer.parseInt(scanner.nextLine());
        randomNumberList(numbersToPrint);
    }

    public static void randomNumberList(int numberOfNumbers) {
        Random random = new Random();
        for (int i = 0; i < numberOfNumbers; i++) {
            int randomNum = random.nextInt(11);
            System.out.println(randomNum);
        }
    }


}
