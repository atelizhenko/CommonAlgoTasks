import util.ListNode;

/**
 * Algorithm:
 * Traverse linked list using two-pointers.
 * Move one pointer by one and the other pointers by two.
 * When the fast pointer reaches the end, the slow pointer will reach the middle of the linked list.
 */

/**
 * Task link: <a href="https://leetcode.com/problems/middle-of-the-linked-list/">here</a>
 */
public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        return slowPointer;
    }
}
