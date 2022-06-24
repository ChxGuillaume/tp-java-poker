package org.example.poker;

import org.example.poker.card.Card;
import org.example.poker.hand.Hand;

public class App {
    public static void main(String[] args) {
        Hand hand = new Hand(
                Card.fromString(args[0]),
                Card.fromString(args[1]),
                Card.fromString(args[2]),
                Card.fromString(args[3]),
                Card.fromString(args[4])
        );
        System.out.println(hand);
    }

    public static Winner winner(Hand hand1, Hand hand2) {
        int winner = Hand.comparator.compare(hand1, hand2);

        if (winner > 0) {
            return Winner.Hand1;
        } else if (winner < 0) {
            return Winner.Hand2;
        }

        return Winner.Tie;
    }
}

enum Winner { Hand1, Hand2, Tie }
