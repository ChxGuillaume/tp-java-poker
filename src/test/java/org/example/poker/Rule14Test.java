package org.example.poker;

import org.example.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule14Test {
    @Test
    public void straightOnThirdKindWins() {
        Hand handOne = HandUtils.hand("3C", "4P", "5K", "6C", "7T");
        Hand handTwo = HandUtils.hand("9T", "9K", "9K", "3T", "5C");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }

    @Test
    public void fourOfKindOnStraightWins() {
        Hand handOne = HandUtils.hand("9C", "9P", "9K", "9T", "8T");
        Hand handTwo = HandUtils.hand("3C", "4P", "5K", "6C", "7T");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }
}
