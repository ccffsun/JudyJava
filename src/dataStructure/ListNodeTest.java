package dataStructure;

public class ListNodeTest {
    public void  ListNodePractise () {
        printList(setup());
    }

    public void printList(ListNode node){
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode setup(){
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);

        ListNode ln3 = new ListNode(3);
        ln1.next = ln2;
        ln2.next = ln3;

        return ln1;
    }

}
