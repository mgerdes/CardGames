package players;

import cardgames.*;
import java.util.*;

public class player1 {

	public static void run(Player playerin) {
		ArrayList<Card> p1hand = playerin.getHand();

		System.out.println("\tPlayer 1 has cards");
		for (Card card : p1hand) {
			System.out.println("\t" + card);
		}
		System.out.println("Value is " + playerin.getHandValue());

		if (playerin.getHandValue() < 15) {
			playerin.makeDecision(Player.Decision.HIT);
			System.out.println("Player 1 decided to hit");
		} else {
			playerin.makeDecision(Player.Decision.STAY);
			System.out.println("Player 1 decided to stay");
		}
	}

	public static void getBet(Player playerin) {
		playerin.makeBet(200);		
	}

}
