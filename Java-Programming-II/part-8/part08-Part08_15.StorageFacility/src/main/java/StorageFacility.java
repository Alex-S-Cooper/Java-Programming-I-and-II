import java.util.ArrayList;
import java.util.HashMap;
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageUnits;
    
    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storageUnits.putIfAbsent(unit, new ArrayList<>());
        this.storageUnits.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> contents = this.storageUnits.get(storageUnit);
        if (contents == null) {
            return new ArrayList<>();
        }
        return contents;
    }
    
    public void remove(String storageUnit, String item) {
        this.storageUnits.get(storageUnit).remove(item);
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit: this.storageUnits.keySet()) {
            if (!this.storageUnits.get(unit).isEmpty()) {
                units.add(unit);
            }
        }
        return units;
    }
}
