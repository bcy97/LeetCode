package code;

public class SearchInsertPosition_35 {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 0));
    }

    public static int searchInsert(int[] nums, int target) {

        //target<nums[0]
        if (target < nums[0]) {
            return 0;
        }

        //target>nums[-1]
        int n = nums.length;
        if (target > nums[n - 1]) {
            return n;
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] >= target)
                return i;
        }

        return -1;
    }
}
