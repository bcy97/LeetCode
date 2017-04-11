package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

import code.ThreeSum;

public class ThreeSumTest {

	@Test
	public void test() {
		int[] s = {-1, 0, 1, 2, -1, -4};
		ThreeSum threeSum = new ThreeSum();
		List<List<Integer>> result = new ArrayList<>();
		ArrayList<Integer> result1 = new ArrayList<>();
		result1.add(-1);
		result1.add(0);
		result1.add(1);
		result.add(result1);
		ArrayList<Integer> result2 = new ArrayList<>();
		result2.add(-1);
		result2.add(-1);
		result2.add(2);
		result.add(result2);

		assertEquals(result, threeSum.threeSumMyself(s));
	}

}
