package code.Array;

import java.util.Arrays;

public class MergeSortedArray_88 {

    public static void main(String[] args) {

    }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0 && k >= 0) {
            
        }
    }
}
