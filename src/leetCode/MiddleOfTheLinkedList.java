package leetCode;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        if(head==null) return null;
        int n=0;
        ListNode curr=head;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        int mid=n/2;
        for(int i=0;i<mid;i++){
            head=head.next;
        }
        return head;
    }
}
