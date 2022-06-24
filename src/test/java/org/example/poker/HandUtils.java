package org.example.poker;

import org.example.poker.card.Card;
import org.example.poker.hand.Hand;

public class HandUtils {
    public static Hand hand(String card1, String card2, String card3, String card4, String card5) {
        return new Hand(
                Card.fromString(card1),
                Card.fromString(card2),
                Card.fromString(card3),
                Card.fromString(card4),
                Card.fromString(card5)
        );
    }
}
