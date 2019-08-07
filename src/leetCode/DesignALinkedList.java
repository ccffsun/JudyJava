package leetCode;

public class DesignALinkedList {
    class node {
        node next;
        int val;

        public node(int x) {
            val = x;
        }

    }

    private node currHead;
    private node currTail;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public DesignALinkedList() {
        currHead = null;
        currTail = null;
        size = 0;

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index >= size) return -1;
        node walker = currHead;
        for (int i = 0; i < index; i++) {
            walker = walker.next;
        }
        return walker.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        node newHead = new node(val);
        newHead.next = currHead;
        // update the currHead ,currTail and size every time
        currHead = newHead;
        if (currTail == null) currTail = currHead;
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        node newTail = new node(val);
        if (currTail != null) {
            currTail.next = newTail;

        } else {
            currHead = newTail;
        }
        currTail = newTail;
        size++;

    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index == size) {
            addAtTail(val);
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }

        node insert = new node(val);
        node curr = currHead;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        node temp = curr.next;
        curr.next = insert;
        insert.next = temp;
        size++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (size == 0) return;
        if (index >= size) return;

        if (index == 0) {
            if (size == 1) {
                size = 0;
                currHead = null;
                currTail = null;
                return;
            }
            currHead = currHead.next;
            size--;
            return;
        }


            node curr = currHead;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            if (index == size - 1) {
                currTail = curr;
                currTail.next = null;
                size--;
                return;
            }
            node temp = curr.next;
            curr.next = temp.next;

            size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

