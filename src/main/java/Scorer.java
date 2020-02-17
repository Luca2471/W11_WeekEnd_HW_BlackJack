public class Scorer {

    public static String compareScores(Player playerOne, Player playerTwo) {
        int playerOneScore = playerOne.getCardValue();
        int playerTwoScore = playerTwo.getCardValue();
        if (playerOneScore > playerTwoScore) {
            return "Player One Wins";
        }
        else if (playerTwoScore > playerOneScore) {
            return "Player Two Wins";
        }
        else {
            return "Draw";
        }
    }

}
