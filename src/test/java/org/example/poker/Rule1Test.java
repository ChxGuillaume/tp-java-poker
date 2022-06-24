package org.example.poker;

import org.example.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule1Test {
    @Test
    public void biggerHandShouldWin() {
        Hand handOne = HandUtils.hand("AC", "4P", "8P", "DC", "RP");
        Hand handTwo = HandUtils.hand("2C", "4K", "8T", "DT", "VC");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }
}
