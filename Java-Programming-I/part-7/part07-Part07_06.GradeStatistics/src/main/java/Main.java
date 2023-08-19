
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberSet numberSet = new NumberSet();
        UserInterface userInterface = new UserInterface(scanner, numberSet);
        userInterface.start();
    }
}
        
  
    

