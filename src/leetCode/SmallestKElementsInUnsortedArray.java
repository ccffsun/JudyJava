package leetCode;

/*
Find the k smallest numbers in an unsorted array A. The returned numbers should
be in ascending order.
Assumptions
 A is not null
 k is  >= 0 and smaller than or equal to size of A
 Return
 an array with size K containing the K smallest numbers in ascending order

 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class SmallestKElementsInUnsortedArray {
// minHeap
    public int[] kSmallest( int[] array, int k) {
        if(array == null || array.length ==0) {
            return new int[0];
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < array.length; i++) {
            minHeap.offer(array[i]);
        }
        int[] result = new int[k];
        for(int j=0; j< k;j++) {
            result[j] = minHeap.poll();
        }
        return result;
    }
    //maxHeap
    public int[] kSmallest2( int[] array, int k) {
        if(array == null || array.length == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               if(o1.equals(o2)){
                   return 0;
               }
               return o1>o2? -1:1;
            }
        });//Collections.reverseOrder()
        for(int i = 0; i< array.length; i++) {
            if(i < k) {
                maxHeap.offer(array[i]);
            }else if(array[i] < maxHeap.peek()){
                maxHeap.poll();
                maxHeap.offer(array[i]);
            }
        }
        int[] result = new int[k];
        for(int i=k-1;i>=0;i--){
            result[i] = maxHeap.poll();
        }
        return result;
    }
}
