package leetCode;
//Given a (singly) linked list with head node root, write a function to split the linked list into k consecutive linked list "parts".
//
//The length of each part should be as equal as possible: no two parts should have a size differing by more than 1. This may lead to some parts being null.
//
//The parts should be in order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal parts occurring later.
//
//Return a List of ListNode's representing the linked list parts that are formed.
//
//Examples 1->2->3->4, k = 5 // 5 equal parts [ [1], [2], [3], [4], null ]
//Example 1:
//Input:
//root = [1, 2, 3], k = 5
//Output: [[1],[2],[3],[],[]]
//Explanation:
//The input and each element of the output are ListNodes, not arrays.
//For example, the input root has root.val = 1, root.next.val = 2, \root.next.next.val = 3, and root.next.next.next = null.
//The first element output[0] has output[0].val = 1, output[0].next = null.
//The last element output[4] is null, but it's string representation as a ListNode is [].

public class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int l = length(root);
        int q = l / k;//quotient (0,1,2,3....)
        int r = l % k;//reminder(0,1,2...k-1)
        int i = 0;
        //if q=0,there are k lists,l not null,have only one ListNode,k-l null
        //if q>0,there are k lists,there are r lists have q+1 ListNodes ,the rest have q ListNodes
        while (root != null) {
            i=root.val;
            ListNode node = new ListNode(i);

            root=root.next;
        }
    }
    private int length(ListNode node) {
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }

}
