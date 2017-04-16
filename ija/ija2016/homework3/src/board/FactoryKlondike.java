package src.board;
import src.cards.Card;
import src.cards.CardDeck;
import src.cards.CardStack;
import src.cardpack.CardImp;
import src.cardpack.CardDeckImp;
import src.cardpack.CardStackImp;

/**
 * Class that holds basic methods for solitare.
 */
public class FactoryKlondike extends AbstractFactorySolitaire {
    /**
     * Creates standart pack of 52 cards
     * @return Pack
     */
    @Override
    public CardDeck createCardDeck() {
        return CardDeckImp.createStandardDeck();
    }

    /**
     * Creates new card
     * @param  color         Color of card
     * @param  value         Value of card
     * @return            card
     */
    @Override
    public Card createCard(Card.Color color, int value) {
        if (value < 14 && value > 0) {
            return new CardImp(color, value);
        }
        else {
            return null;
        }
    }

    /**
     * Creates new target pack
     * @param  color         Color of pack
     * @return            Pack
     */
    @Override
    public CardDeck createTargetPack(Card.Color color) {
        return CardDeckImp.createColorDeck(color);
    }

    /**
     * Creates new working pack
     * @return pack
     */
    @Override
    public CardStack createWorkingPack() {
        return new CardStackImp(52);
    }
}