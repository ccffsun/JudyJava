package leetCode;
//Sort a linked list in O(n log n) time using constant space complexity.
//
//Example 1:
//
//Input: 4->2->1->3
//Output: 1->2->3->4
//Example 2:
//
//Input: -1->5->3->4->0
//Output: -1->0->3->4->5

import java.util.List;

//recursion + merge sort
public class SortList {
    public ListNode sortList(ListNode head) {

        if(head==null||head.next==null) return head;
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        ListNode slow=head;
        ListNode fast=head;
        //step1 cut the list to two halves
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        //step2 sort the two list
        ListNode l1=sortList(head);
        ListNode l2=sortList(slow);
        //step3 merge the two list
        return mergeSort(l1,l2);
    }

    private ListNode mergeSort(ListNode l1,ListNode l2){
        ListNode l=new ListNode(0);
        ListNode p=l;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                p.next=l1;
                l1=l1.next;
            }
            else{
                p.next=l2;
                l2=l2.next;
            }
            p=p.next;
        }
        if(l1==null) p.next=l2;
        if(l2==null) p.next=l1;
        return l.next;
    }

}
