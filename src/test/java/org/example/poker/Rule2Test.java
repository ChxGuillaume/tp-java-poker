package org.example.poker;

import org.example.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule2Test {
    @Test
    public void equalHandBiggerCardShouldWin() {
        Hand handOne = HandUtils.hand("AC", "AP", "8T", "7C", "3P");
        Hand handTwo = HandUtils.hand("AT", "AK", "9C", "7P", "3C");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }
}
