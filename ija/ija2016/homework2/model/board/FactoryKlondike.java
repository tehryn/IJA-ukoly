package ija.ija2016.homework2.model.board;
import ija.ija2016.homework2.model.cards.Card;
import ija.ija2016.homework2.model.cards.CardDeck;
import ija.ija2016.homework2.model.cards.CardStack;

public class FactoryKlondike extends AbstractFactorySolitaire {
    public CardDeck createCardDeck() {
        return null;
    }
    public Card createCard(Card.Color color, int value) {
        if (value < 14 && value > 0) {
            return Card(color, value);
        }
        else {
            return null;
        }
    }
    public CardDeck createTargetPack(Card.Color color) {
        return null;
    }
    public CardStack createWorkingPack() {
        return null;
    }
}