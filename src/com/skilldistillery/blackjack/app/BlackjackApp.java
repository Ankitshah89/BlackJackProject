package com.skilldistillery.blackjack.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.hand.BlackjackHand;
import com.skilldistillery.blackjack.hand.Hand;
import com.skilldistillery.blackjack.players.BlackjackDealer;
import com.skilldistillery.blackjack.players.BlackjackPlayer;

public class BlackjackApp {

	private Deck deck = new Deck();
	private BlackjackDealer dealer = new BlackjackDealer();
	private BlackjackPlayer player = new BlackjackPlayer();
	private BlackjackHand hand;

	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.run();
	}

	public void run() {
		System.out.println("\t\t\t\t----------BlackJack----------");
		playGame();

	}

	private void playGame() {
		boolean keepPlaying = true;
		do {

			System.out.println("\t\tShuffling Cards...\n");
			System.out.println("Dealing Cards to the Dealer\n");

			dealer.dealCardToDealer();
			System.out.println("**** The first card is face down for the Dealer ****");
			System.out.println("--------------------------");

			System.out.println("Dealing Cards to the Player..\n");
			dealer.dealCardToPlayer(player);
			System.out.println("--------------------------");

			playersHand();
			dealersHand();

			if (player.getHand().getHandValue() == 21) {
				System.out.println("Player Wins....blackjack");

			}
			if (dealer.isBlackjack()) {
				System.out.println("Dealer Wins...blackjack");

			}

			gameResult();

			resetDeck();
			System.out.println();
			System.out.println("Do you want to play again(Y/N)");
			String again = kb.next();
			if (again.equalsIgnoreCase("N")) {
				System.out.println("Thanks for Playing");
				keepPlaying = false;
			}
		} while (keepPlaying);

	}

	public void playersHand() {
		int choice = 0;

		do {

			System.out.println("Your Hand Value : " + player.getHandTotal());
			System.out.println("--------------------------");
			System.out.println("1.Hit \n2.Stand  (Choose 1 or 2)");
			choice = kb.nextInt();
			switch (choice) {
			case 1:
				dealer.hit(player);
				break;
			case 2:
				break;
			default:
				System.out.println("Please choose either 1 or 2");
				break;

			}
		} while (player.getHandTotal() < 21 && choice != 2);

		System.out.println("Your Hand Value: " + player.getHandTotal());
		System.out.println("--------------------------\n");

		if (player.isBust()) {
			System.out.println("BUST ......\n");

		}
	}

	public void dealersHand() {
		while (dealer.getHand().getHandValue() < 17) {
			dealer.hit();

		}
		System.out.println("Dealers Total Value: " + dealer.getHand().getHandValue());
		System.out.println();

		if (dealer.getHand().isBust()) {
		System.out.println("DEALER BUSTED .......");

		}

	}

	public void gameResult() {

		if (player.isBust()) {
			System.out.println("DEALER WINS\n");

		}
		if (player.isBlackjack()) {
			System.out.println("BLACKJACK .... PLAYER WINS\n");

		
		}
		if (dealer.isBust()) {
			System.out.println("PLAYER WINS\n");

		}
		if (dealer.getHand().getHandValue() > player.getHand().getHandValue()
				&& dealer.getHand().getHandValue() <= 21) {
			System.out.println("DEALER WINS\n");

		}
		if (player.getHand().getHandValue() > dealer.getHand().getHandValue() && !player.isBust()) {
			System.out.println("PLAYER WINS\n");
		}

		if (dealer.getHand().getHandValue() == player.getHand().getHandValue() && !dealer.isBust()
				&& !player.isBust()) {
			System.out.println("DRAW\n");

		}

	}

	public void resetDeck() {
		dealer.getHand().clear();
		player.getHand().clear();
	}

}
