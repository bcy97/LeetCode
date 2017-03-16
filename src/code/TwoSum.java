package code;

import java.util.HashMap;

public class TwoSum {
	
	//暴力解法 时间复杂度O(n^2)
	public int[] twoSumLowest(int[] nums, int target) {
		
		for(int i = 0 ; i < nums.length ; i++){
			for(int j = i+1 ; j<nums.length ; j++){
				if(nums[i]+nums[j] == target){
					int[] result = new int[2];
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return null;
	}
	
	//高级解法
	public int[] twoSumHigh(int[] nums, int target) {
		
		HashMap<Integer, Integer> numbers = new HashMap<>();
		
		//遍历一次数据
		for (int i = 0; i < nums.length; i++) {
			//如果target-i不为空则返回
			if (numbers.get(nums[i])!=null) {
				int[] result = { numbers.get(nums[i]) , i };
				return result;
			}
			
			numbers.put(target-nums[i], i);
		}
		return null;
		
	}
	
	
}
