package org.matthieusb.kata.tennis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TennisGameTest {

    private TennisGame tennisGame;

    @BeforeEach
    void setUp() {
        tennisGame = new TennisGame();
    }

    @Test
    void should_display_score_as_love_love_at_the_beginning() {
        assertThat(tennisGame.score()).isEqualTo("LOVE - LOVE");
    }

    @Test
    void should_display_15_love_when_player_one_has_scored() {
        tennisGame.playerOneScores();
        assertThat(tennisGame.score()).isEqualTo("FIFTEEN - LOVE");
    }

    @Test
    void should_display_love_15_when_player_two_has_scored() {
        tennisGame.playerTwoScores();
        assertThat(tennisGame.score()).isEqualTo("LOVE - FIFTEEN");
    }

    @Test
    void should_display_fifteen_fifteen_when_both_players_scored_once() {
        tennisGame.playerOneScores();
        tennisGame.playerTwoScores();
        assertThat(tennisGame.score()).isEqualTo("FIFTEEN - FIFTEEN");
    }
}
