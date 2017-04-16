package src.cardpack;
import src.cards.Card;

public class CardImp implements Card {
    private int value;
    private Card.Color color;
    private boolean faceUp;

    public CardImp(Card.Color c, int value) {
        this.color = c;
        this.value = value;
        this.faceUp = false;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(Object x) {
        return (this.value() == ((CardImp)x).value() && this.color() == ((CardImp)x).color());
    }
    public int hashCode() {
        return java.util.Objects.hash(this.value, this.color);
    }
    public String toString() {
        switch(this.value) {
            case 1  : return "A"  + "(" + this.color.toString() + ")";
            case 10 : return "10" + "(" + this.color.toString() + ")";
            case 11 : return "J"  + "(" + this.color.toString() + ")";
            case 12 : return "Q"  + "(" + this.color.toString() + ")";
            case 13 : return "K"  + "(" + this.color.toString() + ")";
            default : return String.valueOf(this.value) + "(" + this.color.toString() + ")";
        }
    }
    public Card.Color color() {
        return this.color;
    }

    public boolean isTurnedFaceUp() {
        return this.faceUp;
    }

    public boolean turnFaceUp() {
        if (this.faceUp) {
            return false;
        }
        else {
            return this.faceUp = true;
        }
    }

    public int compareValue(Card card) {
        return this.value - card.value();
    }

    public boolean similarColorTo(Card c) {
        return this.color.similarColorTo(c);
    }
}