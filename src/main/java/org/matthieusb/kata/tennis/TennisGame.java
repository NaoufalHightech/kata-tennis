package org.matthieusb.kata.tennis;


public class TennisGame {

    private Integer playerOneScore;
    private Integer playerTwoScore;

    public TennisGame() {
        this.playerOneScore = 0;
        this.playerTwoScore = 0;
    }

    public String score() {
        if (this.playerOneScore == 1 && this.playerTwoScore == 1) {
            return "FIFTEEN - FIFTEEN";
        }

        if (this.playerOneScore == 1) {
            return "FIFTEEN - LOVE";
        }

        if (this.playerTwoScore == 1) {
            return "LOVE - FIFTEEN";
        }

        return "LOVE - LOVE";
    }

    public void playerOneScores() {
        this.playerOneScore++;
    }

    public void playerTwoScores() {
        this.playerTwoScore++;
    }
}
