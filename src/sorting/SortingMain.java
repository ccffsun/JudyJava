package sorting;

public class SortingMain {
    public static void main(String[] args){
        int[] array = new int[]{3,2,5,6,0,1};
        //Quick sort
        QuickSort qs = new QuickSort();
        qs.quickSort(array,0,5);
        for(int i: array){
            System.out.print(i+" ");
        }
    }
}
