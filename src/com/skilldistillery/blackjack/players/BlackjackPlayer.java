package com.skilldistillery.blackjack.players;

import com.skilldistillery.blackjack.hand.BlackjackHand;
import com.skilldistillery.blackjack.hand.Hand;

public class BlackjackPlayer extends Player {

	private Hand hand;

	public BlackjackPlayer() {
		hand = new BlackjackHand();
	}

}
