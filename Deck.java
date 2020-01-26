import java.util.*;

/**
 * Represents a virtual Deck of cards
 *
 * @author Jeff Manning
 * @version 1.0
 */
public class Deck
{
    public final int SUIT_SIZE = 13;
    public final int SUIT_NUMBER = 4;
    public final int NUMBER_OF_DECKS = 1;
    private ArrayList<Card> deck;
    private ListIterator<Card> deckIterator;
 
    public Deck() {
        deck = new ArrayList<Card>();
        
        for(int a = 0;a < this.NUMBER_OF_DECKS;a++) {
            for(int suit = 1;suit <= this.SUIT_NUMBER;suit++) {
                for(int value = 1;value <= this.SUIT_SIZE;value++) {
                    Card card = new Card(suit, value);
                    this.deck.add(card);
                }
            }
        }
        
        Collections.shuffle(deck);
        deckIterator = deck.listIterator();
    }
    
    public Card draw() {
        //pull out one card from the deck
        if(deckIterator.hasNext()) {
            return deckIterator.next();
        }
        else {
            return new Card(1,1);
        }
    }
    
    
}
