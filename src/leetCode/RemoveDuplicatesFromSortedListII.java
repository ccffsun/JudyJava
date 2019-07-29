package leetCode;

import org.w3c.dom.ls.LSInput;

public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        ListNode h = dummy;
        ListNode curr = head;
        if (head == null || head.next == null) return head;

        ListNode t = curr.next;

        while (t.next != null) {
            if (curr.val != t.val) {
                h.next = curr;
                h = curr;
                curr = t;
                t = t.next;
            } else {
                while (t!=null&&curr.val == t.val) {
                    curr = t;
                    t = t.next;
                }
                if(t==null) {
                    h.next=null;
                    return dummy.next;
                }
                if (t.next == null) {
                    h.next = t;
                    return dummy.next;
                } else {
                    curr = t;
                    t = t.next;
                }
            }
        }

        if (curr.val == t.val) {
            h.next=null;
            return dummy.next;
        } else {
            h.next = curr;
            return dummy.next;
        }
    }

    public ListNode removeDuplicats(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy;
        ListNode fast = head;
        dummy.next=head;
        while (fast != null) {
            while (fast.next != null && fast.val == fast.next.val) {
                    fast = fast.next;
                }
                if (slow.next != fast) {
                    slow.next = fast.next;
                    fast = fast.next;
                }
             else {
                fast = fast.next;
                slow = slow.next;
            }

        }
        return dummy.next;
    }

    public ListNode removeDuplicatsRecursion(ListNode head){
        if(head==null) return null;
        if(head.next!=null&&head.val==head.next.val){
            while(head.next!=null&&head.val==head.next.val){
                head=head.next;
            }
            return removeDuplicatsRecursion(head.next);
        }
        else{
            head.next=removeDuplicatsRecursion(head.next);
        }
        return head;
    }

}
