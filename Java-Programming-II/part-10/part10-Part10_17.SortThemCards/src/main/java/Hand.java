import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private List<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        this.hand.stream().forEach(card -> System.out.println(card.toString()));
    } 
    
    public void sort() {
        Collections.sort(this.hand);
    }
    
    public int compareTo(Hand comparedHand) {
        int totalValue = this.hand.stream().mapToInt(card -> card.getValue()).sum();
        int comparedValue = comparedHand.hand.stream().mapToInt(card -> card.getValue()).sum();
        return totalValue - comparedValue;
    }
    
    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
        this.hand.stream().forEach(card -> System.out.println(card.toString()));
    }
}
