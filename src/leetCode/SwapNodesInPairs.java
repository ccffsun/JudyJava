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

    //recursion

    public ListNode swapPairsII(ListNode head){
        if(head==null||head.next==null){
            return head;// 1.connect the prevs to the head 2. terminate the recursion
        }
        ListNode second=head.next;
        ListNode temp=head.next.next;// compare temp=second.next?
        head.next=swapPairsII(temp);
        second.next=head;
        return second;
    }
}
