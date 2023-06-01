
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String sentence = scanner.nextLine();
            String[] words = sentence.split(" ");
            if (sentence.equals("")) {
                break;
            }
            for (String word: words) {
                System.out.println(word);
            }
        }
            

    }
}
