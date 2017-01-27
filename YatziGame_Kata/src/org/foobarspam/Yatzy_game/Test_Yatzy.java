package org.foobarspam.Yatzy_game;
import static org.junit.Assert.*;
import org.junit.Test;
//import org.junit.BeforeClass;

public class Test_Yatzy {
	/*
	@BeforeClass
	public static Yatzy setUpBeforeClass() {
		Yatzy inyector = new Yatzy(1,2,3,4,5);
		return inyector;
	}
	
    @Test
    public void test_inyector() {
    	assertEquals(4, Yatzy.fours(inyector));
    }
    */
	
	@Test
	public void test_chance() {
        assertEquals(15, Yatzy.chance(1,2,3,4,5));
        assertEquals(14, Yatzy.chance(1,1,3,3,6));

	}

    @Test 
    public void test_yatzy_score() {
        assertEquals(50, Yatzy.yatzy_score(1,1,1,1,1));
        assertEquals(0, Yatzy.yatzy_score(6,6,6,6,3));
    }

    @Test 
    public void test_ones() {
        assertEquals(3, Yatzy.ones(1,1,1,4,4));
        assertEquals(2, Yatzy.ones(6,5,6,1,1));
    }

    @Test 
    public void test_twos() {
        assertEquals(6, Yatzy.twos(2,2,2,4,4));
        assertEquals(4, Yatzy.twos(6,5,6,2,2));
    }
    
    @Test 
    public void test_threes() {
        assertEquals(9, Yatzy.threes(3,3,3,4,4));
        assertEquals(6, Yatzy.threes(6,5,6,3,3));
    }
    
    @Test
    public void test_fours() {
    	assertEquals(4, new Yatzy(1,2,3,4,5).fours());
    	assertEquals(8, new Yatzy(1,2,4,4,5).fours());
    }
    
    @Test
    public void test_fives() {
    	assertEquals(5, new Yatzy(1,2,3,4,5).fives());
    	assertEquals(0, new Yatzy(1,2,4,4,4).fives());
    }
    
    @Test
    public void test_sixs() {
    	assertEquals(0, new Yatzy(1,2,3,4,5).sixs());
    	assertEquals(12, new Yatzy(6,6,4,4,5).sixs());
    }
    
    @Test
    public void test_score_pair() {
    	assertEquals(4, Yatzy.score_pair(2,2,1,3,4));
    	assertEquals(6, Yatzy.score_pair(2,3,3,3,6));
    	assertEquals(0, Yatzy.score_pair(1,2,4,5,3));
    	assertEquals(6, Yatzy.score_pair(1,2,2,3,3));
    }
    
    @Test
    public void test_two_pair() {
    	assertEquals(8, Yatzy.two_pair(1,1,1,3,3));
    	assertEquals(0, Yatzy.two_pair(2,3,4,5,6));
    	assertEquals(6, Yatzy.two_pair(1,1,2,2,2));
    	assertEquals(8, Yatzy.two_pair(1,2,2,2,2));
    }
    
    @Test
    public void test_three_of_a_kind() {
    	assertEquals(9, Yatzy.three_of_a_kind(3,3,3,3,3));
    	assertEquals(3, Yatzy.three_of_a_kind(1,1,4,1,6));
    	assertEquals(6, Yatzy.three_of_a_kind(1,1,2,2,2));
    	assertEquals(3, Yatzy.three_of_a_kind(1,1,1,2,2));
    	assertEquals(0, Yatzy.three_of_a_kind(1,2,3,4,5));
    	assertEquals(12, Yatzy.three_of_a_kind(1,4,4,4,5));
    }
    
    @Test
    public void test_four_of_a_kind() {
    	assertEquals(12, Yatzy.four_of_a_kind(3,3,3,3,3));
    	assertEquals(0, Yatzy.four_of_a_kind(1,1,4,1,6));
    	assertEquals(4, Yatzy.four_of_a_kind(1,1,1,1,2));
    	assertEquals(8, Yatzy.four_of_a_kind(2,2,5,2,2));
    	assertEquals(0, Yatzy.four_of_a_kind(1,2,3,4,5));
    }    

	@Test
	public void test_small_straight(){
		assertEquals(15, Yatzy.small_straight(1,2,3,4,5));
		assertEquals(15, Yatzy.small_straight(3,1,2,5,4));
		assertEquals(0, Yatzy.small_straight(1,6,2,3,4));
	} 
	
	@Test
	public void test_large_straight(){
		assertEquals(20, Yatzy.large_straight(2,3,4,5,6));
		assertEquals(20, Yatzy.large_straight(6,5,2,3,4));
		assertEquals(0, Yatzy.large_straight(1,6,2,3,4));
	}   
        
	@Test
	public void test_full_house() {
		assertEquals(13, Yatzy.full_house(2,2,3,3,3));
		assertEquals(27, Yatzy.full_house(5,6,5,5,6));
		assertEquals(0, Yatzy.full_house(1,2,5,4,4));
		assertEquals(8, Yatzy.full_house(1,1,2,2,2));	
		assertEquals(16, Yatzy.full_house(5,2,5,2,2));
		assertEquals(0, Yatzy.full_house(1,2,5,3,4));
	}
    
}
