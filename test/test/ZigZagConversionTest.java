package test;

import org.junit.Test;
import static org.junit.Assert.*;

import code.ZigZagConversion;

public class ZigZagConversionTest {

	@Test
	public void testConversion1(){
		ZigZagConversion conversion = new ZigZagConversion();
		assertEquals("PAHNAPLSIIGYIR", conversion.conversion("PAYPALISHIRING", 3));
	}
	
	
}
