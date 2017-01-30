package org.foobarspam.Yatzy_game;

import java.util.Arrays;

public class Yatzy {
	//al crear un new Array de integers de 5 posiciones,
	//por defecto estos tomaran el valor 0 (Beggining Java 8 Fundamentals cap15)
	protected int[] dice = new int[5];
	
	public Yatzy(int d1, int d2, int d3, int d4, int d5) {
		this.dice = new int[] {d1, d2, d3, d4, d5};
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
    	int PAIR = 2;
    	for (int n=6; n!=0; n--) {
    		int counts = ocurrencias_num_en_array(n, dice);
    		if (counts >= PAIR) {
    			return n * PAIR;
    		}
    	}
    	return 0;
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
    	int THREE = 3;
    	for (int n=6; n!=0; n--) {
    		int counts = ocurrencias_num_en_array(n, dice);
    		if (counts >= THREE) {
    			return n * THREE;
    		}
    	}
    	return 0;
    }

    public static int four_of_a_kind(int... dice) {
    	int FOUR = 4;
    	for (int n=6; n!=0; n--) {
    		int counts = ocurrencias_num_en_array(n, dice);
    		if (counts >= FOUR) {
    			return n * FOUR;
    		}
    	}
    	return 0;
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
    
    public static int full_house(int...dice) {
    	int score = 0;
    	boolean pairFound = false;
    	boolean threeFound = false;
    	int THREE = 3;
    	int PAIR = 2;
    	for (int n=6; n!=0; n--){
    		int counts = ocurrencias_num_en_array(n, dice);
    		if (counts == THREE) {
    			score += n * THREE;
    			threeFound = true;
    		} else if (counts == PAIR){
    			score += n * PAIR;
    			pairFound = true;
    		}
    	}
    	if (pairFound && threeFound) {
    		return score;
    	}
    	return 0;
    }
    
    //Metodo creado para simular el metodo Array.count(numero) de Python
    //y asi poder reutilizar el codigo escrito en el Kata en Python
    public static int ocurrencias_num_en_array(int elemento, int[] lista) {
    	int ocurrencias = 0;
    	for (int numero : lista) {
    		if (numero == elemento) {
    			ocurrencias++;
    		}
    	}
    	return ocurrencias;
    }
}
