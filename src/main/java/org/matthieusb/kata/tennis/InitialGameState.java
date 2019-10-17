package org.matthieusb.kata.tennis;

public class InitialGameState extends GameState {

    public InitialGameState() {
        super();
    }

    @Override
    GameState player1Scores() {
        return new NormalScoreGameState(new TennisGame(1, 0));
    }

    @Override
    GameState player2Scores() {
        return new NormalScoreGameState(new TennisGame(0, 1));
    }

    @Override
    String score() {
        return "LOVE - LOVE";
    }
}
