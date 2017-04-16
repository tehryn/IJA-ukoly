package src.cardpack;
import src.cardpack.CardImp;
import src.cards.CardDeck;
import src.cards.CardStack;
import src.cards.Card;


public class CardDeckImp implements CardDeck {
    protected int size;
    protected Card[] deck;
    protected int top;
    private   Card.Color color;
    public CardDeckImp(int size) {
        this.size = size;
        this.deck = new Card[size];
        this.top  = -1;
    }

    public CardDeckImp(int size, Card.Color color) {
        this.size = size;
        this.deck = new Card[size];
        this.top  = -1;
        this.color = color;
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
        return this.top + 1;
    }

    public boolean put(Card card) {
        if (this.color != card.color()) {
            return false;
        }
        if (this.isEmpty() && card.value() != 1) {
            return false;
        }
        if (!this.isEmpty() && this.deck[this.top].compareValue(card) != -1) {
            return false;
        }
        if (this.top+1 < this.size) {
            this.deck[++this.top] = card;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean my_put(Card card) {
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
            return null;
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
        if (index < 0 || index > this.top) {
            return null;
        }
        else {
            return this.deck[index];
        }
    }

/*************************************************************************************/
    public static CardDeck createStandardDeck() {
        CardDeck deck = new CardDeckImp(52);
        for (int i = 1; i<=13; i++) {
            deck.my_put(new CardImp(Card.Color.CLUBS, i));
            deck.my_put(new CardImp(Card.Color.DIAMONDS, i));
            deck.my_put(new CardImp(Card.Color.HEARTS, i));
            deck.my_put(new CardImp(Card.Color.SPADES, i));
        }
        return deck;
    }
    public static CardDeck createColorDeck(Card.Color color) {
        CardDeck deck = new CardDeckImp(13, color);
        return deck;
    }
}