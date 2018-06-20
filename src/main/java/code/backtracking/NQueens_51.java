package code.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NQueens_51 {

    public static void main(String[] args) {

        solveNQueens(4);
    }

    public static List<List<String>> solveNQueens(int n) {

        short[][] queens = new short[n][n];

        List<List<String>> result = new ArrayList<>();

        placeQueen(queens, 0, result);

        System.out.println(result);
        return result;
    }

    public static void placeQueen(short[][] queens, int row, List<List<String>> result) {

        if (row == queens.length) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < row; i++) {
                String rows = "";
                for (int j = 0; j < row; j++) {
                    rows += queens[i][j] == 0 ? "." : "Q";
                }
                solution.add(rows);
            }
            result.add(solution);
        }

        short[][] temp = queens.clone();

        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens.length; j++) {
                temp[row][j] = 0;
            }
            temp[row][i] = 1;
            if (safe(queens, row, i)) {
                placeQueen(temp, row + 1, result);
            }
        }

    }

    public static boolean safe(short[][] queens, int row, int col) {
        int step = 1;
        while (row - step >= 0) {
            if (queens[row - step][col] == 1)                //中上
                return false;
            if (col - step >= 0 && queens[row - step][col - step] == 1)        //左上
                return false;
            if (col + step < queens.length && queens[row - step][col + step] == 1)        //右上
                return false;

            step++;
        }
        return true;
    }

}
