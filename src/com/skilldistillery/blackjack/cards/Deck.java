package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cardsDeck;

	public Deck() {
		createDeck();
	}

	public List<Card> createDeck() {
		cardsDeck = new ArrayList<>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cardsDeck.add(new Card(rank, suit));

			}
		}
		return cardsDeck;
	}

	public int checkDeckSize() {
		return cardsDeck.size();

	}

	public Card dealCard() {
		if (cardsDeck.size() == 0) {
			createDeck();
			shuffle();

		}
		return cardsDeck.remove(0);
	}
	
	public List<Card> dealCards(int numberofCards , List<Card> hand){
		for (int i = 0; i < numberofCards; i ++) {
			if(cardsDeck.size() != 0) {
				hand.add(dealCard());
			}
		}
		return hand;
	}

	public void shuffle() {
		Collections.shuffle(cardsDeck);

	}

}
