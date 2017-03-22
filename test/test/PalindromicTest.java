package test;

import org.junit.Test;
import static org.junit.Assert.*;

import code.Palindromic;

public class PalindromicTest {

//	@Test
//	public void testManacher1(){
//		Palindromic palindromic = new Palindromic();
//		assertEquals("bab", palindromic.leetCodePassed("babad"));
//	}
//	
//	@Test
//	public void testManacher2(){
//		Palindromic palindromic = new Palindromic();
//		assertEquals("bb", palindromic.leetCodePassed("cbbd"));
//	}
//	
//	@Test
//	public void testManacher3(){
//		Palindromic palindromic = new Palindromic();
//		assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
//				+ "aaaaaaaaaaaaaaaaaaaa"
//				, palindromic.leetCodePassed("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
//	}
//	
//	@Test
//	public void testManacher4(){
//		Palindromic palindromic = new Palindromic();
//		assertEquals("aaabaaa", palindromic.leetCodePassed("aaabaaaa"));
//	}
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
	
	@Test
	public void testManacher3(){
		Palindromic palindromic = new Palindromic();
		assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaa"
				, palindromic.longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
	}
	
	@Test
	public void testManacher4(){
		Palindromic palindromic = new Palindromic();
		assertEquals("aaabaaa", palindromic.longestPalindrome("aaabaaaa"));
	}
}
