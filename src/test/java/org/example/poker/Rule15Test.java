package org.example.poker;

import org.example.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule15Test {
    @Test
    public void flushOnStraightWins() {
        Hand handOne = HandUtils.hand("AP", "10P", "7P", "6P", "2P");
        Hand handTwo = HandUtils.hand("3C", "4P", "5K", "6C", "7T");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }

    @Test
    public void FourOfKindOnFlushWins() {
        Hand handOne = HandUtils.hand("9C", "9P", "9K", "9T", "8T");
        Hand handTwo = HandUtils.hand("AP", "10P", "7P", "6P", "2P");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }
}

