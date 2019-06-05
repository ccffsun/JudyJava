package dataStructure;

public class ListNodeTest {
    public ListNode  ListNodePractise () {
        /*
        ListNode ln1 = new ListNode();
        ListNode ln2 = new ListNode();
        ListNode ln3 = new ListNode();
        ln1.val=1;
        ln1.next=ln2;
        ln2.val=2;
        ln2.next=ln3;
        ln3.val=3;
        ln3.next=null;
         */
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ln1.next = ln2;
        ln2.next = ln3;
        return ln1;

    }

    public void printList(ListNode node){
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }

}
