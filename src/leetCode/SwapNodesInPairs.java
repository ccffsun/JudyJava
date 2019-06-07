package leetCode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {

        ListNode curr = head ;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        while (curr!=null && curr.next!=null){
            ListNode m= curr.next.next;
            ListNode first =curr.next;
            ListNode last = curr;
            prev.next= first;
            first.next=last;
            prev= last;
            curr =m;
        }
        prev.next=curr;
        return dummy.next;
    }
}
