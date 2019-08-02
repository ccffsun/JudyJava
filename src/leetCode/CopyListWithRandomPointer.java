package leetCode;

//A linked list is given such that each node contains an additional random pointer which
// could point to any node in the list or null.
//Return a deep copy of the list.

import java.util.HashMap;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();
        Node curr=head;
        while(curr!=null){
            map.put(curr,new Node(curr.val,curr.next,curr.random));
            curr=curr.next;
        }

        Node dummy=map.get(head);
        curr=head;
        while(curr!=null){
            map.get(curr).next=map.get(curr.next);
            map.get(curr).random=map.get(curr.random);
            curr=curr.next;
        }
        return dummy;
    }
}
