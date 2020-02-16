import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card;

    @Before
    public void setUp() throws Exception {
        player = new Player();
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void canGetRankOfCard() {
        player.addCard(card);
        assertEquals(RankType.ACE, player.getCardRank());
    }

}
