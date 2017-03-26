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
//        System.out.println("Je prazdny? " + this.isEmpty());
        if (this.isEmpty() && card.value() != 13) {
            return false;
        }
        if (!this.isEmpty()) {
//            System.out.println("chci polozit: " + card + " na " + this.deck[this.top]);
            Card tmp = this.deck[this.top];
//            System.out.println("Rozdil karet je: "+ tmp.compareValue(card) + " Jsou si podobne?" + tmp.similarColorTo(card));
            if (tmp.compareValue(card) != 1 || tmp.similarColorTo(card)) {
//                System.out.println("Nepolozeno - chyba");
                return false;
            }
        }

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
        if (index < 0 || index > this.top) {
            return null;
        }
        else {
            return this.deck[index];
        }
    }

    /*public void my_put(Card card) {
        this.deck[++this.top] = card;
    }*/

    public boolean put(CardStack stack) {
        for (int i = 0; i < stack.size(); i++) {
            if (put(stack.get(i)) == false) {
                return false;
            }
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
                new_stack.my_put(this.deck[i]);
            }
            this.top -= new_size;
            return new_stack;
        }
        else {
            return new CardStackImp(1);
        }
    }

}