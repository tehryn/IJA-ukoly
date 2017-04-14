package ija.ija2016.homework3.model.cards;

import ija.ija2016.homework3.model.cards.Card;

/**
 * Object representing deck of cards.
 */
public interface CardDeck {
    /**
     * Tests if card deck is empty
     * @return True of card deck is empty, otherwise false
     */
    boolean isEmpty();

    /**
     * Retrieve size of card deck.
     * @return size of card deck
     */
    int size();

    /**
     * Puts card into card deck
     * @param  card Card that will be added
     * @return      True if card was added, othewise false
     */
    boolean put(Card card);

    /**
     * Puts card into stack without checking colors and values
     * @param  card Card that will be added
     * @return      True on succes, false on error
     */
    boolean my_put(Card card);

    /**
     * Pops card from deck.
     * @return Card on the top of card deck
     */
    Card pop();

    /**
     * Retrieve card from top of deck.
     * @return Card on top
     */
    Card get();

    /**
     * Retrieve specific card from deck
     * @param  index index where card is.
     * @return       Card on specific index.
     */
    Card get(int index);
}