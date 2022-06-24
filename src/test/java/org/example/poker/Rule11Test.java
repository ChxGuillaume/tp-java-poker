package org.example.poker;

import org.example.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule11Test {
    @Test
    public void bestThreeOfKindsWins() {
        Hand handOne = HandUtils.hand("9C", "9P", "9K", "8C", "7T");
        Hand handTwo = HandUtils.hand("3T", "3K", "3K", "9T", "5C");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }
}
