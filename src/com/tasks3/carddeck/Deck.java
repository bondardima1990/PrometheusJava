package com.tasks3.carddeck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {

    private final int suitSize = Suit.values.length;
    private final int rankSize = Rank.values.length;

    private ArrayList<Card> cards = new ArrayList<>();

    private int counter = suitSize * rankSize - 1;


    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void order() {

        /*Collections.sort(cards, (card1, card2) -> {

            int t =  Integer.compare(Arrays.asList(Suit.values).indexOf(card1.getSuit()),
                                        Arrays.asList(Suit.values).indexOf(card2.getSuit()));

            if (t != 0)
                return t;

            return Integer.compare(Arrays.asList(Rank.values).indexOf(card1.getRank()),
                                        Arrays.asList(Rank.values).indexOf(card2.getRank()));
        });*/


        cards.clear();
        for (int i = 0; i < suitSize; i++) {
            for (int j = 0; j < rankSize; j++) {
                cards.add(new Card(Rank.values[j], Suit.values[i]));
            }
        }
    }

    public boolean hasNext() {
        return cards.size() > 0;
    }

    public Card drawOne() {
        if (hasNext()){
            Card lastCard = cards.get(counter);
            cards.remove(counter);
            counter--;
            return lastCard;
        }
        return null;
    }
}