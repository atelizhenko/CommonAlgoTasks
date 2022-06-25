import util.ListNode;

import static util.ListNodeUtils.middle;

/**
 * Algorithm:
 * Traverse linked list using two-pointers.
 * Move one pointer by one and the other pointers by two.
 * When the fast pointer reaches the end, the slow pointer will reach the middle of the linked list.
 */
public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        return middle(head);
    }
}
