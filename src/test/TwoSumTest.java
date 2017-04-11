package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.TwoSum;

public class TwoSumTest {

	@Test
	public void testTwoSumLowest(){
		TwoSum twoSum = new TwoSum();
		int[] nums = {1, 3, 1, 5, 4};
		int[] trueResult = {3,4};
		int[] result = twoSum.twoSumLowest(nums, 9);
		assertArrayEquals(trueResult, result);
	}
	
	@Test
	public void testTwoSumHigh(){
		TwoSum twoSum = new TwoSum();
		int[] nums = {2,7,11,15};
		int[] trueResult = {0,1};
		int[] result = twoSum.twoSumHigh(nums, 9);
		assertArrayEquals(trueResult, result);
	}
}
