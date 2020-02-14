package com.skilldistillery.blackjack.hand;

import java.util.*;

import com.skilldistillery.blackjack.cards.Card;

public abstract class Hand {

	private List<Card> cards;

	public Hand() {
		cards = new ArrayList<>();
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public void clear() {
		cards = new ArrayList<>();

	}

	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}
	
	

}
