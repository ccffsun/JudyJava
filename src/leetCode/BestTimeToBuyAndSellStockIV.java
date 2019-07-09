package leetCode;
//Say you have an array for which the ith element is the price of a given stock on day i.
//
//Design an algorithm to find the maximum profit. You may complete at most k transactions.
//
//Note:
//You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
//
//Example 1:
//
//Input: [2,4,1], k = 2
//Output: 2
//Explanation: Buy on day 1 (price = 2) and sell on day 2 (price = 4), profit = 4-2 = 2.
//Example 2:
//
//Input: [3,2,6,5,0,3], k = 2
//Output: 7
//Explanation: Buy on day 2 (price = 2) and sell on day 3 (price = 6), profit = 6-2 = 4.
//             Then buy on day 5 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.

//k transactions
public class BestTimeToBuyAndSellStockIV {
    //int [i][j]hold means when hold a stock the max profit of ith day and j times transactions
//int [i][j]unhold means when don't hold stock the max profit of ith day and j times transactions
//hold[i][j]=max{hold[i-1][j],unhold[i-1][j]-prices[i]}
//unhold[i][j]=max{hold[i-1][j-1]+prices[i],unhold[i-1][j]}
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int i, j;
        BestTimeToBuyAndSellStockII bt=new BestTimeToBuyAndSellStockII();
        if (k > n / 2) return  bt.maxProfit2(prices);
        //new hold and uphold
        int[][] hold = new int[n][k + 1];
        int[][] unhold = new int[n][k + 1];
        //initial hold and uphold
        hold[0][0] = -prices[0];//buy one stock on the first day
        unhold[0][0] = 0;//do nothing the first day
        for (i = 1; i < n; i++) { //i:1->n-1 j:0
            hold[i][0] = Math.max(hold[i - 1][0], -prices[i]);
            unhold[i][0] = 0;
        }
        for (j = 1; j <= k; j++) {//i:0 j:1->k
            hold[0][j] = -prices[0];
            unhold[0][j] = 0;
        }
        //
        for (i = 1; i < n; i++) {
            for (j = 1; j <= k; j++) {
                hold[i][j] = Math.max(hold[i - 1][j], unhold[i - 1][j] - prices[i]);
                unhold[i][j] = Math.max(hold[i - 1][j - 1] + prices[i], unhold[i - 1][j]);
            }
        }
        return Math.max(hold[n - 1][k], unhold[n - 1][k]);
    }

}