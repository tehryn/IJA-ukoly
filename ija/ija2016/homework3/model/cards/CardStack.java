package ija.ija2016.homework3.model.cards;

import ija.ija2016.homework3.model.cards.Card;

public interface CardStack extends CardDeck{

    /**
     * Tests if CardStack s empty.
     * @return True of stack is empty,
     */
    public boolean isEmpty();

    /**
     * Puts card into stack.
     * @param  Card card          Card that will be added
     * @return      True of card was added.
     */
    public boolean put(Card card);

    /**
     * Returns size of stack
     * @return size of stack
     */
    public int size();

    /**
     * Pops all cards until specific card was reached. If card is not in stack, no card will be popped
     * @param  Card card          Card that will be on bottom of new stack.
     * @return      New stack of popped cards.
     */
    public CardStack pop(Card card);

    /**
     * [get description]
     * @param  int index         [description]
     * @return     [description]
     */
    public Card get(int index);

    /**
     * Puts stack of card into stack.
     * @param  CardStack stack         Stack that will be added.
     * @return           True if stack was added, otherwise false.
     */
    public boolean put(CardStack stack);
}