package test;

import org.junit.Test;
import static org.junit.Assert.*;
import code.PalindromeNumber;

public class PalidromeNumberTest {

	@Test
	public void testPalidromeNumber1(){
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		assertEquals(false, palindromeNumber.palidromeNumber(-1));
	}
	@Test
	public void testPalidromeNumber2(){
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		assertEquals(true, palindromeNumber.palidromeNumber(0));
	}
	@Test
	public void testPalidromeNumber3(){
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		assertEquals(false, palindromeNumber.palidromeNumber(10));
	}
	@Test
	public void testPalidromeNumber4(){
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		assertEquals(false, palindromeNumber.palidromeNumber(100));
	}
	@Test
	public void testPalidromeNumber5(){
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		assertEquals(true, palindromeNumber.palidromeNumber(4));
	}
}
