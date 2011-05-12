package model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestDeck {
	
	@Test
	public void shouldFillDeckOnCreation(){
		Deck d = new Deck();
		assertNotNull(d.getDeck());
	}
	
	@Test
	public void deckShouldContain52Cards(){
		Deck d = new Deck();
		assertEquals(52, d.getDeck().size());
	}
	
	@Test
	public void deckShouldContainAllCards(){
		Deck d = new Deck();
		List<Card> cards = d.getDeck();
		for(Suite s : Suite.values()){
			for(int value = 2; value <= 14; value++){
				Card c = new Card(s, value);
				assertTrue("Does not contain " + c, cards.contains(c));
			}
		}
	}
	
	@Test
	public void deckSizeShouldDecreasedWhenCardDrawned(){
		Deck d = new Deck();
		assertEquals(52, d.getDeck().size());
		Card c = d.drawCard();
		assertNotNull(c);
		assertEquals(51, d.getDeck().size());
	}
}
