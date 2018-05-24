package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContinerWithMostWater11Test {

	@Test
	public void test() {
		ContinerWithMostWater_11 continer = new ContinerWithMostWater_11();
		int[] height = {1,2,3,4};
		assertEquals(4, continer.solutionMyself(height));
	}

}
