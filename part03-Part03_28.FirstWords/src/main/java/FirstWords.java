
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String sentence = scanner.nextLine();
            String[] words = sentence.split(" ");
            if (sentence.equals("")) {
                break;
            }
            System.out.println(words[0]);
        }

    }
}
