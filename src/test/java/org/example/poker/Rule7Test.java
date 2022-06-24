package org.example.poker;

import org.example.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule7Test {
    @Test
    public void bestDoublePairsWins() {
        Hand handOne = HandUtils.hand("9C", "9P", "8T", "8C", "3P");
        Hand handTwo = HandUtils.hand("3T", "3K", "7K", "7T", "5C");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }
}
