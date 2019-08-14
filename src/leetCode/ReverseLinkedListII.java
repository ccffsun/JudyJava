package leetCode;

import java.util.Stack;

/* Reverse a linked list from position m to n. Do it in one-pass.

            Note: 1 ≤ m ≤ n ≤ length of list.

            Example:

    Input: 1->2->3->4->5->NULL, m = 2, n = 4
    Output: 1->4->3->2->5->NULL

    */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        ListNode f=dummy;
        if(m>1){
            for(int i=0;i<m-1;i++){ //the (m-1)th
                f=f.next ;
            }
        }

        ListNode out=f.next;
        ListNode curr=out;
        ListNode prev=null;
        for(int i=0;i<n-m+1;i++){
            ListNode temp =curr.next;
            curr.next=prev;
            prev = curr;
            curr = temp ;
        }
        out.next=curr;
        f.next=prev;
        return dummy.next;
    }

    public  ListNode reverseBetweenII(ListNode head, int m ,int n){
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        Stack<ListNode> stack=new Stack<>();
        for(int i=0;i<m-1;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        for(int i=0;i<=n-m;i++){
            stack.push(curr);
            curr=curr.next;
        }

        while(stack.size()>0){
            ListNode pop=stack.pop();
            prev.next=pop;
            prev=pop;
        }
        prev.next=curr;
        return dummy.next;
    }

}
