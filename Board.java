import java.util.*;

public class Board {

    private Deck deck;
    private ArrayList<Card> cardsOnBoard;

    public Board() {
        deck = new Deck();
        deck.shuffle();
        cardsOnBoard = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            cardsOnBoard.add(deck.drawCard());
        }
    }

}
