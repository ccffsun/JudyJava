package leetCode;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public class IntersectionOfTwoLinkedList {
    //recursive
    /*
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) return headA;
        while (headA != null && headB != null) {
            if (headA.next!=null&&headB.next!=null&&getIntersectionNode(headA, headB) == getIntersectionNode(headA.next, headB.next)) {
                headA = headA.next;
                headB = headB.next;
            }
            else if (headB.next!=null&&getIntersectionNode(headA, headB) == getIntersectionNode(headA, headB.next)) {
                return headA;
            }
            else if (headA.next!=null&&getIntersectionNode(headA, headB) == getIntersectionNode(headA.next, headB)) {
                return headB;
            }
        }
        return null;
    }

     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = length(headA);//length() method :know the length of the list
        int b = length(headB);
        int n = a - b;
        if (n > 0) {
            for (int i = n - 1; i >= 0; i--) {
                headA = headA.next;
            }
        }
        if (n < 0) {
            for (int i = -n - 1; i >= 0; i--) {
                headB = headB.next;
            }
        }
        while (headA != null && headB != null && headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }
            if(headA==null||headB==null){
                return null;
            }
            else return headA;
    }
    /* the method of length()
    private int length(ListNode node) {
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }

     */
}
