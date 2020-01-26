/**
 * Creates a virtual instance of a card
 *
 * @author Jeff Manning
 * @version 1.0
 */
public class Card {
   private int suit;
   private int value;
   
   public final int DIAMOND = 1;
   public final int HEART   = 2;
   public final int SPADE   = 3;
   public final int CLUB    = 4;
   
   public Card(int suit, int value) {
       this.suit = suit;
       this.value = value;
   }
   
   public int getSuit() {
       return this.suit;
   }
   
   public String getSuitName() {
       if(this.suit == this.DIAMOND) {
           return "Diamond";
       }
       else if(this.suit == this.HEART) {
           return "Heart";
       }
       else if(this.suit == this.SPADE) {
           return "Spade";
       }
       else {
           return "Club";
       }
   }
   
   public int getValue() {
       return this.value;
   }
   
   public String getValueName() {
       if(this.value == 1) {
           return "Ace";
       }
       else if(this.value == 11) {
           return "Jack";
       }
       else if(this.value == 12) {
           return "Queen";
       }
       else if(this.value == 13) {
           return "King";
       }
       else {
           return Integer.toString(this.value);
       }
   }
}
