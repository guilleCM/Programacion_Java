package org.foobarspam.Yatzy_game;

import java.util.Arrays;

public class Yatzy {
	
	protected int[] dice;
	
	public Yatzy(int d1, int d2, int d3, int d4, int d5) {
		dice = new int[5];
		dice[0] = d1;
		dice[1] = d2;
		dice[2] = d3;
		dice[3] = d4;
		dice[4] = d5;
	}
	
    public static int chance(int... dice) {
    	int score = 0;
        for (int i = 0; i < dice.length; i++) {
            score += dice[i];
        }
        return score;
    }
	
    public static int yatzy_score(int... dice) {
        for (int die : dice) {
        	if (die != dice[0]) {
        		return 0;
        	}
        }
        return 50;
    }
    
    public static int ones(int... dice){
    	int score = 0;
    	for (int die : dice) {
    		if (die == 1) {
    			score += die;
    		}
    	}
    	return score;
    }

    public static int twos(int... dice){
    	int score = 0;
    	for (int die : dice) {
    		if (die == 2) {
    			score += die;
    		}
    	}
    	return score;
    }
    
    public static int threes(int... dice){
    	int score = 0;
    	for (int die : dice) {
    		if (die == 3) {
    			score += die;
    		}
    	}
    	return score;
    }
    
    public int fours() {
    	int score = 0;
    	for (int die : dice) {
    		if (die == 4) {
    			score += die;
    		}
    	}
    	return score;
    }
    
    public int fives() {
    	int score = 0;
    	for (int die : dice) {
    		if (die == 5) {
    			score += die;
    		}
    	}
    	return score;
    }
    
    public int sixs() {
    	int score = 0;
    	for (int die : dice) {
    		if (die == 6) {
    			score += die;
    		}
    	}
    	return score;
    }
    
    public static int score_pair(int... dice) {
    	Arrays.sort(dice);
    	int PAIR = 2;
    	int score = 0;
    	for (int i = dice.length -1; i > 0; i--) {
    		if (dice[i] == dice[i - 1]) {
    			return score = dice[i] * PAIR;
    		}
    	}
    	return score;
    }

    public static int two_pair(int... dice) {
    	Arrays.sort(dice);
    	int PAIR = 2;
    	int score = 0;
    	int pairsFound = 0;
    	for (int i = dice.length -1; i > 0 && pairsFound < 2; i--) {
    		if (dice[i] == dice[i - 1]) {
    			score += dice[i] * PAIR;
    			pairsFound ++;
    			i--; //Si encuentra una pareja, ya no importa que recorra el siguiente número, dado que es pareja del actual.
    		}
    	}
    	return score;
    }    
    
    public static int three_of_a_kind(int... dice) {
    	Arrays.sort(dice);
    	int THREE = 3;
    	int score = 0;
    	for (int i = dice.length -1; i >= 2; i--) {
    		if (dice[i] == dice[i - 2]) {
    			return score += dice[i] * THREE;
    		}
    	}
    	return score;
    }

    public static int four_of_a_kind(int... dice) {
    	Arrays.sort(dice);
    	int FOUR = 4;
    	int score = 0;
    	for (int i = dice.length -1; i >= 3; i--) {
    		if (dice[i] == dice[i - 3]) {
    			return score += dice[i] * FOUR;
    		}
    	}
    	return score;
    }
    
    public static int small_straight(int... dice) {
    	Arrays.sort(dice);
    	int score = 15;
    	for (int i = 0; i < dice.length; i++) {
    		if (dice[i] != i+1) {
    			return 0;
    		}
    	}
    	return score;
    }
    
    public static int large_straight(int... dice) {
    	Arrays.sort(dice);
    	int score = 20;
    	for (int i = 0; i < dice.length; i++) {
    		int j = i+1;
    		if (dice[i] != j+1) {
    			return 0;
    		}
    	}
    	return score;
    }    
    
    public static int full_house(int... dice) {
    	Arrays.sort(dice);
    	int score = 0;
    	boolean threeFoundAtBeginOfArray = dice[0] == dice[2];
    	boolean threeFoundAtEndOfArray = dice[2] == dice[4];
    	if (threeFoundAtBeginOfArray && dice[3] == dice[4]) {
    		int pairValue = dice[3] * 2;
    		int threeValue = dice[0] * 3;
    		return score = pairValue+threeValue;
    	}
    	if (threeFoundAtEndOfArray && dice[0] == dice[1]) {
    		int pairValue = dice[0] * 2;
    		int threeValue = dice[2] * 3;
    		return score = pairValue+threeValue;    		
    	}
    	return score;
    }
    
}
