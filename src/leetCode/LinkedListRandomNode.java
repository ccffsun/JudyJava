package leetCode;

import java.util.Random;

public class LinkedListRandomNode {
    private Random random;
    private ListNode node;

    public LinkedListRandomNode(ListNode head) {
        random = new Random();
        node = head;
    }

    public int getRandom() {
        int n = 0;
        ListNode curr = node;
        while (curr != null) {
            n++;
            curr = curr.next;
        }
        ListNode fakeHead = node;
        int r = random.nextInt(n);//不要直接写在for loop中
        for (int i = 0; i < r; i++) {
            fakeHead = fakeHead.next;
        }
        return fakeHead.val;
    }

    public int getRandomII() {
        int count = 0;
        int result = -1;
        ListNode curr = node;
        while (curr != null) {
            if (random.nextInt(++count) == 0) {//每走一步概率都在改变
                result = curr.val;
            }
            curr = curr.next;
        }
        return result;
    }
}
