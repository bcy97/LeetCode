package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.ContinerWithMostWater;

public class ContinerWithMostWaterTest {

	@Test
	public void test() {
		ContinerWithMostWater continer = new ContinerWithMostWater();
		int[] height = {1,2,3,4};
		assertEquals(4, continer.solutionMyself(height));
	}

}
