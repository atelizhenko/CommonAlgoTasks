import org.junit.jupiter.api.Test;
import util.ListNode;
import util.ListNodeUtils;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {
    @Test
    void testMiddleLinkedListWithOddLength() {
        ListNode head = new ListNode(1);
        ListNode secondNode = new ListNode(2, head);
        ListNode thirdNode = new ListNode(3, secondNode);
        ListNode fourthNode = new ListNode(4, thirdNode);
        ListNode fifthNode = new ListNode(5, fourthNode);
        ListNode sixthNode = new ListNode(6, fifthNode);

        head = ListNodeUtils.reverse(sixthNode);

        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();
        assertEquals(fourthNode, middleOfTheLinkedList.middleNode(head));
    }

    @Test
    void testMiddleLinkedListWithEvenLength() {
        ListNode head = new ListNode(1);
        ListNode secondNode = new ListNode(2, head);
        ListNode thirdNode = new ListNode(3, secondNode);
        ListNode fourthNode = new ListNode(4, thirdNode);
        ListNode fifthNode = new ListNode(5, fourthNode);

        head = ListNodeUtils.reverse(fifthNode);

        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();
        assertEquals(thirdNode, middleOfTheLinkedList.middleNode(head));
    }
}