package org.foobarspam.testing;

import static org.junit.Assert.*;

import org.foobarspam.bowlingGame.Game;
import org.junit.Test;

public class GameTest {

	@Test
	public void NormalThrowTest() {
		Game firstThrow = new Game(2,3);
		firstThrow.frameThrows();
		assertEquals(5, firstThrow.getScore());
		firstThrow = new Game(3,4);
		
	}

}
