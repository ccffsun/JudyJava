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

         //recursion
    public ListNode reverseListII(ListNode head){
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode temp=head.next;
        ListNode reverseRest = reverseListII(temp);
        /*
        5 ->   4 ->   null
        temp   head
        4 ->   3 ->   null
        temp   head
        3 ->   2 ->   null
        temp   head


        reverseRest=5->4->3->2->null

         */
        temp.next=head;//why not reverseRest.next=head??
        head.next=null;

        //2->1->null

        return reverseRest;//return rest == return the whole list
    }

}
