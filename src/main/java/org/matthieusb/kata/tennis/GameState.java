package org.matthieusb.kata.tennis;

public abstract class GameState {
    protected TennisGame tennisGame;

    public GameState() {
        this.tennisGame = new TennisGame();
    }

    public GameState(TennisGame tennisGame) {
        this.tennisGame = tennisGame;
    }

    abstract GameState player1Scores();
    abstract GameState player2Scores();

    abstract String score();
}
