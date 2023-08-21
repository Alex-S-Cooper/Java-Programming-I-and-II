import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }
    
    public void start() {
        System.out.println("Commands: ");
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program");
        
        while (true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            
            if (command.equalsIgnoreCase("add")) {
                this.addBird();
            } else if (command.equalsIgnoreCase("observation")) {
                this.addObservation();
            } else if (command.equalsIgnoreCase("all")) {
                this.printAllBirds();
            } else if (command.equalsIgnoreCase("one")) {
                printBird();
            } else if (command.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println("Not a command!");
            }
            
            System.out.println("");
        }
        
        
    }
    
    public void addBird() {
        System.out.println("Name: ");
        String name = this.scanner.nextLine();
        System.out.println("Name in Latin: ");
        String latinName = this.scanner.nextLine();
        this.birds.add(new Bird(name, latinName));
    }
    
    public void addObservation() {
        System.out.println("Bird?");
        String birdName = this.scanner.nextLine();
        for (Bird bird: this.birds) {
            if (bird.getName().equalsIgnoreCase(birdName)) {
                bird.addObservation();
            } else {
                System.out.println("Not a bird!");
            }
        }
    }
    
    public void printAllBirds() {
        for (Bird bird: this.birds) {
            System.out.println(bird.toString());
        }
    }
    
    public void printBird() {
        String birdName = this.scanner.nextLine();
        for (Bird bird: birds) {
            if (bird.getName().equalsIgnoreCase(birdName)) {
                System.out.println(bird.toString());
            }
        }
    }
}
