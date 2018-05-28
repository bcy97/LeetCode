package code.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchForARange_34 {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(searchRange(nums, target));
    }

    public static int[] searchRange(int[] nums, int target) {

        int index = binary_search(nums, target, 0, nums.length - 1);

        int i = index, j = index;
        while (i > 0 && nums[i - 1] == target) i--;
        while (j < nums.length - 1 && nums[j + 1] == target) j++;
        int[] result = new int[]{i, j};
        return result;
    }

    public static int binary_search(int[] nums, int target, int start, int end) {

        if (start > end || (start == end && nums[start] != target)) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return binary_search(nums, target, mid + 1, end);
        } else {
            return binary_search(nums, target, start, mid);
        }

    }
}
