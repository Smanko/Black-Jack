package model;

import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Deck {
	
	private List<Card> deck = new Stack<Card>();
	
	public Deck(){
		shuffleDeck();
	}

	private void shuffleDeck() {
		Card[] unshuffeldDeck = fillDeck();
		shuffle(unshuffeldDeck);
	}

	private Card[] fillDeck() {
		int pos = 0;
		Card[] unshuffeldDeck = new Card[52];
		for(Suite suite : Suite.values()){
			for(int value = 2; value <= 14; value++){
				Card c = new Card(suite, value);
				unshuffeldDeck[pos] = c;
				pos++;
			}
		}
		return unshuffeldDeck;
	}

	private void shuffle(Card[] unshuffeldDeck) {
		Random r = new Random();
		for(int i = 51; i >= 0; i--){
			Card c = null;
			while (c == null || deck.contains(c)){
				c = unshuffeldDeck[r.nextInt(52)];
			}
			deck.add(c);
		}
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}

	public List<Card> getDeck() {
		return deck;
	}

	public Card drawCard() {
		return ((Stack<Card>) deck).pop();
	}
}
