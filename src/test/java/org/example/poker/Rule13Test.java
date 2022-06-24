package org.example.poker;

import org.example.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule13Test {
    @Test
    public void BestFourOfKindWins() {
        Hand handOne = HandUtils.hand("9C", "9P", "9K", "9C", "8T");
        Hand handTwo = HandUtils.hand("7T", "7K", "7P", "7C", "5C");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }
}
