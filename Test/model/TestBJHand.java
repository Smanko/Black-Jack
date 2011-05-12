package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBJHand {
	
	@Test
	public void shouldEvaluateJto10(){
		BJHand hand = new BJHand();
		Card jackOfHearts = new Card(Suite.HEARTS, 11);
		hand.add(jackOfHearts);
		assertEquals(10, hand.getScore());
	}
	
	@Test
	public void shouldEvaluateQto10(){
		BJHand hand = new BJHand();
		Card queenOfHearts = new Card(Suite.HEARTS, 12);
		hand.add(queenOfHearts);
		assertEquals(10, hand.getScore());
	}
	
	@Test
	public void shouldEvaluateKto10(){
		BJHand hand = new BJHand();
		Card kingOfHearts = new Card(Suite.HEARTS, 13);
		hand.add(kingOfHearts);
		assertEquals(10, hand.getScore());
	}
	
	@Test
	public void shouldEvaluateAto11WhenTotalValueOfHandIsLessThan22(){
		BJHand hand = new BJHand();
		Card aceOfHearts = new Card(Suite.HEARTS, 14);
		hand.add(aceOfHearts);
		assertEquals(11, hand.getScore());
	}
	
	@Test
	public void shouldAccumulateValuesOfCardsInHand(){
		BJHand hand = new BJHand();
		int valueOfFirstCard = 6;
		Card sixOfSpades = new Card(Suite.SPADES, valueOfFirstCard);
		hand.add(sixOfSpades);
		int valueOfSecondCard = 9;
		Card nineOfSpades = new Card(Suite.SPADES, valueOfSecondCard);
		hand.add(nineOfSpades);
		assertEquals(valueOfFirstCard+valueOfSecondCard, hand.getScore());
	}
	
	@Test
	public void shouldEvaluateAto1IfTotalValueOfHandExceeds21(){
		BJHand hand = new BJHand();
		int valueOfFirstCard = 10;
		hand.add(new Card(Suite.DIAMONDS, valueOfFirstCard));
		int valueOfSecondCard = 9;
		hand.add(new Card(Suite.DIAMONDS, valueOfSecondCard));
		hand.add(new Card(Suite.DIAMONDS, 14));
		assertEquals(valueOfFirstCard+valueOfSecondCard+1, hand.getScore());
	}
}
