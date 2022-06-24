package org.example.poker;

import org.example.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule16Test {
    @Test
    public void bestFlushWins() {
        Hand handOne = HandUtils.hand("AP", "10P", "7P", "6P", "2P");
        Hand handTwo = HandUtils.hand("KK", "JK", "9K", "5K", "3K");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }
}
