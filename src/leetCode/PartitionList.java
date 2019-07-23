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
}
