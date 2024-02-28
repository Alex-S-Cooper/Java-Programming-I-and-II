package application;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> reads;
    
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.reads = new ArrayList<>();
    }

    public boolean isOn() {
        boolean allOn = true;
        for (Sensor sensor: this.sensors) {
            if (sensor.isOn() == false) {
                allOn = false;
            }
        }
        
        if (allOn == false) {
            return false;
        } else {
            return true;
        }
    }

    public void setOn() {
        for (Sensor sensor: this.sensors) {
            sensor.setOn();
        }
    }

    public void setOff() {
        for (Sensor sensor: this.sensors) {
            sensor.setOff();
        }
    }

    public int read() {
        if (this.isOn() == false || this.sensors.isEmpty()) {
            throw new IllegalStateException("The sensor should be on and the list of sensors should not be empty.");
        }
        ArrayList<Integer> reads = new ArrayList<>();
        for (Sensor sensor: this.sensors) {
            reads.add(sensor.read());
        }
        double average = reads.stream()
                .mapToDouble(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        
        this.reads.add((int) average);
        return (int) average;
        
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.reads;
    }
}
