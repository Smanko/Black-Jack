package model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	
	protected List<Card> hand = new ArrayList<Card>();
	
	public Hand(){
	}
	
	public Hand(Card card){
		hand.add(card);
	}
	
	public Hand(List<Card> hand){
		this.hand = hand;
	}
	
	public void add(Card card) {
		hand.add(card);
	}
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
}
