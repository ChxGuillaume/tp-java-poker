package org.example.poker;

import org.example.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule10Test {
    @Test
    public void ThirdOfKindOnDoublePairsWins() {
        Hand handOne = HandUtils.hand("9C", "9P", "9K", "7C", "8T");
        Hand handTwo = HandUtils.hand("3T", "3K", "9K", "9T", "5C");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }
}
