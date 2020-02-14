
package com.skilldistillery.blackjack.cards;

public enum Suit {
	HEARTS("Hearts"), 
	SPADES("Spades"), 
	CLUBS("Clubs"), 
	DIAMONDS("Diamonds");

	Suit(String name) {
		this.name = name;
	}

	private String name;
	
	@Override
	public String toString() {
		return name;
	}

}
