package leetCode;

//给定一个正整数s, 判断一个数组arr中，是否有一组数字加起来等于s。
public class TargetSumOfArray {
    public boolean targetSumOfArray(int[] arr, int s) {
        int n = arr.length-1;
        boolean[][] subset = new boolean[n+1][s+1];
        int i,j;

        for(i=0;i<n+1;i++){
            for(j=1;j<s+1;j++)
            if(i==1 && j==arr[0]) return true ;
            else if(i==0 && j!=arr[0]) return false;
            else if(j==0) return true;
            else if(arr[i]>j) subset[i][j]=subset[i-1][j];
            else subset[i][j]=subset[i-1][j-arr[i]]||subset[i-1][j];
        }
        return subset[n][s];

    }
}