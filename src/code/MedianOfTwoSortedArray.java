package code;

public class MedianOfTwoSortedArray {

	/**
	 * 先将两个数组合成一个，用下标指向中间那个。时间复杂度O(n),空间复杂度O(n)
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public double medianMyself(int [] nums1  , int [] nums2){
		
		int i = 0,j = 0;
		int[] newNums = new int[nums1.length+nums2.length];
		int k = 0;
		
		while(i<nums1.length&&j<nums2.length){

			if (nums1[i]<nums2[j]) {
				newNums[k] = nums1[i];
				i++;
			}else {
				newNums[k] = nums2[j];
				j++;
				
			}
			k++;
		}
		
		while (i<nums1.length) {
			newNums[k] = nums1[i];
			k++;
			i++;
		}
		
		while (j<nums2.length) {
			newNums[k] = nums2[j];
			k++;
			j++;
		}
		
		return newNums.length%2==0 ? (double)(newNums[newNums.length/2]+newNums[newNums.length/2-1])/2 : (double)newNums[newNums.length/2];
	}
	
	public double median(int[] nums1,int[] nums2) {
		
		int m = nums1.length;
		int n = nums2.length;
		int k = m+n;
		
		if (k%2==1) {
			return find(nums1, 0, m, nums2, 0, n, k/2+1);
		}else {
			System.out.println(k/2);
			System.out.println(find(nums1, 0, m, nums2, 0, n, k/2));
			System.out.println(find(nums1, 0, m, nums2, 0, n, k/2+1));
			return (find(nums1, 0, m, nums2, 0, n, k/2)+find(nums1, 0, m, nums2, 0, n, k/2+1))/2;
		}
	}
	
	public double find(int[] nums1,int start1,int end1,int[] nums2,int start2,int end2,int kth){
		
		if (end1>end2) {
			return find(nums2, start2, end2, nums1, start1, end1, kth);
		}
		
		if (end1<=0) {
			return nums2[start2+kth-1];
		}
		
		if(kth==1){
			return Math.min(nums1[start1], nums2[start2]);
		}
		
		int pa = Math.min(kth/2, end1),pb = kth-pa;
		
		if (nums1[start1+pa-1]<nums2[start2+pb-1]) {
			return find(nums1, start1+pa, end1-pa, nums2, start2, end2, kth-pa);
		}else {
			return find(nums1, start1, end1, nums2, start2+pb, end2-pb, kth-pb);
		}
		
	}
}