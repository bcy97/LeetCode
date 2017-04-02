package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.LongestCommonPrefix;

public class LongestCommonPrefixTest {

	@Test
	public void test1() {
		LongestCommonPrefix prefix = new LongestCommonPrefix();
		String[] datas = {"abc","abcde","abedf"};
		assertEquals("ab", prefix.solutionMyself(datas));
	}
	
	@Test
	public void test2() {
		LongestCommonPrefix prefix = new LongestCommonPrefix();
		String[] datas = {"a","b","c","d"};
		assertEquals("", prefix.solutionMyself(datas));
	}
	@Test
	public void test3() {
		LongestCommonPrefix prefix = new LongestCommonPrefix();
		String[] datas = {"c","c"};
		assertEquals("c", prefix.solutionMyself(datas));
	}
	
	@Test
	public void testLeetCode1() {
		LongestCommonPrefix prefix = new LongestCommonPrefix();
		String[] datas = {"abc","abcde","abedf"};
		assertEquals("ab", prefix.solutionMyself(datas));
	}
	
	@Test
	public void testLeetCode2() {
		LongestCommonPrefix prefix = new LongestCommonPrefix();
		String[] datas = {"a","b","c","d"};
		assertEquals("", prefix.solutionMyself(datas));
	}
	@Test
	public void testLeetCode3() {
		LongestCommonPrefix prefix = new LongestCommonPrefix();
		String[] datas = {"c","c"};
		assertEquals("c", prefix.solutionMyself(datas));
	}
}
