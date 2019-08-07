package leetCode;

public class DeleteANodeInLinkedList {
    public void deleteNode(ListNode node) {  //just delete this node
     node.val=node.next.val;
     ListNode temp=node.next.next;
     node.next=temp;
    }
}
