package ija.ija2016.homework2.cardpack;
import ija.ija2016.homework2.cardpack.CardImp;
import ija.ija2016.homework2.model.cards.CardDeck;
import ija.ija2016.homework2.model.cards.CardStack;
import ija.ija2016.homework2.model.cards.Card;


public class CardDeckImp implements CardDeck {
    protected int size;
    protected Card[] deck;
    protected int top;
    public CardDeckImp(int size) {
        this.size = size;
        this.deck = new Card[size];
        this.top  = -1;
    }

    public boolean isEmpty() {
        if (this.top == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public int size() {
        return this.size;
    }

    public boolean put(Card card) {
        if (this.top+1 < this.size) {
            this.deck[++this.top] = card;
            return true;
        }
        else {
            return false;
        }
    }

    public Card pop() {
        if (this.top <= -1) {
            Card err = new CardImp(Card.Color.CLUBS, -1);
            return err;
        }
        else {
            return this.deck[this.top--];
        }
    }

    public Card get() {
        if (this.top <= -1) {
            return null;
        }
        else {
            return this.deck[this.top];
        }
    }

    public Card get(int index) {
        if (index < 0 || index >= this.top) {
            return null;
        }
        else {
            return this.deck[this.top-1];
        }
    }

/*************************************************************************************/
    public static CardDeckImp createStandardDeck() {
        CardDeckImp deck = new CardDeckImp(52);
        for (int i = 1; i<=13; i++) {
            deck.put(new CardImp(Card.Color.CLUBS, i));
            deck.put(new CardImp(Card.Color.DIAMONDS, i));
            deck.put(new CardImp(Card.Color.HEARTS, i));
            deck.put(new CardImp(Card.Color.SPADES, i));
        }
        return deck;
    }
}