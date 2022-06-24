package org.example.poker.hand;

import org.example.poker.card.Card;
import org.example.poker.card.Value;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toSet;

public class Hand {
    private final Set<Card> cards;

    public Hand(Card card1, Card card2, Card card3, Card card4, Card card5) {
        this.cards = Arrays.stream(new Card[]{card1, card2, card3, card4, card5}).collect(toSet());
    }

    public Set<Card> getCards() {
        return this.cards.stream().collect(toSet());
    }

    @Override
    public String toString() {
        return this.cards.stream().map(Card::toString).collect(Collectors.joining(" ", "( ", " )"));
    }

    public List<Card> getCardsOrderedByScore() {
        return cards.stream().sorted(Card.comparator).unordered().collect(Collectors.toList());
    }

    public static Comparator<Hand> comparator = (hand1, hand2) -> {
        List<Card> cards1 = hand1.getCardsOrderedByScore();
        List<Card> cards2 = hand2.getCardsOrderedByScore();

        // TODO julien develop ici stp
        return higherCardComparator(cards1, cards2);
    };

    public static Integer higherCardComparator(List<Card> cards1, List<Card> cards2) {
        int bestCardOne = cards1.stream().map(Card::getValue).max(Value.comparator).get().score;
        int bestCardTwo = cards2.stream().map(Card::getValue).max(Value.comparator).get().score;

        return Integer.compare(bestCardOne, bestCardTwo);
    }

}
