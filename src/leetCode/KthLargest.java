package leetCode;

import java.util.PriorityQueue;

public class KthLargest {
    final PriorityQueue<Integer> q;
    final int k;

    public KthLargest(int k, int[] a) {
        this.k = k;
        //new a k size PQ
        q = new PriorityQueue<>(k);
        for (int n : a)
            add(n);
    }
    //Java Priority Queue size is unbounded
    // but we can specify the initial capacity
    // at the time of it’s creation. When we add
    // elements to the priority queue,
    // it’s capacity grows automatically.
    public int add(int n) {
        if (q.size() < k)//
            q.offer(n);
        else if (q.peek() < n) {
            q.poll();
            q.offer(n);
        }
        return q.peek();
    }
}

