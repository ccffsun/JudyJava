package leetCode;

public class ConvertSortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        if(head.next==null){
            return new TreeNode(head.val);
        }

        int n=0;
        ListNode curr=head;
        while (curr!=null){
            curr=curr.next;
            n++;
        }
        int k=n/2;
        ListNode dummy=new ListNode(0),prev=dummy;
        prev.next=head;
        ListNode mid=head;
        while(k>0){
            mid=mid.next;
            prev=prev.next;
            k--;
        }
        prev.next=null;

        TreeNode root= new TreeNode(mid.val);
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(mid.next);

        return root;
    }
}
