package leetCode;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElement {
    public List<Integer> findKClosestElement (int[] array, int k, int target) {
        int right = binarySearch(array, target);
        int left = right-1;
        for(int i = 0; i < k; i++) {
            if(left < 0) {
                right++;
            }
            else if(right > array.length) {
                left --;
            }
            else {
               if(Math.abs(array[left]-target) <= Math.abs(array[right]-target)) {
                   left--;
               }
               else {
                   right++;
               }
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i = left + 1; i< right; i++) {
            result.add(array[i]);
        }
        return result;
    }
    public int binarySearch (int[] array, int target) {
       if(array == null || array.length ==0 || target < array[0]) {
           return 0;
       }
       if(target > array.length-1) {
           return array.length;
       }
       int left = 0;
       int right = array.length-1;
       while (left < right-1) {
           int mid = left + (right - left)/2;
           if(array[mid] == target) {
               return mid;
           }else if(array[mid] < target){
                left = mid;
           }else{
               right = mid;
           }
       }
       if(array[left] >= target) return left;
       if(array[right] >= target) return right;
       return -1;
    }
}
