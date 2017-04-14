package ija.ija2016.homework3.model.board;
import ija.ija2016.homework3.model.cards.Card;
import ija.ija2016.homework3.model.cards.CardDeck;
import ija.ija2016.homework3.model.cards.CardStack;
import ija.ija2016.homework3.cardpack.CardImp;
import ija.ija2016.homework3.cardpack.CardDeckImp;
import ija.ija2016.homework3.cardpack.CardStackImp;

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
     * @param  Card.Color color         Color of card
     * @param  int        value         Value of card
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
     * @param  Card.Color color         Color of pack
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