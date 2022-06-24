package org.example.poker;

import org.example.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule4Test {
    @Test
    public void pairWins() {
        Hand handOne = HandUtils.hand("9C", "9P", "8T", "7C", "3P");
        Hand handTwo = HandUtils.hand("3T", "8K", "8C", "9T", "5C");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }
}
