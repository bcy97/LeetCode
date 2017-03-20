package test;

import org.junit.Test;
import static org.junit.Assert.*;

import code.Palindromic;

public class PalindromicTest {

	@Test
	public void testManacher1(){
		Palindromic palindromic = new Palindromic();
		assertEquals("bab", palindromic.longestPalindrome("babad"));
	}
	
	@Test
	public void testManacher2(){
		Palindromic palindromic = new Palindromic();
		assertEquals("bb", palindromic.longestPalindrome("cbbd"));
	}
}
