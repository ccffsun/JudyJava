package leetCode;

import java.util.*;

public class LinkedListComponents {
    public int numComponents(ListNode head, int[] G) {
        if (head == null) return 0;

        List<Integer> listG = new ArrayList<>();
        for (int i : G) {
            listG.add(i);
        }

        int number = 0;
        ListNode curr = head;
        while (curr != null) {
            if (listG.size() != 0 && listG.contains(curr.val)) {
                while (listG.size() != 0 && listG.contains(curr.val)) {
                    listG.remove(new Integer(curr.val));
                    curr = curr.next;
                }
                number++;
            }
            if (curr != null) {
                curr = curr.next;
            }
        }
        return number;
    }

    public int numComponentsII(ListNode head, int[] G) {
        Set<Integer> gSet =new HashSet<>();
        for(int i:G) {
            gSet.add(i);
        }
        int number=0;
        while(head!=null){
            if (gSet.contains(head.val)&&(head.next==null||!gSet.contains(head.next.val))){
              number++;
            }
            head=head.next;
        }
        return number;
    }
    public int numComponentsIII(ListNode head, int []G){
        boolean [] vis=new boolean[10000];
        for(int i:G){
            vis[i]=true;
        }
        int number=0;
        while(head!=null){
            if(vis[head.val]&&((head.next==null)||!vis[head.next.val])){
              number++;
            }
            head=head.next;
        }
        return number;
    }
}
