package org.foobarspam.bowling.game;

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
		this.totalScore += total;
	}
	
	//getters
	public String getScoreCard() {
		return this.scoreCard;
	}
	
	public int getTotalScore() {
		return this.totalScore;
	}
		
	//metodos
	//cambiamos la estructura de datos de String a Array de integers
	//permite operaciones con menos complejidad de codigo	
	public int[] scoreCardToArray(){
		int[] scoreCardArray = new int[21];
		for (int roll = 0; roll<getScoreCard().length(); roll++){
			// Si no es spare
			int pinsDown = getSymbolValue(getScoreCard().charAt(roll));
			if (pinsDown != 11){
				scoreCardArray[roll] = pinsDown;
			} else{ // Si es spare
				// Nunca dará error ya que el spare no puede
				// encontrarse en la primera tirada
				scoreCardArray[roll] = 10 - scoreCardArray[roll-1];
			}
		}
		return scoreCardArray;
	}
	
	public void calculateScore(){
		int[] scorecard = scoreCardToArray();
		int pointer = 0;
		for (int frame = 0; frame < 10; frame++){
			if (isStrike(pointer, scorecard)){
				setTotalScore(scorecard[pointer] + scorecard[pointer + 1] 
								+ scorecard[pointer + 2]);
				pointer += 1;
			} else if (isSpare(pointer, scorecard)){
				setTotalScore(10 + scorecard[pointer + 2]);
				pointer += 2;
			} else {
				setTotalScore(scorecard[pointer] + scorecard[pointer+1]);
				pointer += 2;
			}
		}
	}

	// Métodos que nos indican si la tirada es Spare o Strike
	public Boolean isSpare(int pointer, int[] intCard){
		return 10 == intCard[pointer] + intCard[pointer + 1];
	}

	public Boolean isStrike(int pointer, int[] intCard){
		return 10 == intCard[pointer];
	}
	
	private int getSymbolValue(char symbol) {
		return symbols.indexOf(symbol);
	}
	
}
