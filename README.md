## Blackjack Project - Week 4 Skill Distillery


## Overview
This is a Blackjack project which allows a user to play against a dealer. The main objective of this project is to better understand and strength our knowledge on Object Oriented Programming.


The user plays a game of blackjack with the dealer. The dealer will deal two cards to the user and the dealer itself. The two dealt cards are two - face up for the user and one - face up and one - face down for the dealer. We do not want to display both the cards for the dealer. The user will then be prompted to hit or stay depending on the total value of their hand.

The dealer has to hit(deal a new card) until or unless the total value of its hand is less than 17. Any player who goes above 21 is busted and looses the round. If both the dealer and the player have hand value of less than or equal 21, the higher card value wins. If the first two cards dealt have the total hand value of 21, its a BLACKJACK.

 
## Design

The program uses **enums**  for its card rank and suits. The program is divided into four packages, each with its individual functionalities. The first package has classes related to the card and the deck. The second package has classes that mocks a card hand and a blackjack hand. The third package consists of the player classes; the player and the blackjackdealer. And the final package has the main app.

In the main app, Deck, BlackjackPlayer & BlackjackDealer objects are instantiated. The deck class contains a List of 52 cards objects, which is then shuffled. The dealer and the user are dealt two cards which are then added to their respective BlackjackHands. The BlackJack hand inherits from an abstract class called Hand. The main idea behind this is to use the Hand class for any other card game, not just BlackJack. The same idea applies to Deck (the deck of cards).

## Topics/ Technologies Used
- Object Oriented Classes
- abstract classes
- enums
- Java, Eclipse, Git 

## Lessons Learned
- I feel that UML diagram is the best way to go around working through a problem.
- It took me a while to understand the connection of various objects with each other. However, once I understood it, I feel that I grew in confidence tackling the problem.
- The knowledge of object oriented programming helped me better understand the functionality of the code itself.