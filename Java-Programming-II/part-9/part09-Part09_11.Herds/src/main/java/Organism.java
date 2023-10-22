public class Organism implements Movable {
    private int xPosition;
    private int yPosition;
    
    public Organism(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }
    
    public String toString() {
        return "x: " + this.xPosition + "; y: " + this.yPosition; 
    }
    
    public void move(int dx, int dy) {
        this.xPosition += dx;
        this.yPosition += dy;
    }
    
}
