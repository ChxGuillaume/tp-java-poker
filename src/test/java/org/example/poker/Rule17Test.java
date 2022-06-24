package org.example.poker;

import org.example.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule17Test {
    @Test
    public void FullOnFlushWins() {
        Hand handOne = HandUtils.hand("AP", "AK", "AC", "10P", "10C");
        Hand handTwo = HandUtils.hand("AP", "10P", "7P", "6P", "2P");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }

    @Test
    public void FourOfKindOnFullWins() {
        Hand handOne = HandUtils.hand("9C", "9P", "9K", "9T", "8T");
        Hand handTwo = HandUtils.hand("AP", "AK", "AC", "10P", "10C");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }
}
