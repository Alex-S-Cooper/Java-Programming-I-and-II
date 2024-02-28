package application;
import java.util.Random;
public class TemperatureSensor implements Sensor {
    private boolean onOrOff;
    private Random random;

    public TemperatureSensor() {
        this.onOrOff = false;
        this.random = new Random();
    }

    public boolean isOn() {
        return this.onOrOff;
    }

    public void setOn() {
        this.onOrOff = true;
    }

    public void setOff() {
        this.onOrOff = false;
    }

    public int read() {
        if (this.onOrOff == true) {
            return random.nextInt(61) - 30;
        } else {
            throw new IllegalStateException("The sensor is off.");
        }
    }
}
