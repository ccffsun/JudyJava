package leetCode;

//Say you have an array for which the ith element is the price of a given stock on day i.
//
//Design an algorithm to find the maximum profit. You may complete at most two transactions.
//
//Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
//
//Example 1:
//
//Input: [3,3,5,0,0,3,1,4]
//Output: 6
//Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
//             Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
//Example 2:
//
//Input: [1,2,3,4,5]
//Output: 4
//Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
//             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
//             engaging multiple transactions at the same time. You must sell before buying again.
//Example 3:
//
//Input: [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transaction is done, i.e. max profit = 0.
public class BestTimeToBuyAndSellStockIII {
    public int maxProfit(int[] prices) {
        BestTimeToBuyAndSellStockIV bt4 = new BestTimeToBuyAndSellStockIV();
        int maxprof = bt4.maxProfit(2, prices);
        return maxprof;
    }
    public int maxProfit2(int[] prices){
        //state0 means have no stock
        //state1 means from nothing to have a stock(money change:-prices[i])
        //state2 means from state1 to sell the stock(money change:state1+prices[i])
        //state3 means from state2 to buy the stock(money change:state2-prices[i])
        //state4 means from state3 to sell the stock(money change:state3+prices[i])
        //however on the every state you can hold the stock or don't buy stock to keep a max profit
        //so use Math.max to know which we should do ? do nothing : buy : sell
        //buy stock may cause negative profit so s1,s3 can't be initialized to 0;s1,s3=Integer.MIN_VALUE
        //sell stock bring money to the pocket ,so positive, s2,s4initialized to 0
        int s1=Integer.MIN_VALUE;//buy1
        int s2=0;//sell1
        int s3=Integer.MIN_VALUE;//buy2
        int s4=0;//sell2
        for(int i=0;i<prices.length;i++){
            s1=Math.max(s1,-prices[i]);
            s2=Math.max(s2,s1+prices[i]);
            s3=Math.max(s3,s2-prices[i]);
            s4=Math.max(s4,s3+prices[i]);
        }
        return Math.max(0,s4);
    }
}