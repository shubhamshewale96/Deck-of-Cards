package com.bl.deckofcards;

import java.util.Arrays;

public class DeckCardMain {

	private String[] suits = { "Spades", "Heart", "Diamond", "Clubs" };
	private String[] ranks = { "Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2" };
	private String[] deck = new String[52];

	public void intilizeDeck() {
		int i;
		for (i = 0; i < deck.length; i++) {
			/*
			 * ranks[i%13] i=0 means i%13=0 getting index is 0 it means get value Ace at
			 * time i increment i=1 means 1%13=1 getting index 1 present value is 2
			 * suits[i/13] i=0 mean o/13=0 getting index 0 present value is Ace getting
			 * spades 13 time at time i=13 that time getting index 1 present value is hearts
			 */

			deck[i] = suits[i / 13] + ranks[i % 13];
		}
	}
	/*
	 * Display cards 
	 */
	public void displayCard() {
		System.out.println(Arrays.toString(deck));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Deck of cards");
		DeckCardMain deackCard = new DeckCardMain();
		deackCard.intilizeDeck();
		deackCard.displayCard();
	}
}
