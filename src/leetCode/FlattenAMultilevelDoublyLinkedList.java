package leetCode;


//You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure, as shown in the example below.
//
//Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.
//
//
//
//Example:
//
//Input:
// 1---2---3---4---5---6--NULL
//         |
//         7---8---9---10--NULL
//             |
//             11--12--NULL
//
//Output:
//1-2-3-7-8-11-12-9-10-4-5-6-NULL



public class FlattenAMultilevelDoublyLinkedList {
    public Node2 flatten(Node2 head) {
        flattentail(head);
        return head;
    }

    // flattentail: flatten the node "head" and return the tail in its child (if exists)
    // the tail means the last node after flattening "head"

    // Five situations:
    // 1. null - no need to flatten, just return it
    // 2. no child, no next - no need to flatten, it is the last element, just return it
    // 3. no child, next - no need to flatten, go next
    // 4. child, no next - flatten the child and done
    // 5. child, next - flatten the child, connect it with the next, go next

    private Node2 flattentail(Node2 head) {
        if (head == null) return head; // CASE 1
        if (head.child == null) {
            if (head.next == null) return head; // CASE 2
            return flattentail(head.next); // CASE 3
        } else {
            Node2 child = head.child;
            head.child = null;
            Node2 next = head.next;
            Node2 childtail = flattentail(child);
            head.next = child;
            child.prev = head;
            if (next != null) { // CASE 5
                childtail.next = next;
                next.prev = childtail;
                return flattentail(next);
            }
            return childtail; // CASE 4
        }
    }



    //global variable to track the last node of the we visit
     private Node2 pre;    //global  variable
     public Node2 flatten2(Node2 head){
        if(head==null) return head;
        /*Connect last visted node with current node */
        if(pre!=null){
            pre.next=head;
            head.prev=pre;
        }
         pre=head;
         //*Store head.next in a next pointer in case recursive
         // call to flatten head.child overrides head.next*/
         Node2 next=head.next;
         flatten2(head.child);
         head.child=null;
         flatten2(next);
         return head;
     }
}