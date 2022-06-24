package org.example.poker;

import org.example.poker.hand.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Rule12Test {
    @Test
    public void FourOfKindOnThreeOfKindsWins() {
        Hand handOne = HandUtils.hand("9C", "9P", "9K", "9T", "8T");
        Hand handTwo = HandUtils.hand("3T", "3K", "AK", "AT", "5C");

        Assertions.assertEquals(Winner.Hand1, App.winner(handOne, handTwo));
    }
}
