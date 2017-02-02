package org.foobarspam.bowlingGame;

import java.util.ArrayList;

public class Game {
	
	//Constructores propiedades clase
	private int score = 0;
	public int[] frames = new int[21];
	int frame = 0;
	
	//setters
	private void setScore(int score) {
		this.score = score;
	}
	
	//getters
	public int getScore(){
		return this.score;
	}
	
	//metodos
	public void frameThrow(int firstRoll, int secondRoll) {
		setScore(firstRoll+secondRoll);
	}
	
	public void frameThrow(int firstRoll, char secondRoll) {
		int secondRollPoints = 0;
		if (secondRoll == '/') {
			secondRollPoints = 10 - firstRoll;
		}
		setScore(firstRoll+secondRollPoints);
	}

	public void frameThrow(char firstRoll, int secondRoll) {
		setScore(secondRoll);
	}
	
	public void frameThrow(char firstRoll, char secondRoll) {
		setScore(0);
	}
	
	public void frameThrow(char strike) {
		if (strike == 'X') {
		setScore(10);
		}
	}
	
	
	public void scoreCard(String score) {
		for (int i = 0; i < score.length(); i++) {
			int totalPoints = getScore();
			int pinsDown = 0;
			int bonusPointMultiplier = 0;
			String elementValue = score.substring(i, i+1);
			
			if (isStrike(elementValue)) {
				pinsDown = 10;
				bonusPointMultiplier += 2;

			}
			else {
				pinsDown = Integer.parseInt(elementValue);
				setScore(totalPoints+pinsDown);
			}
		}
	}

	public boolean isStrike(String roll) {
		if (roll.equalsIgnoreCase("X"))
			return true;
		else
			return false;
	}
	
	public int spareValue(int previousNumber) {
		int totalPINS = 10;
		return totalPINS - previousNumber;
	}
}
