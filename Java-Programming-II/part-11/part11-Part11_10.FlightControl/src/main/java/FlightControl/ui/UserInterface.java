package FlightControl.ui;
import FlightControl.logic.FlightControl;
import java.util.Scanner;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;

public class UserInterface {
    private Scanner scanner;
    private FlightControl flightControl;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.flightControl = new FlightControl();
    }
    
    public void start() {
        this.assetControl();
        this.flightControl();
    }
    
    public void assetControl() {
        System.out.println("Airport Asset Control");
        
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.println(">");
            String input = scanner.next();
            if (input.equals("1")) {
                this.addPlane();
            } else if (input.equals("2")) {
                this.addFlight();
            } else if (input.equals("x")) {
                break;
            }
        }
    }
    
    public void flightControl() {
        System.out.println("Flight Control");
        
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.println(">");
            String input = scanner.next();
            if (input.equals("1")) {
                this.flightControl.printPlanes();
            } else if (input.equals("2")) {
                this.flightControl.printFlights();
            } else if (input.equals("3")) {
                System.out.println("Give the airplane id: ");
                String planeId = scanner.next();
                this.flightControl.printPlane(planeId);
            } else if (input.equals("x")) {
                break;
            }
        }
    }
    
    public void addPlane() {
        System.out.println("Give the airplane id: ");
        String id = scanner.next();
        System.out.println("Give the airplane capacity: ");
        String capacity = scanner.next();
        this.flightControl.addPlane(new Airplane(id, capacity));
    }
    
    public void addFlight() {
        System.out.println("Give the airplane id: ");
        String planeId = scanner.next();
        if (!this.flightControl.planeExists(planeId)) {
            System.out.println("Plane does not exist, please add the plane first");
            return;
        }
        System.out.println("Give the departure airport id: ");
        String departureId = scanner.next();
        System.out.println("Give the target airport id: ");
        String targetId = scanner.next();  
        this.flightControl.addFlight(new Flight(this.flightControl.getPlane(planeId), departureId, targetId));
    } 
}
