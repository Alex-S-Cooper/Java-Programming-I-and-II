import java.util.HashMap;
import java.util.ArrayList;
public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.get(licensePlate) == null) {
            this.registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate licensePlate: this.registry.keySet()) {
            System.out.println(licensePlate.toString());
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner: this.registry.values()) {
            if (!owners.contains(owner)) {
                System.out.println(owner);
                owners.add(owner);
            }
        }
    }
}
