package leetCode;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersection {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        if(A==null||B==null||A.length==0||B.length==0){
            return new int[][]{};
        }

        List<int[]> ans= new ArrayList<>();
        int i=0,j=0;
        while(i<A.length && j<B.length){
            int start=Math.max(A[i][0],B[j][0]);
            int end=Math.min(A[i][1],B[j][1]);
            if(start<=end) ans.add(new int[]{start,end});
            if(A[i][1]>B[j][1]) j++;
            else i++;
        }
        int [][] res=new int[ans.size()][2];
        i=0;
        for(int []pair :ans){
            res[i++]=pair;
        }
        return res;
    }
}
