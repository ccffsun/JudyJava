package leetCode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Given n will always be valid ----> we dont need to discuss n
    ListNode curr =head;
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode start=dummy;

    for(int i=1;i<n+1;i++){ //if i=0 i<n
        if(curr!=null){
            curr=curr.next;
        }
    }
    while(curr!=null){
        curr=curr.next;
        start=start.next;
    }
    ListNode target=start.next.next;
    start.next=target;
    return dummy.next;
    }
}
