import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    } 
    
    public void start() {
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        
        while (true) {
            System.out.println("First: " + firstContainer.toString());
            System.out.println("Second: " + secondContainer.toString());
                
            String input = this.scanner.nextLine();
            if (input.equals("quit")) {
                break;
            } 
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                firstContainer.add(amount);
            } else if (command.equals("move")) {
                if (firstContainer.contains() >= amount) {
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                } else {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(firstContainer.contains());
                }
            } else if (command.equals("remove")) {
                secondContainer.remove(amount);
            } else {
                System.out.println("Not a command!");
            }
        }
    }
}
