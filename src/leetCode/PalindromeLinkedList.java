package leetCode;

//Given a singly linked list, determine if it is a palindrome.
//
//Example 1:
//
//Input: 1->2
//Output: false
//Example 2:
//
//Input: 1->2->2->1
//Output: true

import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> palindromeStack = new Stack<>();
        if (head == null || head.next == null) return true;
        //know the length of the list
        int l=0;
        ListNode curr = head;
        while (curr != null) {
            l++;
            curr=curr.next;
        }
        //push the first half to the stack
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<l/2;i++){
            stack.push(head.val);
            head=head.next;
        }
        ListNode start=null;
        //pop the first half and compare to the second half
        if(l%2==0) {
           start=head;
        }else {
            start=head.next;
        }
        while(!stack.isEmpty()){
            if(stack.pop()!=start.val){
                return false;
            }
            start=start.next;
        }
        return true;
    }
//Example :
//1-> 2-> 3-> 4-> 2-> 1
//
//ref points 1 initially.
//Make recursive calls until you reach the last element - 1.
//On returning from each recurssion, check if it is equal to ref values.
//ref values are updated to on each recurssion.
//So first check is ref 1 -  end 1
//Second ref 2 - second last 2 ...and so on.

    private ListNode ref;
    public boolean isPalindromeII(ListNode head) {
        ref=head;
        return check(head);

    }
    private boolean check(ListNode node){
        if(node==null) return true;
        boolean ans =check(node.next);
        boolean isEqual= ref.val==node.val;
        ref=ref.next;
        return ans&&isEqual;
    }
}