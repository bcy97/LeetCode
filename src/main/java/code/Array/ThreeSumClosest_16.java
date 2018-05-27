package code.Array;

import java.util.Arrays;

public class ThreeSumClosest_16 {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 1, 55};
        System.out.println(threeSumClosest(nums, 3));
    }

    public static int threeSumClosest(int[] nums, int target) {

        int closest = nums[0] + nums[1] + nums[2];
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int temp = target - nums[i];

            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum == temp) {
                    return sum + nums[i];
                }
                if (Math.abs(temp - sum) < Math.abs(target - closest)) {
                    closest = sum + nums[i];
                }
//                while (j < k && nums[k] == nums[k - 1]) k--;
//                while (j < k && nums[j] == nums[j + 1]) j++;
                if (sum < temp) j++;
                if (sum > temp) k--;
            }
        }

        return closest;
    }
}
