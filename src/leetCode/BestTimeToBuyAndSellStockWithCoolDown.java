package leetCode;
//Say you have an array for which the ith element is the price of a given stock on day i.
//
//Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times) with the following restrictions:
//
//You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
//After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
//Example:
//
//Input: [1,2,3,0,2]
//Output: 3
//Explanation: transactions = [buy, sell, cooldown, buy, sell]

public class BestTimeToBuyAndSellStockWithCoolDown {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) {
            return 0;
        } else {
            int i;//0->n-1
            int k;//0,1  k=0 means can not do the transaction,k=1 means can do the transaction
            //new hold and unhold
            int[][] hold = new int[n][2];
            int[][] unhold = new int[n][2];
            //initial
            hold[0][1] = -prices[0];
            unhold[0][1] = 0;
            hold[1][1] = Math.max(-prices[0], -prices[1]);
            unhold[1][1] = 0;
            //
            for (i = 2; i < n; i++) {
                k = 1;
                hold[i][k] = Math.max(hold[i - 1][1], unhold[i - 2][1] - prices[i]);
                unhold[i][k] = Math.max(hold[i - 1][1] + prices[i], unhold[i - 1][1]);
            }
            return Math.max(hold[n - 1][1], unhold[n - 1][1]);
        }
    }
}
