package code.Array;

public class BestTimetoBuyandSellStock_121 {

    public static void main(String[] args) {
        int[] prices = {};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        if (prices.length == 0) {
            return 0;
        }

        int max = 0;
        int diff = 0;
        int in = prices[0];
        for (int i = 1; i < prices.length; i++) {
            diff = prices[i] - in;
            if (prices[i] - in < 0) {
                in = prices[i];
                diff = 0;
            }
            if (diff > max) {
                max = diff;
            }
        }

        return max;
    }
}
