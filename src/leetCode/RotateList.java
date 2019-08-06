package leetCode;

import java.util.List;

public class RotateList {

    //Time Limit Exceeded!!!
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0) return head;

        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;


        for(int i=0;i<k;i++){
            ListNode curr=head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            ListNode temp=curr.next;
            prev.next=temp;
            temp.next=head;
            curr.next=null;
            head=temp;
        }
        return dummy.next;
    }

    public  ListNode rotateRightII(ListNode head, int k){
      if(head==null ||head.next==null||k==0) return head;

      ListNode dummy= new ListNode(0);
      ListNode prev=dummy;
      ListNode l=head;
      prev.next=head;
      int n=0;
      while(l!=null){
          l=l.next;
          n++;
      }

      k=k%n;

      if(k==0) return head;
      ListNode fast=head;
      ListNode slow=head;
      while(k>0){
          fast=fast.next;
          k--;
      }
      while (fast.next!=null){
          fast=fast.next;
          slow=slow.next;
      }
      prev.next=slow.next;
      fast.next=head;
      slow.next=null;
      return dummy.next;
    }

    public ListNode rotateRightIII(ListNode head, int k){
        if(head==null||head.next==null) return head;

        ListNode curr= head;
        ListNode end=head;
        int n=0;
        while(curr.next!=null){
        curr=curr.next;
        n++;
        }

        curr.next=head;
        k=k%n;

        for(int i=0;i<n-k-1;i++){
            end=end.next;
        }
        ListNode newHead=end.next;
        end.next=null;
        return newHead;
    }
}
