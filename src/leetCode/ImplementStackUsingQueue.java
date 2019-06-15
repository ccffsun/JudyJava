package leetCode;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;
    Queue<Integer> q3;
    Queue<Integer> qq;
    /**
     * Initialize your data structure here.
     */
    public ImplementStackUsingQueue() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
        this.q3 = new LinkedList<>();

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        q1.add(x);
        this.qq =this.setQueue();
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return qq.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        this.setQueue();
        return qq.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
    boolean isEmpty =qq.size()==0;
    return isEmpty;
    }


    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */


    private void move(Queue<Integer> outQ, Queue<Integer> inQ) {
        while (outQ.size() > 0) {
            inQ.add(outQ.poll());
        }
    }

    private Queue<Integer> setQueue() {
        while (q1.size()>0) {
            q2.add(q1.poll());
        }
        this.move(q2, q3);
        while (q1.size() > 0 || q3.size() > 0) {
            if (q1.size() == 0) {
                this.move(q3, q1);
                q2.add(q3.poll());
            } else if (q3.size() == 0) {
                this.move(q1, q3);
                q2.add(q1.poll());
            }
        }
        return q2;
    }
}

