package com.skilldistillery.blackjack.cards;

import java.util.*;
import java.util.List;

public class Deck {
	List<Card> cards;

	public Deck() {
		cards = new ArrayList<>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(rank, suit));

			}
		}
	}

	public int checkDeckSize() {

		return cards.size();

	}

	public Card dealCard() {
		return cards.remove(0);
	}

	public void shuffle() {
		Collections.shuffle(cards);

	}

}
