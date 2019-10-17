package org.matthieusb.kata.tennis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TennisGameTest {
    private GameState gameState;

    @BeforeEach
    void setUp() {
        gameState = new InitialGameState();
    }

    @Test
    void should_display_score_as_love_love_at_the_beginning() {
        assertThat(gameState.score()).isEqualTo("LOVE - LOVE");
    }

    @Test
    void should_display_15_love_when_player_one_has_scored() {
        assertThat(gameState.player1Scores().score()).isEqualTo("FIFTEEN - LOVE");
    }

    @Test
    void should_display_love_15_when_player_two_has_scored() {
        assertThat(gameState.player2Scores().score()).isEqualTo("LOVE - FIFTEEN");
    }

    @Test
    void should_display_fifteen_fifteen_when_both_players_scored_once() {
        assertThat(gameState.player1Scores().player2Scores().score()).isEqualTo("FIFTEEN - FIFTEEN");
    }
}
