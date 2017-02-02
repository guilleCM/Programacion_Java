package org.foobarspam.bowling.testing;
import org.foobarspam.bowling.game.ScoreCard;
import static org.junit.Assert.*;
import org.junit.Test;

public class ImplementacionesTest {

	@Test
	public void testArray() {
		// Hitting pins total = 60
		String pins = "12345123451234512345";	
		ScoreCard scoreCard = new ScoreCard(pins);
		String expected = "[1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 0]";
		assertEquals(expected, scoreCard.imprimirScoreCardArray());	
		pins = "XXXXXXXXXXXX";
		scoreCard = new ScoreCard(pins);
		expected = "[10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0]";
		assertEquals(expected, scoreCard.imprimirScoreCardArray());
		pins = "9-9-9-9-9-9-9-9-9-9-";
		scoreCard = new ScoreCard(pins);
		expected = "[9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 0]";
		assertEquals(expected, scoreCard.imprimirScoreCardArray());
		pins = "5/5/5/5/5/5/5/5/5/5/5";
		scoreCard = new ScoreCard(pins);
		expected = "[5, 11, 5, 11, 5, 11, 5, 11, 5, 11, 5, 11, 5, 11, 5, 11, 5, 11, 5, 11, 5]";
		assertEquals(expected, scoreCard.imprimirScoreCardArray());
	}
	
	@Test
	public void testSumOfArray() {
		
	}
}
