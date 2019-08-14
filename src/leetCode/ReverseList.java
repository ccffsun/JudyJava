package leetCode;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode curr= head ;
        ListNode prev =null;

        while (curr!=null){
            ListNode temp =curr.next;
            curr.next=prev;
            prev = curr;
            curr = temp ;
        }
        return prev;
    }


    public ListNode reverseListII(ListNode head){
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode temp=head.next;
        ListNode reverseRest = reverseListII(temp);
        temp.next=head;
        head.next=null;
        return reverseRest;
    }
}
