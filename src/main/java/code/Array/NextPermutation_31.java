package code.Array;

import java.util.Arrays;

public class NextPermutation_31 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        nextPermutation(nums);
    }

    /**
     * 自己实现的算法，击败35%。。。
     *
     * @param nums
     */
    public static void nextPermutation(int[] nums) {

        int i, n = nums.length;
        for (i = n - 1; i > 0; i--) {

            if (nums[i] > nums[i - 1]) {
                int min = i;
                for (int j = i + 1; j < n; j++) {
                    if (nums[j] > nums[i - 1] && nums[j] < nums[min]) {
                        min = j;
                    }
                }

                int temp = nums[min];
                nums[min] = nums[i - 1];
                nums[i - 1] = temp;
                break;
            }
        }

        Arrays.sort(nums, i, n);

    }

}
