package code.Array;

public class BestTimetoBuyandSellStockII_122 {
    public static void main(String[] args) {
        int[] prices = {1, 9, 6, 9, 1, 7, 1, 1, 5, 9, 9, 9};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int n = prices.length;
        int diff = 0;
        int sum = 0;
        int in = prices[0];
        for (int i = 0; i < n - 1; i++) {
            if (prices[i] > prices[i + 1]) {
                diff = prices[i] - in;
                sum += diff;
                in = prices[i + 1];
            }
        }

        if (prices[n - 1] >= prices[n - 2]) {
            sum += prices[n - 1] - in;
        }

        return sum;
    }
}
