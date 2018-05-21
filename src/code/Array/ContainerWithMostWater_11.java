package code.Array;

public class ContainerWithMostWater_11 {

    public static void main(String[] args) {
        int[] height = {3, 2, 1};
        System.out.println(maxArea(height));
    }

    /**
     * 使用双指针
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int maxArea = 0;

        while (i < j) {
            int area = (j - i) * (height[i] > height[j] ? height[j--] : height[i++]);
            maxArea = area > maxArea ? area : maxArea;
        }

        return maxArea;
    }


}
