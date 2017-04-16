package src.board;
import src.cards.Card;
import src.cards.CardDeck;
import src.cards.CardStack;

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