package ood.DuckCompare;

public class DuckSort {

    public static void sort (Object[] a){
        Object aux[] = (Object[])a.clone();
        mergeSort(aux, a,0,a.length,0);
    }

    private static void mergeSort(Object scr[], Object dest[], int low, int high, int off){
        for(int i = low;i < high;i++)
            for (int j = i; j > low && ((Comparable) dest[j - 1]).compareTo((Comparable) dest[j]) > 0; j--) {
                swap(dest, j, j - 1);
            }
    }

    public static void swap(Object[] array, int left, int right){
        Object temp = array[left];
        array[left] = array[right];
        array[right] =temp;
    }
}
