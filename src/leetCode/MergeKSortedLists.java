package leetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    /*
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null||lists.length==0) return null;

        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        int x = -1;
        int k = lists.length - 1;
        while (k != 0) {
            int min = Integer.MAX_VALUE;//min value should initial everytime
            for (int i = 0; i <= k; i++) {
                if(lists[i]==null) continue;
                if (lists[i].val < min) {
                    x = i;
                    min = lists[i].val;
                }
            }
            if(x==-1) return null;

            prev.next = lists[x];
            prev = prev.next;
            if(lists[x].next==null){
                lists[x].next=lists[k]; //after link the lists[k] ,also do the lists[x]=list[x].next
                k--;
            }
            if(lists[x]!=null) {
                lists[x] = lists[x].next;
            }
            else return dummy.next;
        }
        prev.next=lists[0];
        return dummy.next;
    }

     */
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0){
          return null;
        }
        if(lists.length==1) return lists[0];
        PriorityQueue<ListNode> heap= new PriorityQueue<>(new Comparator<ListNode>(){
                    public int compare(ListNode o1,ListNode o2){
                        return o1.val-o2.val;
                    }
                }
        );
        ListNode head=new ListNode(0), rear=head;
        head.next=null;
        for(ListNode node : lists){
            if(node!=null){
                heap.offer(node);
            }
        }
        while(!heap.isEmpty()){
            ListNode p=heap.poll();
            rear.next=p;
            rear=rear.next;
            p=p.next;
            if(p!=null){
                heap.offer(p);
            }
        }
        //heap is empty
        rear.next=null;
        return head.next;
    }

    public ListNode mergeKListsII(ListNode[] lists){
        return partion(lists,0,lists.length-1);
    }
    public ListNode partion(ListNode[] lists,int s,int e){
        if(s==e) return lists[s];
        if(s<e){
            int mid=(s+e)/2;
            ListNode left=partion(lists, s, mid);
            ListNode right=partion(lists,mid+1,e);
            return merge(left,right);
        }else{
            return null;
        }
    }
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return  l1;
        if(l1.val<l2.val){
            l1.next=merge(l1.next,l2);
            return l1;
        }
        else{
            l2.next=merge(l1,l2.next);
            return l2;
        }
    }
}
