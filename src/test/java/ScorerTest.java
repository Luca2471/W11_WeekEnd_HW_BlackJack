import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScorerTest {

    private Player playerOne;
    private Player playerTwo;
    private Card cardOne;
    private Card cardTwo;

    @Before
    public void before() {
        playerOne = new Player();
        playerTwo = new Player();
        cardOne = new Card(SuitType.HEARTS, RankType.TWO);
        cardTwo = new Card(SuitType.HEARTS, RankType.TEN);
    }

    @Test
    public void canCompareCardsPlayerOneWins() {
        playerOne.addCard(cardTwo);
        playerTwo.addCard((cardOne));
        assertEquals("Player One Wins", Scorer.compareScores(playerOne, playerTwo));
    }

    @Test
    public void canCompareCardsPlayerTwoWins() {
        playerOne.addCard(cardOne);
        playerTwo.addCard((cardTwo));
        assertEquals("Player Two Wins", Scorer.compareScores(playerOne, playerTwo));
    }

    @Test
    public void canCompareCardsDraw() {
        playerOne.addCard(cardOne);
        playerTwo.addCard((cardOne));
        assertEquals("Draw", Scorer.compareScores(playerOne, playerTwo));
    }

}
