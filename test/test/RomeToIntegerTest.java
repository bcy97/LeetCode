package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.IntegerToRoman;
import code.RomanToInteger;

public class RomeToIntegerTest {

	@Test
	public void testConverseMyself() {
		RomanToInteger romanToInteger = new RomanToInteger();
		IntegerToRoman integerToRoman = new IntegerToRoman();
		for (int i = 1; i < 3999; i++) {
			assertEquals(i, romanToInteger.converseMyself(integerToRoman.converseMyself(i)));
		}
	}
	
	@Test
	public void testNewConverseMyself() {
		RomanToInteger romanToInteger = new RomanToInteger();
		IntegerToRoman integerToRoman = new IntegerToRoman();
		for (int i = 1; i < 3999; i++) {
			assertEquals(i, romanToInteger.newConverseMyself(integerToRoman.converseMyself(i)));
		}
	}
	
	@Test
	public void testLeetCodeSolution() {
		RomanToInteger romanToInteger = new RomanToInteger();
		IntegerToRoman integerToRoman = new IntegerToRoman();
		for (int i = 1; i < 3999; i++) {
			assertEquals(i, romanToInteger.LeetCodeSolution(integerToRoman.converseMyself(i)));
		}
	}

}
