package cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayingCardDeck implements Deck{
    List<PlayingCard> cards;

    PlayingCardDeck() {
        this.cards = new ArrayList<>();
        Suit[] suits = {new Suit("clubs"), new Suit("diamonds"), new Suit("hearts"), new Suit("spades")};
        for (int i = 0; i < 52; i++) {
            this.cards[i] = new PlayingCard((i % 13), suits[i/13]);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(this.cards);
    }

    @Override
    public void Shuffle(){
        Collections.shuffle(this.cards);
    }

    @Override


}