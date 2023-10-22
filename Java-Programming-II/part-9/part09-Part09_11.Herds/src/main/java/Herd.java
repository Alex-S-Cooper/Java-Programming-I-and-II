import java.util.ArrayList;
public class Herd implements Movable {
    private ArrayList<Movable> movables;
    
    public Herd() {
        this.movables = new ArrayList<>();
    }
    
    public String toString() {
        String movablesList = "";
        for (Movable movable: this.movables) {
            movablesList += movable.toString() + "\n";
        }
        return movablesList;
    }
    
    public void addToHerd( Movable movable) {
        this.movables.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable movable: this.movables) {
            movable.move(dx, dy);
        }
    }
}
