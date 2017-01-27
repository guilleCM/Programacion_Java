package org.foobarspam.bowlingGame;

public class Game {
	
	private int score = 0;
	private int firstRoll = 0;
	private int secondRoll = 0;
	//private boolean spare = false;
	//private boolean strike = false;
	
	public Game(int firstRoll, int secondRoll) {
		this.firstRoll = firstRoll;
		this.secondRoll = secondRoll;
	}
	
	public void throwBall() {
	}
	
	private void setFirstRoll(int firstRoll) {
		this.firstRoll = firstRoll;
	}
	
	private void setScore() {
		this.score = getFirstRoll() + getSecondRoll();
	}
	
	private void setSecondRoll(int secondRoll) {
		this.secondRoll = secondRoll;
	}
	
	public int getFirstRoll() {
		return this.firstRoll;
	}
	
	public int getSecondRoll() {
		return this.secondRoll;
	}
	
	public int getScore(){
		return this.score;
	}
	
}
