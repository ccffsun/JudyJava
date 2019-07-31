package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
