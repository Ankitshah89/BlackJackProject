package com.skilldistillery.blackjack.players;

import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.hand.BlackjackHand;

public class BlackjackDealer extends BlackjackPlayer {

	private Deck deck = new Deck();
	private BlackjackHand hand = new BlackjackHand();

	
	public BlackjackDealer() {
		super();
		deck.shuffle();
		
	}

	
	// Deals cards to the player
	public void dealCardToPlayer(BlackjackPlayer player) {
	System.out.println(deck.dealCards(2, player.getHand().getCards()));
	}


	// Deals card to the dealer
	public void dealCardToDealer() {
		System.out.println(deck.dealCards(1, hand.getCards()));
	}
	
	//If the user hits a card will be added from the deck to the  dealer hand
	public void hit() {
		hand.addCard(deck.dealCard());
	}

	//this adds the card to players deck
	public void hit(BlackjackPlayer player) {
		player.getHand().addCard(deck.dealCard());
	}
	
	public BlackjackHand getHand() {
		return hand;
	}
	
	// To check if the Dealers hits or stands
	public boolean handGreaterThan16orsmallerThan21() {
		if (hand.getHandValue() >= 17 && hand.getHandValue() <=21 ) {
			return true;
		}
		return false;

	}
	
}
