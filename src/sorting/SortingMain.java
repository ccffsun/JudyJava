package sorting;

public class SortingMain {
    public static void main(String[] args){
        int[] quickArray = new int[]{3,2,5,6,0,1};
        //Quick sort
        QuickSort qs = new QuickSort();
        qs.quickSort(quickArray,0,5);
        for(int i: quickArray){
            System.out.print(i+" ");
        }
        System.out.println("---");
        int[] mergeArray = new int[]{7,3,4,6,99,8,2,1,0};
        MergeSort ms = new MergeSort();
        ms.mergeSort(mergeArray);
        for(int i: mergeArray){
            System.out.print(i+" ");
        }
    }
}
