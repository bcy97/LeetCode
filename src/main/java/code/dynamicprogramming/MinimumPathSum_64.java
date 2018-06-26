package code.dynamicprogramming;

public class MinimumPathSum_64 {

    public static void main(String[] args) {
        int[][] s = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        System.out.println(new MinimumPathSum_64().minPathSum(s));
    }

    public int minPathSum(int[][] grid) {

        int m = grid.length;
        if (m == 0) {
            return 0;
        }
        int n = grid[0].length;
        int[] min = new int[n];

        for (int i = 0; i < m; i++) {
            if (i == 0) {
                min[0] = grid[0][0];
                for (int j = 1; j < n; j++) {
                    min[j] = min[j - 1] + grid[i][j];
                }
            } else {
                min[0] = min[0] + grid[i][0];
                for (int j = 1; j < n; j++) {
                    min[j] = min(min[j - 1], min[j]) + grid[i][j];
                }
            }
        }

        return min[n - 1];
    }

    public int min(int a, int b) {
        return a < b ? a : b;
    }

}
