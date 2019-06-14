package leetCode;

import java.util.EmptyStackException;
import java.util.Stack;

    public class ImplementQueueUsingStack {
    private Stack<Integer > input  =null;
    private Stack<Integer> output=null;
    /** Initialize your data structure here. */
    public void MyQueue() {
        input=new Stack<>();
        output=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!output.empty()) {
            input.push(output.pop());
        }
        input.push(x);
        while (!input.empty()){
            output.push(input.pop());
        }

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
         return output.pop();

    }

    /** Get the front element. */
    // try {
    //            s.pop();
    //         } catch (EmptyStackException e) {
    //         }
    public int peek() {
        return output.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
    return output.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
