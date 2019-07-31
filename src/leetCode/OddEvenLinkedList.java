package leetCode;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode join=even;

        while(even!=null&&even.next!=null) {
            odd.next = even.next;
            odd = even.next;
            even.next = odd.next;
            even = odd.next;
        }
        odd.next=join;
        return head;
    }
}
