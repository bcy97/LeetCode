package code.Array;

public class SpiralMatrixII_59 {

    public static void main(String[] args) {
        int[][] rsult = new SpiralMatrixII_59().generateMatrix(6);
        for (int i = 0; i < rsult.length; i++) {
            for (int j = 0; j < rsult.length; j++) {
                System.out.print(rsult[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] generateMatrix(int n) {

        int[][] result = new int[n][n];

        int x = 1, model = 1;

        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                result[i][j] = x;
                x++;
            }
            for (int j = i; j < n - i - 1; j++) {
                result[j][n - i - 1] = x;
                x++;
            }
            for (int j = n - i - 1; j > i; j--) {
                result[n - i - 1][j] = x;
                x++;
            }
            for (int j = n - i - 1; j > i; j--) {
                result[j][i] = x;
                x++;

            }
        }

        if (n % 2 == 1) {
            result[n / 2][n / 2] = x;
        }

        return result;

    }
}
