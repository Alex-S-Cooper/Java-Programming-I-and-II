package application;

public class StandardSensor implements Sensor {
    private int num;
    
    public StandardSensor(int num) {
        this.num = num;
    }
    
    public boolean isOn() {
        return true;
    }
    
    public void setOn() {
        return;
    }   
    
    public void setOff() {
        return;
    }   
    
    public int read() {
        return this.num;
    }
}
