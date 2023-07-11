
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int getSquares() {
        return this.squares;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        } else {
            return false;
        }
    }
    public int getPrice() {
        return this.squares * this.princePerSquare;
    }
    
    public int priceDifference(Apartment compared) {
        if (this.getPrice() > compared.getPrice()) {
            return this.getPrice() - compared.getPrice();
        } else {
            return compared.getPrice() - this.getPrice();
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.getPrice() > compared.getPrice()) {
            return true;
        } else {
            return false;
        }
    }
}
