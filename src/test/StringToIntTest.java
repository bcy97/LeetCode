package test;

import org.junit.Test;

import code.StringToInt;

import static org.junit.Assert.*;

public class StringToIntTest {

	@Test
	public void testStringToInt1(){
		StringToInt stringToInt = new StringToInt();
		assertEquals(0, stringToInt.stringToInt("     +-15651"));
	}
	@Test
	public void testStringToInt2(){
		StringToInt stringToInt = new StringToInt();
		assertEquals(12345678, stringToInt.stringToInt("12345678"));
	}
	@Test
	public void testStringToInt3(){
		StringToInt stringToInt = new StringToInt();
		assertEquals(-123, stringToInt.stringToInt("   -123aweoifh"));
	}
	@Test
	public void testStringToInt4(){
		StringToInt stringToInt = new StringToInt();
		assertEquals(Integer.MAX_VALUE, stringToInt.stringToInt("987654324335465678789"));
	}
	@Test
	public void testStringToInt5(){
		StringToInt stringToInt = new StringToInt();
		assertEquals(Integer.MIN_VALUE, stringToInt.stringToInt("-2147483648"));
	}
}
