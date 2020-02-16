public class Runner {

    public static void main(String[] args) {

        Deck deck = new Deck();

        deck.populate();

        System.out.println(deck.getCards());

        deck.shuffleCards();

        System.out.println(deck.getCards());

    }

}
