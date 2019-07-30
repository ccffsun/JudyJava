package leetCode;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = dummy.next = insertionSortList(head.next);//insertionSortList use only once


        while (curr != null && head.val > curr.val) {
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = head;
        head.next = curr;


        return dummy.next;
    }

    public ListNode insertSortListII(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        //ListNode prev = dummy;
        dummy.next = head;
        ListNode curr = dummy.next;
        ListNode temp = curr.next;
        while (curr.next != null) {

            if ( temp.val>=curr.val) {
                curr = curr.next;
            } else {
                curr.next = temp.next;
                ListNode prev = dummy;
                while (temp.val > prev.next.val) {
                    prev = prev.next;
                }
                temp.next = prev.next;
                prev.next = temp;
            }

        }
        return dummy.next;
    }

}
