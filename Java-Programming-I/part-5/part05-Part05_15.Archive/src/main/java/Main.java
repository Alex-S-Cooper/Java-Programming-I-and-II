
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        while (true ) {
            System.out.println("Identifier? (empty will stop)");
            String input = scanner.nextLine();
            if (input.isEmpty()) 
                break;
            String id = input;
            System.out.println("Name? (empty will stop)");
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String name = input;
            Archive archive = new Archive(id, name);
            if (!archives.contains(archive))
                archives.add(archive);
        }
        System.out.println("==Items==");
        for (Archive archive: archives) {
            System.out.println(archive.toString());
        }

    }
}
