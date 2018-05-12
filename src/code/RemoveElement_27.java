package code;

public class RemoveElement_27 {

    public static void main(String[] args) {

        int[] nums = {2, 3};
        System.out.println(removeElement(nums, 2));
        nums[0] = 2;
        System.out.println(removeElement2(nums, 2));
    }

    /**
     * 双指针做法
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {

        int i = 0, j = nums.length - 1;

        if (nums.length == 1 && nums[0] == val) {
            return 0;
        }

        while (i <= j) {
            while (j >= i && nums[j] == val) {
                j--;
            }
            if (j < i) {
                break;
            }
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            }
            i++;
        }


        return j + 1;
    }

    /**
     * 一次遍历
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement2(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
