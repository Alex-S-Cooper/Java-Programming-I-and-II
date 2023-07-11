
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String sentence = scanner.nextLine();
            String[] words = sentence.split(" ");
            if (sentence.equals("")) {
                break;
            }
            for (String word: words) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }


    }
}
