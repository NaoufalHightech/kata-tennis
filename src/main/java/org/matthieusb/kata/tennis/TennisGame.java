package org.matthieusb.kata.tennis;


public class TennisGame {

    private Integer playerOneScore;
    private Integer playerTwoScore;

    public TennisGame() {
        this.playerOneScore = 0;
        this.playerTwoScore = 0;
    }

    public TennisGame(int score1, int score2) {
        this.playerOneScore = score1;
        this.playerTwoScore = score2;
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

    public Integer getPlayerOneScore() {
        return playerOneScore;
    }

    public Integer getPlayerTwoScore() {
        return playerTwoScore;
    }
}
