package test;

import org.junit.Test;

import code.ReverseInteger;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

//	@Test
//	public void testReverseMyself1(){
//		ReverseInteger reverse = new ReverseInteger();
//		assertEquals(-321, reverse.reverseMyself(-123));
//	}
//	
//	@Test
//	public void testReverseMyself2(){
//		ReverseInteger reverse = new ReverseInteger();
//		assertEquals(0, reverse.reverseMyself(-2147483648));
//	}
//	
//	@Test
//	public void testReverseMyself3(){
//		ReverseInteger reverse = new ReverseInteger();
//		assertEquals(7654321, reverse.reverseMyself(1234567));
//	}
	@Test
	public void testReverseLeetCode1(){
		ReverseInteger reverse = new ReverseInteger();
		assertEquals(-321, reverse.reverseLeetCode(-123));
	}
	
	@Test
	public void testReverseLeetCode2(){
		ReverseInteger reverse = new ReverseInteger();
		assertEquals(0, reverse.reverseMyself(-2147483648));
	}
	
	@Test
	public void testReverseLeetCode3(){
		ReverseInteger reverse = new ReverseInteger();
		assertEquals(7654321, reverse.reverseMyself(1234567));
	}
	
}
