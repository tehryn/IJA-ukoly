package ija.ija2016.homework2.model.board;
import ija.ija2016.homework2.model.cards.Card;
import ija.ija2016.homework2.model.cards.CardDeck;
import ija.ija2016.homework2.model.cards.CardStack;
import ija.ija2016.homework2.cardpack.CardImp;
import ija.ija2016.homework2.cardpack.CardDeckImp;
import ija.ija2016.homework2.cardpack.CardStackImp;

public class FactoryKlondike extends AbstractFactorySolitaire {
    @Override
    public CardDeck createCardDeck() {
        return null;
    }

    @Override
    public Card createCard(Card.Color color, int value) {
        if (value < 14 && value > 0) {
            return new CardImp(color, value);
        }
        else {
            return null;
        }
    }

    @Override
    public CardDeck createTargetPack(Card.Color color) {
        return null;
    }

    @Override
    public CardStack createWorkingPack() {
        return null;
    }
}