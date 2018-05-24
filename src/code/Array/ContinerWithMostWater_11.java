package code.Array;

public class ContinerWithMostWater_11 {

    public int solutionMyself(int[] height) {
        int pr = height.length - 1, pl = 0;
        int max = 0, bottle_height = 0;
        while (pl < pr) {
            bottle_height = height[pl] < height[pr] ? height[pl++] : height[pr--];
            max = (bottle_height * (pr - pl + 1)) > max ? (bottle_height * (pr - pl + 1)) : max;
        }

        return max;
    }

    public static void main(String[] args) {

    }

    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;
        while (i < j) {
            int area = (j - i) * (height[i] > height[j] ? height[i++] : height[j--]);
            max = area > max ? area : max;
        }
        return max;
    }
}
