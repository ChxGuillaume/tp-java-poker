package org.example.poker;

import org.example.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule9Test {
    @Test
    public void BestLastCardWins() {
        Hand handOne = HandUtils.hand("9C", "9P", "8T", "8C", "7P");
        Hand handTwo = HandUtils.hand("8T", "8K", "9K", "9T", "5C");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }
}
