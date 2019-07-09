package leetCode;

public class BestTimeToBuyAndSellStockIV {
//int [i][j]hold means when hold a stock the max profit of ith day and j times transactions
//int [i][j]unhold means when don't hold stock the max profit of ith day and j times transactions
//hold[i][j]=max{hold[i-1][j],unhold[i-1][j]-prices[i]}
//unhold[i][j]=max{hold[i-1][j-1]+prices[i],unhold[i-1][j]}
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int i,j;
        if (k > n / 2) return maxp(prices);
        //new hold and uphold
        int [][]hold=new int[n][k+1];
        int [][]unhold=new int[n][k+1];
        //initial hold and uphold
        hold[0][0]=-prices[0];//buy one stock on the first day
        unhold[0][0]=0;//do nothing the first day
        for(i=0;i<n;i++){
            hold[i][0]=Math.max(hold[i-1][0],-prices[i]);
            unhold[i][0]=0;
        }
        for(j=0;j<=k;j++){
            hold[0][j]=-prices[0];
            unhold[0][j]=0;
        }
        //
        for(i=1;i<n;i++){
            for(j=1;j<=k;j++){
                hold[i][j]=Math.max(hold[i-1][j],unhold[i-1][j]-prices[i]);
                unhold[i][j]=Math.max(hold[i-1][j-1]+prices[i],unhold[i-1][j]);
            }
        }
        return Math.max(hold[n-1][k],unhold[n-1][k]);
    }

    private int maxp(int[] a) {
        int maxprof = 0;
        for (int i = 0; i <a.length - 1; i++) {//i+1<prices.length---> i<lengths-1
            if (a[i] < a[i + 1]) {
                maxprof = maxprof + a[i + 1] - a[i];
            }

        }
        return maxprof;
    }
}