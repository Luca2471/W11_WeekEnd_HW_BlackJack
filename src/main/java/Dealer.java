import java.util.ArrayList;

public class Dealer {

    private Deck deck;

    public Dealer() {
        this.deck = new Deck();
    }

    public ArrayList<Card> dealTwoCards() {
        this.deck.populate();
        this.deck.shuffleCards();
        Card firstCard = this.deck.dealCard();
        Card secondCard = this.deck.dealCard();
        ArrayList<Card> dealtCards = new ArrayList<Card>();
        dealtCards.add(firstCard);
        dealtCards.add(secondCard);
        return dealtCards;
    }



}
