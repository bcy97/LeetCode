package code.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum_15 {
    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int target = -nums[i];
            int j = i + 1, k = n - 1;
            while (j < k) {
                int temp = nums[j] + nums[k];
                if (temp == target) {
                    List<Integer> item = new ArrayList<>();
                    item.add(nums[i]);
                    item.add(nums[j]);
                    item.add(nums[k]);
                    if (!result.contains(item)) {
                        result.add(item);
                    }
                    break;
                } else if (temp < target) {
                    j++;
                } else {
                    k++;
                }
            }
        }
        return result;
    }

}
