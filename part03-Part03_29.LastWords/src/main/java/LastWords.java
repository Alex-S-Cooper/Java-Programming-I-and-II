
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String sentence = scanner.nextLine();
            String[] words = sentence.split(" ");
            if (sentence.equals("")) {
                break;
            }
            System.out.println(words[words.length - 1]);
        }

    }
}
