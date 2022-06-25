import util.ListNode;

import java.util.Objects;

import static util.ListNodeUtils.middle;
import static util.ListNodeUtils.reverse;

/**
 * Algorithm:
 * Traverse linked list using two-pointers.
 * Move one pointer by one and the other pointers by two.
 * When the fast pointer reaches the end, the slow pointer will reach the middle of the linked list.
 */
public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(4, listNode3);
        ListNode listNode5 = new ListNode(5, listNode4);
        ListNode listNode6 = new ListNode(6, listNode5);

        listNode1 = reverse(listNode6);

        System.out.printf("Inout: %s%n", "[1, 2, 3, 4, 5, 6]");
        System.out.printf("Output: %s%n", middleOfTheLinkedList.middleNode(listNode1));
    }

    public ListNode middleNode(ListNode head) {
        return middle(head);
    }
}
