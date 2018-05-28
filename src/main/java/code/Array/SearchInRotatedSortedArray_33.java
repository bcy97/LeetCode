package code.Array;

public class SearchInRotatedSortedArray_33 {

    public static void main(String[] args) {
        int[] nums = {3, 5, 1};
        System.out.println(search(nums, 3));
    }

    public static int search(int[] nums, int target) {
        return bin_search(nums, target, 0, nums.length - 1);
    }

    public static int bin_search(int[] nums, int target, int start, int end) {
        if (start > end || (start == end && nums[start] != target)) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        if ((nums[mid] > target && target >= nums[start])
                || (nums[mid] < nums[start] && ((target > nums[start] && target > nums[mid]) || (target < nums[start] && target < nums[mid])))
                || (nums[start] < nums[end] && target < nums[mid])) {
            return bin_search(nums, target, start, mid);
        } else {
            return bin_search(nums, target, mid + 1, end);
        }

    }

}
