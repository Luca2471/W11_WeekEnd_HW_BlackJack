import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player() {
        this.hand = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public RankType getCarValue() {
        Card card = this.hand.get(0);
        return card.getValue();
    }
}
