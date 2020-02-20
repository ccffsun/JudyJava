package sorting;

public class QuickSort {
    public void quickSort(int[] array, int left, int right){
        if(array == null || left >= right ){
            return;
        }
        int pivot = array [(left + right)/2];
        int index = partition (array, left, right, pivot);
        quickSort(array,left,index-1);
        quickSort(array, index, right);
    }
    public static int partition (int[] array, int left, int right, int pivot){
       while(left < right) {

           while (array[left] < pivot) {
               left++;
           }
           while (array[right] > pivot) {
               right--;
           }
           if (left <= right) {
               swap(array, left, right);
               left++;
               right--;
           }
       }
       return left;
    }

    public static void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
