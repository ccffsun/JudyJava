package leetCode;


import dataStructure.HashMapTest;

import java.util.HashMap;

//DP
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n<2) return 1;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /*recursion + hashMap to do the memoization   compare to  dp
     1.new a hashMap<Integer,Integer>
     2.containsKey(n)------get(n)
     3.put the result to parameter(in this problem "result"
     4.base cases
    if(n <= 0) return 0;
    if(n == 1) return 1;
    if(n == 2) return 2;
     5.recurrence relation
     f(n)=f(n-1)+f(n-2)
     6.use if....else to connect the base cases and recurrence relation
     7.return result
    */


    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    public int climbStairsII(int n){
        if(map.containsKey(n)){
            return map.get(n);
        }
        int result;
        //if...else
        if(n<=2){
            result=n;
        }else {
            result = climbStairsII(n - 1) + climbStairsII(n - 2);
        }
        //keep the result in the map
        map.put(n,result);
        return result; //return the result
    }
}
