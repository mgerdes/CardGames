import cardgames.*;
import players.*;
import java.util.*;

public class testing {

	public static void main(String[] args) {

		Player p1 = new Player();
		Dealer dealer = new Dealer();

		Player[] players = new Player[1];
		players[0] = p1;

		int roundNumber = 0;

		while (true) {

			dealer.dealCards(players);

			System.out.printf("Round: %d\n", roundNumber);

			while (true) {
				player1.run(p1);

				dealer.dealExtraCards(players);

				boolean roundOver = true;
				for (Player player : players) {
					if (!player.isDoneForRound())
						roundOver = false;
				}
				if (roundOver) break;
			}

			dealer.determineResults(players);
			dealer.takeCardsFromPlayers(players);

			if (roundNumber >= 10) break;
			roundNumber++;
		}
	}
}
