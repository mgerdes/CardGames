import java.util.*;

public class testing {

	public static void main(String[] args) {

		Player p1 = new Player();
		Dealer dealer = new Dealer();

		Player[] players = new Player[1];
		players[0] = p1;

		while (true) {
			// dealer deals cards..
			//
			// player gets cards..
			// player makes bets..
			// player makes decision , i.e hit or stay
			//
			// dealer makes decision
			//
			// dealer deals card..
			//
			// outcome is determined
			// 
			// logic is something like above. Not implemented yet.
			
			dealer.dealCards(players);
			
			ArrayList<Card> hand = p1.getHand();

			for (Card card : hand) {
				System.out.println(card);
			}

			p1.makeBet(100);
			p1.makeDecision(Player.Decision.HIT);
		}
	}

}

class Dealer {
	private Deck deck = new Deck();

	public void dealCards(Player[] players) {
		for (Player player : players) {
			player.hand.add(deck.removeCard());
			player.hand.add(deck.removeCard());
		}
	}
}

class Deck {
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

class Card {
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

class Player {
	ArrayList<Card> hand = new ArrayList<Card>();	

	public static enum Decision {
		HIT, STAY
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void makeDecision(Decision decision) {
		if (decision == Decision.HIT) {

		} else {

		}
	}

	public void makeBet(int value) {

	}
}


















