package org.foobarspam.bowling.testing;

import static org.junit.Assert.*;
import org.foobarspam.bowling.game.ScoreCard;
import org.junit.Test;

public class ScoreCardTest {
	
	@Test
	public void TotalScoreHittingPins(){		
		// Hitting pins total = 60
		String pins = "12345123451234512345";
		int total = 60;		
		ScoreCard scoreCard = new ScoreCard(pins);
		scoreCard.calculateScore();;
		assertEquals(total, scoreCard.getTotalScore());			
	}

	@Test
	public void TotalScoreHittingPinsFail(){
		// test symbol -
		String pins = "9-9-9-9-9-9-9-9-9-9-";
		int total = 90;		
		ScoreCard scoreCard = new ScoreCard(pins);	
		scoreCard.calculateScore();
		assertEquals(total, scoreCard.getTotalScore());		
		pins = "9-3561368153258-7181";         
		total = 82;
		scoreCard = new ScoreCard(pins);
		scoreCard.calculateScore();
		assertEquals(total, scoreCard.getTotalScore());
	}
	
	@Test
	public void TotalScoreSpare(){
		String pins = "5/5/5/5/5/5/5/5/5/5/5";
		int total = 150;	
		ScoreCard scoreCard = new ScoreCard(pins);
		scoreCard.calculateScore();		
		assertEquals(total, scoreCard.getTotalScore());	
		pins = "9-3/613/815/-/8-7/8/8";    
		total = 131;
		scoreCard = new ScoreCard(pins);		
		scoreCard.calculateScore();		
		assertEquals(total, scoreCard.getTotalScore());
	}
	/*
	@Test
	public void PerfectGameScore() {
		String pins = "XXXXXXXXXXXX";
		int total = 300;
		ScoreCard scoreCard = new ScoreCard(pins);
		scoreCard.calculateScore();
		assertEquals(total, scoreCard.getTotalScore());
	}
	*/
}
