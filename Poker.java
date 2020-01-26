
/**
 * Write a description of class Poker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class Poker {
    
    public Poker() {
        Deck deck = new Deck();
        
        //draw 5 hands
        for(int a = 1;a <= 5;a++) {
            for(int b = 1;b <= 5;b++) {
                Card card = deck.draw();
                System.out.println("Hand " + a + " Card " + b + ": "
                                    + card.getValueName() + " of " + card.getSuitName());
            }
        }
    }
    
    public static void main(String args[]) {
        Poker game = new Poker();
    }
}