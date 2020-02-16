public class Scorer {

    public static String compareScores(Player playerOne, Player playerTwo) {
        int playerOneScore = playerOne.getCardRank().ordinal();
        int playerTwoScore = playerTwo.getCardRank().ordinal();
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
