package org.example.poker;

import org.example.poker.card.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompareCards {
    @Test
    public void biggerCardWins() {
        Card cardOne = Card.fromString("AC");
        Card cardTwo = Card.fromString("4P");

        Assertions.assertTrue(Card.comparator.compare(cardOne, cardTwo) > 0);
    }

    @Test
    public void lowerCardLose() {
        Card cardOne = Card.fromString("5C");
        Card cardTwo = Card.fromString("AP");

        Assertions.assertTrue(Card.comparator.compare(cardOne, cardTwo) < 0);
    }

    @Test
    public void cardEquals() {
        Card cardOne = Card.fromString("AC");
        Card cardTwo = Card.fromString("AP");

        Assertions.assertEquals(0, Card.comparator.compare(cardOne, cardTwo));
    }
}
