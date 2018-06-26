package code.dynamicprogramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence_300 {

    public static void main(String[] args) {
        System.out.println(new LongestIncreasingSubsequence_300().lengthOfLIS(new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6}));
    }

    public int lengthOfLIS(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int[] len = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            len[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && len[i] < len[j] + 1) {
                    len[i] = len[j] + 1;
                }
            }
        }

        Arrays.sort(len);

        return len[nums.length - 1];
    }
}
