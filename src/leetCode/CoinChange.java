package leetCode;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] f = new int[amount + 1];
        int n = coins.length;
        f[0] = 0;
        int i, j;
        for (i = 1; i <= amount; i++) {
            f[i] = Integer.MAX_VALUE;
            for (j = 0; j < n; j++) {
                if (i >= coins[j] && f[i - coins[j]] != Integer.MAX_VALUE) {
                    f[i] = Math.min(f[i - coins[j]]+1, f[i]);
                }
            }
        }
        if(f[amount]==Integer.MAX_VALUE){
            f[amount]=-1;
        }
        return f[amount];
    }
}

//minValue -mv
//mv=max
//mv=min(f[i-2]+1,mv)
//mv=min(f[i-5]+1,mv)
//mv=min(f[i-7]+1,mv)
//f[i]=mv
//
//f[i]=max
//for(j=0;j<a.length;j++){
// f[i]=min(f[i-a[j]+1,f[i])