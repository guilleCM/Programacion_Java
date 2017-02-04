package org.foobarspam.bowling.testing;

import static org.junit.Assert.*;
import org.foobarspam.bowling.game.ScoreCard;
import org.junit.Before;
import org.junit.Test;

public class ScoreCardTest {
	
	String pins;
	ScoreCard game;
	
	@Test
	public void testScoreCardToIntArray() {
		
		pins = "12345123451234512345";
		game = new ScoreCard(pins);
		int[] arrayExpected = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,0};
		assertArrayEquals(arrayExpected, game.scoreCardToArray());
		
		pins = "9-9-9-9-9-9-9-9-9-9-";
		game = new ScoreCard(pins);
		arrayExpected = new int[]{9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,0};
		assertArrayEquals(arrayExpected, game.scoreCardToArray());

		
		pins = "5/5/5/5/5/5/5/5/5/5/5";
		game = new ScoreCard(pins);
		arrayExpected = new int[]{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
		assertArrayEquals(arrayExpected, game.scoreCardToArray());
		
		pins = "XXXXXXXXXXXX";
		game = new ScoreCard(pins);
		arrayExpected = new int[]{10,10,10,10,10,10,10,10,10,10,10,10,0,0,0,0,0,0,0,0,0};
		assertArrayEquals(arrayExpected, game.scoreCardToArray());
		
		pins = "-1-1XX-/--X111111";
		game = new ScoreCard(pins);
		arrayExpected = new int[]{0,1,0,1,10,10,0,10,0,0,10,1,1,1,1,1,1,0,0,0,0};
		assertArrayEquals(arrayExpected, game.scoreCardToArray());	
	}
	
	@Test
	public void testCalculateScore() {

		pins = "12345123451234512345";
		game = new ScoreCard(pins);
		game.calculateScore();
		assertEquals(60, game.getTotalScore());
		
		pins = "9-9-9-9-9-9-9-9-9-9-";
		game = new ScoreCard(pins);
		game.calculateScore();
		assertEquals(90, game.getTotalScore());	

		pins = "5/5/5/5/5/5/5/5/5/5/5";
		game = new ScoreCard(pins);
		game.calculateScore();
		assertEquals(150, game.getTotalScore());
	
		pins = "XXXXXXXXXXXX";
		game = new ScoreCard(pins);
		game.calculateScore();		
		assertEquals(300, game.getTotalScore());
		
		pins = "XXX247/X--234/X-";
		game = new ScoreCard(pins);
		game.calculateScore();
		assertEquals(139, game.getTotalScore());
		

		pins = "-1-1XX-/--X111111";
		game = new ScoreCard(pins);
		game.calculateScore();
		assertEquals(70, game.getTotalScore());

		pins = "XX5/5/----12121/1/X";
		game = new ScoreCard(pins);
		game.calculateScore();
		assertEquals(107, game.getTotalScore());

	}
	
}
