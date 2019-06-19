package leetCode;

public class MaxSumOfNoAdjectElement {
    public int maxSum(int []arr , int n){
        int[]opt;
        if (arr.length==0) return 0;
        else {
            opt = new int[arr.length];
            int i;
            for(i=0;i<arr.length;i++){
                if(i==0) opt[i]=arr[0];
                else if(i==1) opt[i]=Math.max(arr[0],arr[1]);
                else {
                    opt[i]=Math.max(opt[i-2]+arr[i],opt[i-1]);
                }
            }
        }
        return opt[n];
    }
}
