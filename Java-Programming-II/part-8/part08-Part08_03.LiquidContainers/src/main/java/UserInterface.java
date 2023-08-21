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
            if (amount < 0) {
                continue;
            }
            
            if (command.equals("add")) {
                firstContainer.addAmount(amount);
            } else if (command.equals("move")) {
                if (firstContainer.getAmount() >= amount) {
                    firstContainer.removeAmount(amount);
                    secondContainer.addAmount(amount);
                } else {
                    secondContainer.addAmount(firstContainer.getAmount());
                    firstContainer.removeAmount(firstContainer.getAmount());
                }
            } else if (command.equals("remove")) {
                secondContainer.removeAmount(amount);
            } else {
                System.out.println("Not a command!");
            }
        }
    }
}
