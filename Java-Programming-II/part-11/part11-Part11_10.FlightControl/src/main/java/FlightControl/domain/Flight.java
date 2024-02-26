
package FlightControl.domain;

public class Flight {
    private Airplane plane;
    private String departureId;
    private String targetId;
    
    public Flight(Airplane plane, String departureId, String targetId) {
        this.plane = plane;
        this.departureId = departureId;
        this.targetId = targetId;
    }
    
    public String toString() {
        return this.plane.toString() + " (" + this.departureId + "-" + this.targetId + ")";
    }
}
