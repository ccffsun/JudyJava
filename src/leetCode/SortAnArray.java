package leetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAnArray {
    public List<Integer>sortArray(int[] nums) {
     mergeSort(nums,0,nums.length-1);
     List<Integer> res=new ArrayList<Integer>();
     for(int a:nums){
         res.add(a);
     }
    return res;

    }

    public void mergeSort(int[] array, int l,int r){
        if(l<r){
            int m=(l+r)/2;
            mergeSort(array,l,m);
            mergeSort(array,m+1,r);
            merge(array,l,m,r);
        }
    }
    public void merge(int[]array,int l,int m,int r){
        int[] temp=array.clone();
        int left=l;
        int right=m+1;
        int k=l;
        while(left<=m||right<=r){
            if(left<=m && right<=r){
                if (temp[left] <= temp[right]) {
                    array[k]=temp[left];
                    left++;
                }
            }else if(left<=m){
                array[k]=temp[right];
                right++;
            }
            k++;
        }

    }
}
