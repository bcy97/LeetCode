package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSumMyself(int[] nums) {
		
		List<List<Integer>> result = new ArrayList<>();
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length-2; i++) {
			
			HashMap<Integer, Integer> temp = new HashMap<>();
			int xi = -1*nums[i];
			
			for (int j = i; j < nums.length; j++) {
				if (temp.get(nums[j])!=null) {
					ArrayList<Integer> res = new ArrayList<>();
					res.add(-1*xi);
					res.add(temp.get(nums[j]));
					res.add(nums[j]);
					if (!result.contains(res)) {
						result.add(res);
					}
				}
				
				temp.put(xi-nums[j], nums[j]);
			}
		}
		
		return result;
	}
}
