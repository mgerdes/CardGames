package cardgames;

public class Card {
	public static enum Suit {
		CLUBS, DIAMONDS, HEARTS, SPADES
	}

	public static enum Rank {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
		NINE, TEN, JACK, QUEEN, KING
	}

	private Rank rank;
	private Suit suit;

	Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	@Override
	public String toString() {
		return  rank.name() + " of " + suit.name();
	}
}
