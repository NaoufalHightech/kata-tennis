package org.matthieusb.kata.tennis;

public class NormalScoreGameState extends GameState {

    public NormalScoreGameState(TennisGame givenTennisGame) {
        tennisGame = givenTennisGame;
    }

    @Override
    GameState player1Scores() {
        return new NormalScoreGameState(new TennisGame(tennisGame.getPlayerOneScore() + 1, tennisGame.getPlayerTwoScore()));
    }

    @Override
    GameState player2Scores() {
        return new NormalScoreGameState(new TennisGame(tennisGame.getPlayerOneScore(), tennisGame.getPlayerTwoScore() + 1));
    }

    @Override
    String score() {
        if (tennisGame.getPlayerOneScore() == 1) {
            if (tennisGame.getPlayerTwoScore() == 1) {
                return "FIFTEEN - FIFTEEN";
            } else {
                return "FIFTEEN - LOVE";
            }
        } else {
            if (tennisGame.getPlayerTwoScore() == 1) {
                return "LOVE - FIFTEEN";
            }
        }
        return null;
    }
}
