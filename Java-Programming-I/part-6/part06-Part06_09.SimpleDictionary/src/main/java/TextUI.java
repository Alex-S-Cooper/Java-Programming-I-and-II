import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String input = scanner.next();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (input.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.next();
                System.out.println("Translation: ");
                String translation = scanner.next();
                this.dictionary.add(word, translation);
            }
            
            if (input.equals("search")) {
                System.out.println("To be translated: ");
                String wordToTranslate = scanner.next();
                if (this.dictionary.translate(wordToTranslate) == null) {
                    System.out.println("Word " + wordToTranslate + " was not found");
                } else {
                    System.out.println("Translation: " + this.dictionary.translate(wordToTranslate));
                }
            }
            System.out.println("Unknown command");
        }
    }
}
