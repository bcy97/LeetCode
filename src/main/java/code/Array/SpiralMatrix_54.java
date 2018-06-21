package code.Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
    public static void main(String[] args) {
        System.out.println(new SpiralMatrix_54().spiralOrder(new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        }));
    }

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        if (m == 0) {
            return result;
        }
        int n = matrix[0].length;
        if (n == 1) {
            for (int i = 0; i < m; i++) {
                result.add(matrix[i][0]);
            }
            return result;
        }

        //1 →,2 ↓,3 ←,4 ↑
        int model = 1;

        int row = 0, col = 0;
        int bl = 0, br = n - 1, bt = 0, bd = m - 1;
        for (int i = 0; i < m * n; i++) {
            switch (model) {
                case 1:
                    result.add(matrix[row][col]);
                    col++;
                    if (col == br) {
                        model = 2;
                        bt++;
                    }
                    break;
                case 2:
                    result.add(matrix[row][col]);
                    row++;
                    if (row == bd) {
                        model = 3;
                        br--;
                    }
                    break;
                case 3:
                    result.add(matrix[row][col]);
                    col--;
                    if (col == bl) {
                        model = 4;
                        bd--;
                    }
                    break;
                case 4:
                    result.add(matrix[row][col]);
                    row--;
                    if (row == bt) {
                        model = 1;
                        bl++;
                    }
            }
        }

        return result;
    }
}
