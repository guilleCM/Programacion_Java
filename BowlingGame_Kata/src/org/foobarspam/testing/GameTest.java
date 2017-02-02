package org.foobarspam.testing;

import static org.junit.Assert.*;

import org.foobarspam.bowlingGame.Game;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

	private Game gameTest;
	
	@Before
	public void inyector() {
		gameTest = new Game();
	}
	
	@Test
	public void normalThrowTest() {
		gameTest.frameThrow(1, 2);
		assertEquals(3, gameTest.getScore());
	}

	@Test
	public void spareThrowTest() {
		gameTest.frameThrow(7, '/');
		assertEquals(10, gameTest.getScore());
	}

	@Test
	public void secondZeroThrowTest() {
		gameTest.frameThrow(7, '-');
		assertEquals(7, gameTest.getScore());
	}
	
	@Test
	public void firstZeroThrowTest() {
		gameTest.frameThrow('-', 7);
		assertEquals(7, gameTest.getScore());
	}
	
	@Test
	public void doubleZeroThrowTest() {
		gameTest.frameThrow('-', '-');
		assertEquals(0, gameTest.getScore());
	}
	
	@Test
	public void strikeThrowTest() {
		gameTest.frameThrow('X');
		assertEquals(10, gameTest.getScore());
	}
	/*
	@Test
	public void oneFrameTest() {
		gameTest.gameScore(2, 3);
		assertEquals(5, gameTest.getScore());
	}
	
	@Test
	public void moreFramesTest() {
		gameTest.gameScore(5,2, 2,3);
		assertEquals(12, gameTest.getScore());	
		gameTest = new Game();
		gameTest.gameScore(1,2, 3,4, 5,1, 2,3, 4,5, 1,2, 3,4, 5,1, 2,3, 4,5);
		assertEquals(60, gameTest.getScore());
	}
	*/
	@Test
	public void normalGameTest() {
		gameTest.scoreCard("12345123451234512345");
		assertEquals(60, gameTest.getScore());
	}
	
	@Test
	public void perfectGameTest() {
		gameTest.scoreCard("XXXXXXXXXXXX");
		assertEquals(300, gameTest.getScore());		
	}
	
}
