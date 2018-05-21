package code.Array;

import java.util.HashMap;

public class TwoSum_1 {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> temp = new HashMap<>();

        int n = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            if (temp.containsKey(nums[i])) {
                result[0] = temp.get(nums[i]);
                result[1] = i;
                break;
            } else {
                temp.put(target - nums[i], i);
            }
        }

        return result;
    }
}
