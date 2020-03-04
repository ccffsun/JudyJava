package dataStructure;
/*
PriorityQueue methods
boolean   offer()           O(log n)
E         peek()            O(1)
E         poll()            O(log n)
          remove()          O(log n)
boolean   remove(object)    O(n)
Comparator comparator()
 */


import java.util.PriorityQueue;

public class MinHeapPQ {
     PriorityQueue <Integer> minPQ;
     public MinHeapPQ(){
         minPQ = new PriorityQueue<>();
     }
/*
     maxPQ:                                     Collections.reverseOrder()
         maxPQ = new PriorityQueue<Integer>(10, new Comparator<Integer>()
                @Override
                public int compare(Integer a, Integer b) {
                return b-a;
                }
         });
 }

 */
     public void insert(int[] x) {
         for(int i = 0; i < x.length; i++) {
             minPQ.offer(x[i]);
         }
     }

     public int peek() {
         return minPQ.peek();
     }

     public int extractMin() {
         return minPQ.poll();
     }

     public int getSize(){
         return minPQ.size();
     }

     public void print() {
         System.out.println(minPQ);
     }
}
