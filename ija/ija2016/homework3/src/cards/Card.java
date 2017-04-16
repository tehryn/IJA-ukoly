package src.cards;
import src.cardpack.CardImp;

/**
 * Object representing card with value and color.
 */
public interface Card {
    /**
     * Object representing card color. There are 4 colors: CLUBS, DIAMONDS, HEARTS and SPADES
     */
    public static enum Color {
        CLUBS, DIAMONDS, HEARTS, SPADES;

        /**
         * Converts color to string
         * @return String representing color.
         */
        public String toString() {
            switch(this) {
                case CLUBS    : return "C";
                case DIAMONDS : return "D";
                case HEARTS   : return "H";
                case SPADES   : return "S";
                default       : return "";
            }
        }

        /**
         * Test if 2 cards have similar color.
         * @param  c    2nd card
         * @return      true if cards are similar
         */
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

    /**
     * Turns cards face up.
     * @return False if cards face is already up. True of card was switched.
     */
    boolean turnFaceUp();

    /**
     * Tests if card is vissible
     * @return True if card is vissible, false of not
     */
    boolean isTurnedFaceUp();

    /**
     * Test if 2 cards have similar color.
     * @param  card 2nd card
     * @return      true if cards are similar
     */
    boolean similarColorTo(Card card);

    /**
     * Retrieve color of card.
     * @return Color of card
     */
    Color color();

    /**
     * Retrieve value of card
     * @return value of card
     */
    int value();

    /**
     * Compare values of 2 cards
     * @param  card 2nd card
     * @return      Difference of values
     */
    int compareValue(Card card);
}