package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.*;
import java.util.Scanner;

public class Dealing {
	private Deck deck;
	private Scanner kb;

	public static void main(String[] args) {
		Dealing app = new Dealing();
		app.run();

	}

	public void run() {
		deck = new Deck();
		deck.shuffle();
		List<Card> playerHand = new ArrayList<>();
		kb = new Scanner(System.in);

		System.out.print("Enter the number of cards: ");
		try {
			int numberOfCards = kb.nextInt();
			while (numberOfCards > 52 || numberOfCards == 0) {
				System.err.println("Please enter a number between 1-52 ");
				numberOfCards = kb.nextInt();
			}
			for (int i = 0; i < numberOfCards; i++) {
				playerHand.add(deck.dealCard());
			}
			int valueOfHand = 0;
			for (Card card : playerHand) {
				System.out.println(card);
				valueOfHand += card.getValue();
			}

			System.out.println("The value of hand is : " + valueOfHand);

		} catch (InputMismatchException e) {
			System.err.println("Invalid Input");

		}

	}

}
