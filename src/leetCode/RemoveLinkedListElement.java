package leetCode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
        ListNode m;
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        while (curr!=null){
            while(curr!=null&&curr.val==val){
                curr=curr.next;
            }
            if(curr!=null){
                m=curr.next;
                prev.next=curr;
                prev=curr;
                curr=m;
            }
            else prev.next=curr;
        }
        return dummy.next;
    }
}
