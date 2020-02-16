import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void cardsStartEmpty() {
        assertEquals(0, deck.getNumberOfCards());
    }

    @Test
    public void canPopulateDeck() {
        deck.populate();
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test
    public void canDealCard() {
        deck.populate();
        deck.shuffleCards();;
        deck.dealCard();
        assertEquals(51, deck.getNumberOfCards());
    }

}
