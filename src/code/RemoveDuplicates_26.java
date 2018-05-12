package code;

public class RemoveDuplicates_26 {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int index = 0;
        int i = 0, j = 1;
        int n = nums.length;

        while (j < n) {
            if (nums[j] != nums[i]) {
                nums[++index] = nums[j];
                i = j;
            }
            j++;
        }


        return index + 1;
    }
}
