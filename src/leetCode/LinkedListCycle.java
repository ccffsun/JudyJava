package leetCode;

//141 Leetcode Linked list cycle
// fast and slow pointers  or two pointers
//Time complexity : O(n)O(n). Let us denote nn as the total number of nodes in the linked list. To analyze its time complexity, we consider the following two cases separately.
//
//List has no cycle:
//The fast pointer reaches the end first and the run time depends on the list's length, which is O(n)O(n).
//
//List has a cycle:
//We break down the movement of the slow pointer into two steps, the non-cyclic part and the cyclic part:
//
//The slow pointer takes "non-cyclic length" steps to enter the cycle. At this point, the fast pointer has already reached the cycle. \text{Number of iterations} = \text{non-cyclic length} = NNumber of iterations=non-cyclic length=N
//
//Both pointers are now in the cycle. Consider two runners running in a cycle - the fast runner moves 2 steps while the slow runner moves 1 steps at a time. Since the speed difference is 1, it takes \dfrac{\text{distance between the 2 runners}}{\text{difference of speed}}
//difference of speed
//distance between the 2 runners
//​
//  loops for the fast runner to catch up with the slow runner. As the distance is at most "\text{cyclic length K}cyclic length K" and the speed difference is 1, we conclude that
//\text{Number of iterations} = \text{almost}Number of iterations=almost "\text{cyclic length K}cyclic length K".
//
//Therefore, the worst case time complexity is O(N+K)O(N+K), which is O(n)O(n).

import java.util.HashSet;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
       ListNode fast =head;
        ListNode slow =head;
        while (fast!=null&&slow!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

//HashSet<ListNode>
// Time complexity : O(n)O(n). We visit each of the nn elements in the list at most once.
// Adding a node to the hash table costs only O(1)O(1) time.
    public boolean hasCycleHashset (ListNode head){
        HashSet<ListNode> isCycle =new HashSet<>();
        while (head!=null){
            if(isCycle.contains(head)){
                return true;
            }
            else isCycle.add(head);
            head=head.next;
        }
        return false;
    }
}


