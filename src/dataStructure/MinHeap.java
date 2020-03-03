package dataStructure;

/*
1.Binary Heap has to be complete binary tree at all levels except the last level. This is called shape property.
2.All nodes are either greater than equal to (Max-Heap) or less than equal to (Min-Heap) to each of its child nodes. This is called heap property.
3.Implementation:

*Use array to store the data.
*Start storing from index 1, not 0.
*For any given node at position i:
*Its Left Child is at [2*i] if available.
*Its Right Child is at [2*i+1] if available.
*Its Parent Node is at [i/2]if available.
 */

import org.jetbrains.annotations.NotNull;

public class MinHeap {
   public int capacity;
   public int[] array;
   public int size;

   public MinHeap (int capacity) {
       this.capacity = capacity;
       array = new int[capacity + 1];  // why capacity + 1 ? store from index 1 not 0.
       size = 0;
   }
   public void createHeap ( int[] arrA) {
       if( arrA.length > 0) {
           for(int i = 0; i < arrA.length; i++) {
              insert(arrA[i]);
           }
       }
   }

   public void display () {
      for (int i = 1; i< array.length; i++) {  // why not i< array.length-1?  new int[capacity + 1]
          System.out.print(" "+array[i]);
      }
       System.out.println("");
   }

   public void insert (int x) {    //insert to the end of the array
       if(size == capacity) {
           System.out.println("Heap is full!");
           return;
       }
       size++;
       int idx = size; //int idx = ++size;
       array[idx] = x;
       percolateUp(idx);
   }
/*
All Insert Operations must perform the bubble-up operation(it is also called as up-heap, percolate-up, sift-up,
trickle-up, heapify-up, or cascade-up).
 */
   public void percolateUp (int pos) {
       int parentIdx = pos/2;
       int currentIdx = pos;
       while(currentIdx > 0 && array[parentIdx] > array[currentIdx]) {
           swap(parentIdx,currentIdx);
           currentIdx = parentIdx;
           parentIdx = parentIdx/2;
       }
   }

   public int poll(){
       int min = array[1];
       array[1] = array[size];
       array[size] = 0;
       percolateDown(1);
       size--;
       return min;
   }
    /*
    All delete operation must perform Sink-Down Operation ( also known as bubble-down, percolate-down, sift-down,
    trickle down, heapify-down, cascade-down).
     */
   public void percolateDown (int k) {
       int smallest = k;
       int leftChildIdx = 2*k;
       int rightChildIdx = 2*k+1;
       if(leftChildIdx < heapSize() && array[leftChildIdx] < array[smallest]) {   //why not size?
           smallest = leftChildIdx;
       }
       if(rightChildIdx < heapSize() && array[rightChildIdx] < array[smallest]) {
           smallest = rightChildIdx;
       }
       if(smallest != k){
           swap(k,smallest);
           percolateDown(smallest);
       }
   }

   public void swap (int a, int b){
       int temp = array[a];
       array[a] = array[b];
       array[b] = temp;
   }

   public  boolean isEmpty() {
       return size == 0;
   }

   public int heapSize() {
       return size;
   }
}
