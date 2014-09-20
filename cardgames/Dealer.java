package cardgames;

public class Dealer {
	private Deck deck = new Deck();

	public void dealCards(Player[] players) {
		for (Player player : players) {
			player.hand.add(deck.removeCard());
			player.hand.add(deck.removeCard());
		}
	}

	public void dealExtraCards(Player[] players) {
		for (Player player : players) {
			if (!player.isDoneForRound()) {
				player.hand.add(deck.removeCard());
			}
		}
	}

	public void takeCardsFromPlayers(Player[] players) {
		for (Player player : players) {
			for (Card card : player.hand) {
				deck.addCard(card);
			}
			player.hand.clear();
		}
	}

	public void determineResults(Player[] players) {
		int i = 0;
		for (Player player : players) {
			System.out.printf("Player %d %s\n", i, (player.isBusted() ? "busted" : "did not bust"));	
			System.out.printf("Player %d had a card value of %d\n", i, player.getHandValue());
			i++;	
		}
	}
}
