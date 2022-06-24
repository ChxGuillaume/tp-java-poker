package org.example.poker;

import org.example.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule18Test {
    @Test
    public void bestFullWins() {
        Hand handOne = HandUtils.hand("AP", "AK", "AC", "10P", "10C");
        Hand handTwo = HandUtils.hand("9P", "9K", "9C", "AP", "AC");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }
}
