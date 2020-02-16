package com.skilldistillery.blackjack.players;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.hand.BlackjackHand;
import com.skilldistillery.blackjack.hand.Hand;

public class BlackjackPlayer extends Player {

	private BlackjackHand hand;
	

	public BlackjackPlayer() {
		super();
		hand = new BlackjackHand();

	}

	public Hand getHand() {
		return hand;
	}

	public int getHandTotal() {
		return hand.getHandValue();
	}

	public boolean isBlackjack() {
		return hand.isBlackjack();
	}
	
	public boolean isBust() {
		return hand.isBust();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(hand.getHandValue());
		return builder.toString();
	}

}
