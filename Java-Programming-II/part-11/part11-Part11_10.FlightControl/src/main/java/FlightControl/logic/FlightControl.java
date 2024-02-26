package FlightControl.logic;
import java.util.ArrayList;
import java.util.HashMap;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;

public class FlightControl {
    private HashMap<String, Airplane> planes;
    private ArrayList<Flight> flights;
    
    public FlightControl() {
        this.planes = new HashMap<>();
        this.flights = new ArrayList<>();
    }
    
    public void addPlane(Airplane plane) {
        this.planes.putIfAbsent(plane.getId(), plane);
    }
    
    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }
    
    public void printPlanes() {
        for (Airplane plane: this.planes.values()) {
            System.out.println(plane.toString());
        }
    }
    
    public void printFlights() {
        for (Flight flight: this.flights) {
            System.out.println(flight.toString());
        }
    }
    
    public void printPlane(String planeId) {
        System.out.println(this.planes.get(planeId).toString());
    }
    
    public boolean planeExists(String planeId) {
        return this.planes.containsKey(planeId);
    }
    
    public Airplane getPlane(String planeId) {
        return this.planes.get(planeId);
    }
}
