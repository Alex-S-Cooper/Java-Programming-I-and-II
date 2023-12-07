import java.util.Comparator;
public class BySuitInValueOrder implements Comparator<Card> {
    
    public int compare(Card c1, Card c2) {
        int suitComparison = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if (!(suitComparison == 0)) {
            return suitComparison;
        } else {
            return c1.compareTo(c2);
        }
    }
}
