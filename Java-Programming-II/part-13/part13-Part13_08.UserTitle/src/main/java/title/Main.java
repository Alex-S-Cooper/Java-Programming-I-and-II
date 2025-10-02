package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What should I make the title of the application?");
        String input = scanner.nextLine();


        Application.launch(UserTitle.class, "--input=" + input);

    }
}
