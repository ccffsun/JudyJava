package leetCode;

public class Node2 {  //doubly linked list
    public int val;
    public Node2 prev;
    public Node2 next;
    public Node2 child;

    public Node2() {}

    public Node2(int _val,Node2 _prev,Node2 _next,Node2 _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
}
