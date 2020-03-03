package Algorithmic;

public class HeapSort {

    public void heapSort(int[] array) {
        int size = array.length;

        //1.bulid heap
        for(int i = size / 2 - 1; i >= 0; i--) {
            heapify(array, size, i);  // O(n)
        }
        /*

        k level full tree: k=4;
        n total number of nodes: 2^k - 1;
        S = 1*2^(k-2) + 2*2^(k-3)+3*2^(k-4)+....(k-2)*2+(k-1)*2
        2S - S = O(2 * 2^k) = O(2^k) = O (n)
        for loop + heapify =>  O(n)
        heapify = percolateDown => O(log n)

         */
        //2.swap the max element to the end of the array, cut the size by 1 every time, then percolateDown(0)
        for(int i = size - 1; i >= 0; i--) {
            swap (array, i , 0);

            heapify(array, i, 0);
        }
    }
        //3.percolateDown(int[] nums, int heapsize, int k)
    public void heapify (int[] nums, int heapSize, int k) {  //heapify() == percolateDown()
        int currentIdx = k;
        int leftChildIdx = 2*k + 1;
        int rightChildIdx = 2*k + 2;

        if (leftChildIdx < heapSize && nums[leftChildIdx] > nums[currentIdx]) {
            currentIdx = leftChildIdx;
        }
        if(rightChildIdx < heapSize && nums[rightChildIdx] > nums[currentIdx]) {
            currentIdx = leftChildIdx;
        }
        if(currentIdx != k) {
            swap ( nums, currentIdx, k);
            heapify(nums, heapSize, currentIdx);
        }
    }

    public void swap (int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
