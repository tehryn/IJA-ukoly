package ija.ija2016.homework3.model.board;
import ija.ija2016.homework3.model.cards.Card;
import ija.ija2016.homework3.model.cards.CardDeck;
import ija.ija2016.homework3.model.cards.CardStack;

/**
 * Abstract class representing abstract factory.
 */
public abstract class AbstractFactorySolitaire {
    /**
     * Creates card deck.
     * @return Card deck
     */
    public abstract CardDeck createCardDeck();

    /**
     * Creates new card
     * @param  color         Color of card
     * @param  value         Value of card
     * @return            Card
     */
    public abstract Card createCard(Card.Color color, int value);

    /**
     * Creates target pack (for specific color).
     * @param  color         Color of pack
     * @return            Pack
     */
    public abstract CardDeck createTargetPack(Card.Color color);

    /**
     * Creates working pack.
     * @return Pack
     */
    public abstract CardStack createWorkingPack();
}