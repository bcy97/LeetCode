package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.IntegerToRoman;

public class IntegerToRomanTest {

	@Test
	public void testConverseMyself1() {
		IntegerToRoman integerToRoman = new IntegerToRoman();
		assertEquals("I", integerToRoman.converseMyself(1));
	}
	
	@Test
	public void testConverseMyself2() {
		IntegerToRoman integerToRoman = new IntegerToRoman();
		assertEquals("X", integerToRoman.converseMyself(10));
	}
	
	@Test
	public void testConverseMyself3() {
		IntegerToRoman integerToRoman = new IntegerToRoman();
		assertEquals("MMMCMXCIX", integerToRoman.converseMyself(3999));
		
	}
	
	@Test
	public void testLeetCodeSolution1() {
		IntegerToRoman integerToRoman = new IntegerToRoman();
		assertEquals("I", integerToRoman.LeetCodeSolution(1));
	}
	
	@Test
	public void testLeetCodeSolution2() {
		IntegerToRoman integerToRoman = new IntegerToRoman();
		assertEquals("X", integerToRoman.LeetCodeSolution(10));
	}
	
	@Test
	public void testLeetCodeSolution3() {
		IntegerToRoman integerToRoman = new IntegerToRoman();
		assertEquals("MMMCMXCIX", integerToRoman.LeetCodeSolution(3999));
		
	}

}
