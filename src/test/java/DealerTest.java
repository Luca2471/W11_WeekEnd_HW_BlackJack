import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;

    @Before
    public void before() {
        dealer = new Dealer();
    }

    @Test
    public void canDealTwoCards() {
        ArrayList<Card> dealtCards = dealer.dealTwoCards();
        assertEquals(2, dealtCards.size());
    }



}
