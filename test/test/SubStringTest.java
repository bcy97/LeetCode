package test;

import org.junit.Test;
import static org.junit.Assert.*;
import code.SubString;

public class SubStringTest {

	@Test
	public void testSubStringMyself1(){
		SubString subString = new SubString();
		int result = subString.subStringMyself("pwwkew");
		assertEquals(3, result);
	}
	
	@Test
	public void testSubStringMyself2(){
		SubString subString = new SubString();
		int result = subString.subStringMyself("bbbb");
		assertEquals(1, result);
	}
	
}
