package org.foobarspam.bowling.game;

import java.util.Arrays;

public class ScoreCard {
	//propiedades
	private String scoreCard = "";
	private int totalScore = 0;
	private String symbols = "-123456789X/";
	
	//constructores
	public ScoreCard() {
		this.scoreCard = "";
	}
	public ScoreCard(String pins) {
		this.scoreCard = pins;
	}
	
	//setters	
	private void setTotalScore(int total) {
		this.totalScore = total;
	}
	
	//getters
	public String getScoreCard() {
		return this.scoreCard;
	}
	
	public int getTotalScore() {
		return this.totalScore;
	}
	
	//metodos
	public void calculateScore(){
		int[] framesCard = scoreCardToIntArray();
		for (int roll = 0; roll<framesCard.length; roll++) {
			if (framesCard[roll] == 11) {
				framesCard[roll-1] = 0;
				framesCard[roll] = 10 + framesCard[roll+1];
				roll++;
			}
		}
		int total = 0;
		for (int i = 0; i<framesCard.length;i++) {
			total+=framesCard[i];
		}
		setTotalScore(total);
	}
	
	//roll es la logica para actuar sobre setter de la propiedad totalScore
	public int[] scoreCardToIntArray() {
		int[] framesPoints = new int[21];
		for(int i=0; i < getScoreCard().length(); i++){
			char pin = getScoreCard().charAt(i);
			framesPoints[i] = getSymbolValue(pin);
		}
		return framesPoints;
	}
	
	private int getSumOfRolls(int[] scoreCardArray) {
		int total = 0;
		scoreCardArray = scoreCardToIntArray();
		for (int roll : scoreCardArray) {
			total += roll;
		}
		return total;
	}
	
	public int getSymbolValue(char symbol) {
		return symbols.indexOf(symbol);
		}
	
	//solo para testear el resultado de scoreCardtIntArray();
	public String imprimirScoreCardArray() {
		int[] card = scoreCardToIntArray();
		return Arrays.toString(card);
	}
	
}
