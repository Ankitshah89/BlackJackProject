package com.skilldistillery.blackjack.hand;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.blackjack.cards.Card;

public abstract class Hand {

	private List<Card> cards;

	public Hand() {
		cards = new ArrayList<>();
	}

	public List<Card> getCards() {
		return cards;
	}
	
	public void addCard(Card card) {
		getCards().add(card);
	}

	public void clearHand() {
		cards.removeAll(cards);
	}


	public void clear() {
		cards = new ArrayList<>();

	}
	public abstract int getHandValue();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(cards);
		return builder.toString();
	}

}


