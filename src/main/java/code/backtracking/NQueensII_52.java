package code.backtracking;

public class NQueensII_52 {

    private int count = 0;

    public static void main(String[] args) {
        System.out.println(new NQueensII_52().totalNQueens(8));
    }

    public int totalNQueens(int n) {

        short[] queens = new short[n];

        placeQueen(queens, 0);

        return count;
    }

    public void placeQueen(short[] queens, int row) {
        if (row == queens.length) {
            count++;
            return;
        }
        short[] temp = queens.clone();
        for (short i = 0; i < queens.length; i++) {
            temp[row] = i;
            if (safe(temp, row)) {
                placeQueen(temp, row + 1);
            }
        }
    }

    private boolean safe(short[] queens, int row) {

        for (int i = 0; i < row; i++) {
            if (queens[i] == queens[row] || Math.abs(row - i) == Math.abs(queens[row] - queens[i])) {
                return false;
            }
        }

        return true;
    }
}
