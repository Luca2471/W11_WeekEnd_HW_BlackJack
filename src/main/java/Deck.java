import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int getNumberOfCards() {
        return this.cards.size();
    }

    public void populate() {
        for (SuitType suit : SuitType.values()){
            for (RankType rank: RankType.values()){
                this.cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffleCards() {
        Collections.shuffle(this.cards);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Card dealCard() {
        return this.cards.remove(0);
    }
}
