package org.example.poker.card;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class Card {
    public final Value value;
    public final Suit suit;

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "[" + this.value.toString() + this.suit.toString() + "]";
    }

    public Value getValue() {
        return this.value;
    }

    public static Card fromString(String string) {
        return new Card(
                Value.fromString(string.substring(0, 1)),
                Suit.valueOf(string.substring(1))
        );
    }

    public static Comparator<Card> comparator = comparing(card -> card.value, Value.comparator);
}
