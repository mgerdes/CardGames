package cardgames;

import java.util.*;

public class Player {
	ArrayList<Card> hand = new ArrayList<Card>();	
	private static final int DEFAULT_START_MONEY = 100;
	protected int money, currentRoundsBet; 
	public Decision decision;

	public Player() {
		this(DEFAULT_START_MONEY);	
	}

	public Player(int startMoney) {
		this.money = startMoney;
	}

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
		if (money >= value) {
			this.currentRoundsBet = value;	
		} else {
			this.currentRoundsBet = value - money;
		}
	}

	public int getCurrentMoney() {
		return money;
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
