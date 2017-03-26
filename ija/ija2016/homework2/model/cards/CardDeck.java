package ija.ija2016.homework2.model.cards;

import ija.ija2016.homework2.model.cards.Card;

public interface CardDeck {
    boolean isEmpty();
    int size();
    boolean put(Card card);
    Card pop();
    Card get();
    Card get(int index);
}