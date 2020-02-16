package com.skilldistillery.blackjack.hand;

import com.skilldistillery.blackjack.cards.Card;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
		super();
	}

	@Override
	public int getHandValue() {
		int playerValue = 0;

		for (Card card : getCards()) {
			playerValue += card.getValue();

		}
		return playerValue;
	}

	public boolean isBlackjack() {
		return getHandValue() == 21;

	}

	public boolean isBust() {
		return getHandValue() > 21;
	}

}
