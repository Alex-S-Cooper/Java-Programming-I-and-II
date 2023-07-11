import java.util.Scanner;
public class InAHoleInTheGround {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int times = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i <= times; i++) {
            printText();
        }
    }
    
    public static void printText() {
        // Write some code in here
        System.out.println("In a hole in the ground there lived a method");
    }
}
