package ija.ija2016.homework2.cardpack;
import ija.ija2016.homework2.cardpack.CardImp;
import ija.ija2016.homework2.cardpack.CardDeckImp;
import ija.ija2016.homework2.model.cards.CardStack;
import ija.ija2016.homework2.model.cards.CardDeck;
import ija.ija2016.homework2.model.cards.Card;



public class CardStackImp extends CardDeckImp implements CardStack{

    public CardStackImp(int size) {
        super(size);
    }

    public boolean isEmpty() {
        if (this.top == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public int top() {
        return this.top;
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

    public int size() {
        return this.top + 1;
    }

    public CardStack pop(Card card) {
        return this.takeFrom(card);
    }

    public Card get(int index) {
        if (index < this.top) {
            return this.deck[index];
        }
        else {
            return null;
        }
    }

    public boolean put(CardStack stack) {
        for (int i = 0; i <= stack.top(); i++) {
            put(stack.get(i));
        }
        return true;
    }

/******************************************************************************/
    public CardStack takeFrom(Card card) {
        int new_size = 0;
        for (int i = this.top; i > -1; i--) {
            new_size++;
            if (card.equals(this.deck[i])) {
                break;
            }

        }
        if (new_size > 0) {
            CardStack new_stack = new CardStackImp(new_size);
            for (int i = this.top - new_size + 1; i <= this.top; i++) {
                new_stack.put(this.deck[i]);
            }
            this.top -= new_size;
            return new_stack;
        }
        else {
            return null;
        }
    }

}