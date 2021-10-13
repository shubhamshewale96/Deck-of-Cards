package com.bl.deckofcards;

public class DeckCardMain {

	int[] deck = new int[52];
	String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
	String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

	public void shuffel() {
		// Initialize cards
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = index;
			index = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Deck of cards");
		DeckCardMain deackCard = new DeckCardMain();
		deackCard.shuffel();
	}
}
