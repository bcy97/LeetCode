package code.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens_51 {

    public static void main(String[] args) {
//        solveNQueens_low(4);
        System.out.println(solveNQueens_high(4));
    }

    /**
     * beats12.5%
     *
     * @param n
     * @return
     */
    public static List<List<String>> solveNQueens_low(int n) {

        short[][] queens = new short[n][n];

        List<List<String>> result = new ArrayList<>();

        placeQueen_low(queens, 0, result);

        return result;
    }

    public static void placeQueen_low(short[][] queens, int row, List<List<String>> result) {

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
            return;
        }

        short[][] temp = queens.clone();

        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens.length; j++) {
                temp[row][j] = 0;
            }
            temp[row][i] = 1;
            if (safe_low(queens, row, i)) {
                placeQueen_low(temp, row + 1, result);
            }
        }

    }

    public static boolean safe_low(short[][] queens, int row, int col) {
        int step = 1;
        while (row - step >= 0) {
            if (queens[row - step][col] == 1)
                return false;
            if (col - step >= 0 && queens[row - step][col - step] == 1)
                return false;
            if (col + step < queens.length && queens[row - step][col + step] == 1)
                return false;

            step++;
        }
        return true;
    }

    /**
     * beats35.7%
     *
     * @param n
     * @return
     */
    public static List<List<String>> solveNQueens_high(int n) {
        List<List<String>> result = new ArrayList<>();

        short[] queens = new short[n];

        placeQueen_high(queens, 0, result);

        return result;
    }

    public static void placeQueen_high(short[] queens, int row, List<List<String>> result) {
        if (row == queens.length) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < row; i++) {
                String rows = "";
                for (int j = 0; j < row; j++) {
                    rows += queens[i] == j ? "Q" : ".";
                }
                solution.add(rows);
            }
            result.add(solution);
            return;
        }
        short[] temp = queens.clone();
        for (short i = 0; i < queens.length; i++) {
            temp[row] = i;
            if (safe_high(temp, row)) {
                placeQueen_high(temp, row + 1, result);
            }
        }
    }

    private static boolean safe_high(short[] queens, int row) {

        for (int i = 0; i < row; i++) {
            if (queens[i] == queens[row] || queens[i] - i == queens[row] - row || (queens[i] + i) == (queens[row] + row)) {
                return false;
            }
        }

        return true;
    }

}
