package FlightControl.domain;


public class Airplane {
    private String id;
    private String capacity;
    
    public Airplane (String id, String capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String toString() {
        return this.id + " (" + this.capacity + " capacity)"; 
    }
}
