package leetCode;

import java.util.HashMap;
import java.util.Stack;

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head==null) return;
        HashMap<Integer,ListNode> map =new HashMap();
        ListNode fast =head;
        ListNode slow =head;
        int i=0;
        while(fast!=null){
            map.put(i,fast);
            fast=fast.next;
            i++;
        }
        int n=i-1;
        for(i=n;i>(n+1)/2;i--){
            ListNode insert =map.get(i);
            ListNode temp =slow.next;
            slow.next=insert;
            insert.next=temp;
            slow=temp;
        }
        if(n%2==0){
            slow.next=null;
        }
        else slow.next.next=null;
    }

    public  void reorderListII(ListNode head){
        if(head==null) return;
        ListNode fast=head;
        ListNode slow=head;
        ListNode [] map= new ListNode[50000];
        int i=0;
        while(fast!=null){
            map[i++]=fast;
            fast=fast.next;
        }
        int n=i-1;
        for(i=n;i>(n+1)/2;i--){
            map[n-i].next=map[i];
            map[i].next=map[n-i+1];
        }
        if(n%2==0){
            map[n-i].next=null;
        }
        else{
            map[n-i].next.next=null;
        }
    }
    public void  reorderListIII(ListNode head){
        if(head==null) return;
        ListNode p=head;
        Stack<ListNode>stack=new Stack<>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        int n=stack.size();
        while (stack.size()>n/2+1){
            ListNode pop=stack.pop();
            ListNode temp=p.next;
            p.next=pop;
            pop.next=temp;
            p=temp;
        }
        if(n%2!=0){
            p.next=null;
        }
        else p.next.next=null;
    }
}