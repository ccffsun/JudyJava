package leetCode;

public class MergeSort {
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r) {
        //size of the two subarray
        int n1 = m - l + 1;
        int n2 = r - m;
        //creat two subarray
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }
        //merge two subarray
        //initial i,j
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    void sort(int[] arr, int l, int r) {
        //find the middle point of the array
        if (l < r) { //l<r is the recursion terminator
            int m = (l + r) / 2;
            //sort the first half and the second half
            sort(arr, l, m);
            sort(arr, m + 1, r);
            //merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}