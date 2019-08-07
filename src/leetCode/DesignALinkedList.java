package leetCode;

public class DesignALinkedList {
    class node {
        node next;
        int val;

        public node(int x) {
            val = x;
        }

    }

    node currHead;
    node currTail;
    int size;

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
        if (index > size) return -1;
        node walker = currHead;
        while (walker != null && index > 1) {
            walker = walker.next;
            index--;
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
            currTail = currHead;
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
        if (index > size) return;
        node dele = currHead;
        if (index == 1) {
            currHead = currHead.next;

        } else {
            for (int i = 0; i < index - 1; i++) {
                dele = dele.next;
            }
            node temp = dele.next.next;
            dele.next = temp;
            if (temp == null) {
                currTail = dele;
            }
        }
        size--;
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
}
