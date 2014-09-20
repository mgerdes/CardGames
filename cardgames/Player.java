package cardgames;

import java.util.*;

public class Player {
	ArrayList<Card> hand = new ArrayList<Card>();	
	public Decision decision;

	public static enum Decision {
		HIT, STAY
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void makeDecision(Decision decision) {
		this.decision = decision;
	}

	public void makeBet(int value) {

	}

	public int getHandValue() {
		int value = 0;
		for (Card card : hand) {
			value += card.getRank().ordinal() + 1;	
		}
		return value;
	}

	public boolean isBusted() {
		return getHandValue() > 21;
	}

	public boolean isDoneForRound() {
		return decision == Decision.STAY || isBusted();
	}
}
