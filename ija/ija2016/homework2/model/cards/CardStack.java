package ija.ija2016.homework2.model.cards;

import ija.ija2016.homework2.model.cards.Card;

public interface CardStack extends CardDeck{
    public boolean isEmpty();
    public boolean put(Card card);
    public int size();
    public CardStack pop(Card card);
    public Card get(int index);
    public int top();
//    public void my_put(Card card);
    public boolean put(CardStack stack);
}