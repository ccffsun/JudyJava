package leetCode;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
     ListNode dummy=new ListNode(0);
     dummy.next=head;
     ListNode prev=dummy;
     ListNode curr=head;
     while(curr!=null &&curr.val<x){
         prev=prev.next;
         curr=curr.next;
     }
     if(curr==null) return head;//all the ListNode less than x
     ListNode less =prev;
     ListNode greater=curr;
     ListNode body=curr.next;
     while(body!=null){
         if(body.val<x){
             less.next=body;
             less=body; //less should be refresh every time
         }
         else{
             greater.next=body;
             greater=body;//greater should be refresh every time
         }
         body=body.next;
     }
     less.next=curr;
     greater.next=null;
     return dummy.next;
    }

    public ListNode partitionII(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0);
        ListNode curr1 = dummy1, curr2 = dummy2;
        while (head != null) {
            if (head.val < x) {
                curr1.next = head;
                curr1 = head;
            } else {
                curr2.next = head;
                curr2 = head;
            }
            head = head.next;
        }

        curr2.next=null;
        curr1.next=dummy2.next;
        return dummy1.next;
    }
}
