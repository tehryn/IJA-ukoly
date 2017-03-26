package ija.ija2016.homework2.model.cards;
import ija.ija2016.homework2.cardpack.CardImp;

public interface Card {
    public static enum Color {
        CLUBS, DIAMONDS, HEARTS, SPADES;

        public String toString() {
            switch(this) {
                case CLUBS    : return "C";
                case DIAMONDS : return "D";
                case HEARTS   : return "H";
                case SPADES   : return "S";
                default       : return "";
            }
        }

        public boolean similarColorTo(Card c) {
            Color color = c.color();
            if ((color == DIAMONDS || color == HEARTS) && (this == HEARTS || this == DIAMONDS)) {
                return true;
            }
            else if ((color == SPADES || color == CLUBS) && (this == SPADES || this == CLUBS)) {
                return true;
            }
            else {
                return false;
            }
        }
    };
    boolean turnFaceUp();
    boolean isTurnedFaceUp();
    boolean similarColorTo(Card card);
    Color color();
    int value();
    int compareValue(Card card);
}