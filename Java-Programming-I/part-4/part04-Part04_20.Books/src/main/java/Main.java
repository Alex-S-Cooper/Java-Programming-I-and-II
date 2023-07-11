import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Enter a title: ");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.println("Enter the number of pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter the publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, pages, pubYear));
        }
        System.out.println("What information do you want?");
        String info = scanner.nextLine();
        for (Book book: books) {
            if(info.equals("everything")) {
                System.out.println("Title: " + book.toString());
            } else if (info.equals("name")) {
                System.out.println("Title: " + book.getTitle());
            } else {
                break;
            }
        }
    }
}
