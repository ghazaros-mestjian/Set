import java.util.*;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Card.COLOR color : Card.COLOR.values()) {
            for (Card.SHAPE shape : Card.SHAPE.values()) {
                for (Card.COUNT count : Card.COUNT.values()) {
                    for (Card.SHADING shading : Card.SHADING.values()) {
                        cards.add(new Card(color, shape, count, shading));
                    }
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(cards.size() - 1);
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.drawCard());
        }
    }
}
