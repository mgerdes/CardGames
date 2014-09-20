package cardgames;

import java.util.*;

public class Deck {
	private LinkedList<Card> deck = new LinkedList<Card>();

	Deck() {
		initDeck();
		shuffleDeck();
	}

	public void initDeck() {
		for (Card.Suit suit : Card.Suit.values()) {
			for (Card.Rank rank : Card.Rank.values()) {
				this.addCard(new Card(suit, rank));
			}
		}
	}

	public void shuffleDeck() {
		Collections.shuffle(deck);
	}

	public Card removeCard() {
		return deck.poll();
	}

	public void addCard(Card card) {
		deck.add(card);
	}

	@Override
	public String toString() {
		String s = "";
		for (Card card : deck) {
			s += card.toString() + ", ";
		}
		return s.substring(0, s.length() - 2);
	}
}
