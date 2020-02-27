package leetCode;

public class SearchInRotatedSortedArray {
    public int binarySearch (int[] array, int target, int left, int right) {
        if( array == null || array.length == 0){
            return -1;
        }
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(array[mid] == target) {
                return mid;
            }
            else if( array[mid] < target) {
                left = mid +1;
            }else {
                right = mid -1;
            }
        }
        return -1;
    }


    public int search(int[] array, int target) {
        int left = 0;
        int right =array.length - 1;
        int result;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(array[left] <= array[right]) {
                return binarySearch(array,target,left,right);

            }
            else if(array[left] > array[mid]) {
                result = binarySearch(array, target, mid+1, right);
                if(result >= 0) {
                    return result;
                } else {
                  right = mid;
                }
            }else{
                result = binarySearch(array, target, left, mid);
                if(result >= 0) {
                    return result;
                } else {
                    left = mid+1;
                }
            }
        }
        return -1;
    }
}
/*
How many times is a sorted array rotated ?
find k
 public int searchK(int[]array){

        int left = 0;
        int right = nums.length-1;
        int mid = left + (right - left)/2;
        int k;
        while (left <= right) {

            if(array[left] <= array[right]){
                k = left;
                return k;
            } else if(array[left] > array[mid]){
                right = mid;
            }else{
                left = mid +1;
            }
        }
    }
 */
