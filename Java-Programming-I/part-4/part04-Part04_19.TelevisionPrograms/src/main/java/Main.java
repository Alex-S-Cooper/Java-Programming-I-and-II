import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a TV show name: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            int duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name, duration));
        }
        System.out.println("Enter a max duration: ");
        int max = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program: programs) {
            if (program.getDuration() <= max) {
                System.out.println(program.toString());
            }
        }
    }
}
