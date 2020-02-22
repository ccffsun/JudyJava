package Algorithmic;

public class BinarySearch {
    public boolean binarySearchRecursive (int[]array ,int left, int right, int x){
        if(left > right){
            return false;
        }
        int mid = left + (right - left)/2;
        if(array[mid] == x){
            return true;
        }else if( array[mid]> x){
            binarySearchRecursive(array,left, mid-1,x);
        }else{
            binarySearchRecursive(array,mid+1,right,x);
        }
       return false;
    }
}
