package code;

public class MaximumSubarray_53 {

    public static void main(String[] args) {
        int[] nums = {-2, -1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
