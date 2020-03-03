package dataStructure;

public class MaxHeap {
    /*
Max Heap methods:
constructor
creatHeap(int[] array)
insert(int ele)
poll()
percolateUp(int k)
percolateDown(int k)
isEmpty()
heapSize()

    */

    int[] array;
    int capacity;
    int size;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        array = new int[capacity + 1];
    }

    public void createHeap(int[] nums) {
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                insert(nums[i]);
            }
        }
    }

    public void insert(int ele) {
        if (size == capacity) {
            System.out.println("Heap is full!!!");
        }
        int idx = ++size;
        array[size] = ele;
        percolateUp(idx);
    }

    public void percolateUp(int k) {
        int currentIdx = k;
        int parentIdx = k / 2;

        while (currentIdx > 0 && array[parentIdx] < array[currentIdx]) {
            swap(array, parentIdx, currentIdx);
            currentIdx = parentIdx;
            parentIdx = parentIdx / 2;
        }
    }

    public int poll() {
        int max = array[1];
        array[1] = array[size];
        array[size] = 0;
        percolateDown(1);
        return max;
    }

    public void percolateDown(int k) {

        int currentIdx = k;
        int leftChildIdx = 2 * k;
        int rightChildIdx = 2 * k + 1;
        if (leftChildIdx < heapSize() && array[leftChildIdx] > array[currentIdx]) {
            currentIdx = leftChildIdx;
        }
        if (rightChildIdx < heapSize() && array[rightChildIdx] > array[currentIdx]) {
            currentIdx = rightChildIdx;
        }
        if (currentIdx != k) {
            swap(array, currentIdx, k);
        }
        percolateDown(currentIdx);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int heapSize() {
        return size;
    }

    public void swap(int[]array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}